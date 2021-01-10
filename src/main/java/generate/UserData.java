package generate;

import org.apache.hadoop.fs.Path;
import org.apache.parquet.hadoop.ParquetWriter;
import org.apache.parquet.hadoop.metadata.CompressionCodecName;
import org.apache.parquet.proto.ProtoParquetWriter;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

public class UserData {
    public static void main(String[] args) throws IOException {
        int pageSize = 4 * 1024 * 1024;
        Path filePath = new Path("hbase/user.parquet");
        Record.User.Builder b = Record.User.newBuilder();
        Supplier<Record.User> generator = () -> {
            Record.User.Builder builder = Record.User.newBuilder();
            Random rand = new Random();
            builder.setFirstName(RandomString.getAlphaNumericString(rand.nextInt(50) + 10));
            builder.setLastName(RandomString.getAlphaNumericString(rand.nextInt(50) + 10));
            builder.setWeight(rand.nextInt(50) + 10);
            List<String> address = new ArrayList<>();
            address.add(RandomString.getAlphaNumericString(rand.nextInt(30) + 10));
            address.add(RandomString.getAlphaNumericString(rand.nextInt(30) + 10));
            address.add(RandomString.getAlphaNumericString(rand.nextInt(30) + 10));
            address.add(RandomString.getAlphaNumericString(rand.nextInt(30) + 10));
            builder.addAllAddress(address);
            return builder.build();
        };
        try (ParquetWriter<Record.User> writer = new ProtoParquetWriter<Record.User>(filePath, Record.User.class, CompressionCodecName.SNAPPY , 32*pageSize, pageSize)) {
        for (int i = 0; i < 5_000; i++){
                    writer.write(generator.get());
            }
        }
    }


}
