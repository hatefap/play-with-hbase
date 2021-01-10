package mapreduce;

import com.google.protobuf.Message;
import com.google.protobuf.ServiceException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapreduce.HFileOutputFormat2;
import org.apache.hadoop.hbase.mapreduce.LoadIncrementalHFiles;
import org.apache.hadoop.hbase.mapreduce.TableMapReduceUtil;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.hdfs.web.HftpFileSystem;
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;
import org.apache.hadoop.yarn.server.utils.BuilderUtils;
import org.apache.parquet.example.data.Group;
import org.apache.parquet.hadoop.example.ExampleInputFormat;
import org.apache.parquet.schema.Type;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class PlayWithHbase extends Configured implements Tool {

    public static final int NUMBER_OF_REDUCERS = 30;
    public static final int PAGE_SIZE = 32 * 1024 * 1024;
    public static final int BLOCK_SIZE = 5 * PAGE_SIZE;
    private static final String TABLE_NAME = "hatefTable";
    private static final String COLUMN_FAMILY = "cf1";


    public static class ParquetMap extends Mapper<Void, Group, ImmutableBytesWritable, Put> {
        @Override
        public void map(Void key, Group value, Context context) throws IOException, InterruptedException {
            Type firstName = value.getType().getType("first_name");
            Type lastName = value.getType().getType("last_name");
            Type weight = value.getType().getType("weight");
            // work with array and map is a bit hard
            Type address = value.getType().getType("address");
            String hbaseKey = value.getString(firstName.getName(), 0) + value.getString(lastName.getName(), 0);
            int hbaseWeight = value.getInteger(weight.getName(), 0);
            // String firstAddress = value.getString(address.getName(), 0);

            final ImmutableBytesWritable HKey = new ImmutableBytesWritable(Bytes.toBytes(hbaseKey));
            Put row = new Put(Bytes.toBytes(hbaseKey));
            row.addColumn(Bytes.toBytes(COLUMN_FAMILY), Bytes.toBytes("weight"), Bytes.toBytes(hbaseWeight));
            System.out.println(hbaseWeight);
            //row.addColumn(Bytes.toBytes(COLUMN_FAMILY), Bytes.toBytes("address"), Bytes.toBytes(firstAddress));
            context.write(HKey, row);
        }
    }


//    public static class ParquetReducer extends Reducer<ImmutableBytesWritable, Put, ImmutableBytesWritable, Put> {
//        @Override
//        protected void setup(Context context) throws IOException, InterruptedException {
//            super.setup(context);
//        }
//
//        @Override
//        public void reduce(ImmutableBytesWritable key, Iterable<Put> values, Context context) throws IOException, InterruptedException {
//            // this is just sort the key and write those to hbase
//            // we just keep the last value from values
//            Iterator<Put> iter = values.iterator();
//            Put lastPut = null;
//            while (iter.hasNext()) {
//                lastPut = iter.next();
//                System.out.println(lastPut);
//            }
//            try {
//            context.write(key, lastPut);
//            } catch (Exception ex){
//                ex.printStackTrace();
//            }
//        }
//    }

    private Connection getConnection() throws IOException, ServiceException {
        Configuration config = HBaseConfiguration.create();

        String path = Objects.requireNonNull(this.getClass()
                .getClassLoader()
                .getResource("hbase-site.xml"))
                .getPath();
        config.addResource(new Path(path));
        HBaseAdmin.checkHBaseAvailable(config);
        return ConnectionFactory.createConnection(config);
    }

    private void setupHbase(String tableName, String... columnFamilies) throws IOException, ServiceException {
        Connection connection = getConnection();
        Admin admin = connection.getAdmin();
        if (admin.tableExists(TableName.valueOf(tableName))) return;
        HTableDescriptor desc = new HTableDescriptor(TableName.valueOf(tableName));
        Arrays.stream(columnFamilies).forEach(cf -> desc.addFamily(new HColumnDescriptor(cf)));
        admin.createTable(desc);
    }

    @Override
    public int run(String[] args) throws Exception {
        Files.deleteIfExists(Paths.get("output"));
        //setupHbase(TABLE_NAME, COLUMN_FAMILY);
        if (args.length != 2) {
            System.err.println("Invalid Command");
            System.exit(-1);
        }
        Configuration conf = new Configuration();

        Job job = Job.getInstance(conf);
        job.setJobName("sort parquet file");
        job.setJarByClass(PlayWithHbase.class);
        job.setSpeculativeExecution(false);
        job.setReduceSpeculativeExecution(false);
        job.setInputFormatClass(ExampleInputFormat.class);
        job.setOutputFormatClass(HFileOutputFormat2.class);

        job.setMapOutputKeyClass(ImmutableBytesWritable.class);
        job.setMapOutputValueClass(Put.class);


        FileInputFormat.addInputPath(job, new Path(args[0]));
        HFileOutputFormat2.setOutputPath(job, new Path(args[1]));


        Connection conn = getConnection();
        Admin admin = conn.getAdmin();
        job.setMapperClass(ParquetMap.class);
        // the following line set the reducer based on setMapOutputValueClass. if you want to write this your custom
        // reducer, consider setting the reducer output like this: ImmutableBytesWritable, KeyValue
        HFileOutputFormat2.configureIncrementalLoad(job, admin.getTableDescriptor(TableName.valueOf(TABLE_NAME)), conn.getRegionLocator(TableName.valueOf(TABLE_NAME)));

        int result = job.waitForCompletion(true) ? 0 : 1;
        if(result == 0){
            LoadIncrementalHFiles loader = new LoadIncrementalHFiles(conf);
            // loader.doBulkLoad(new Path(args[1]), );
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        int statusCode = ToolRunner.run(new PlayWithHbase(), args);
        System.exit(statusCode);
    }
}
