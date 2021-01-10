package generate;

public final class Record {
  private Record() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // required string first_name = 1;
    /**
     * <code>required string first_name = 1;</code>
     */
    boolean hasFirstName();
    /**
     * <code>required string first_name = 1;</code>
     */
    java.lang.String getFirstName();
    /**
     * <code>required string first_name = 1;</code>
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    // required string last_name = 2;
    /**
     * <code>required string last_name = 2;</code>
     */
    boolean hasLastName();
    /**
     * <code>required string last_name = 2;</code>
     */
    java.lang.String getLastName();
    /**
     * <code>required string last_name = 2;</code>
     */
    com.google.protobuf.ByteString
        getLastNameBytes();

    // required int32 weight = 3;
    /**
     * <code>required int32 weight = 3;</code>
     */
    boolean hasWeight();
    /**
     * <code>required int32 weight = 3;</code>
     */
    int getWeight();

    // repeated string address = 4;
    /**
     * <code>repeated string address = 4;</code>
     */
    java.util.List<java.lang.String>
    getAddressList();
    /**
     * <code>repeated string address = 4;</code>
     */
    int getAddressCount();
    /**
     * <code>repeated string address = 4;</code>
     */
    java.lang.String getAddress(int index);
    /**
     * <code>repeated string address = 4;</code>
     */
    com.google.protobuf.ByteString
        getAddressBytes(int index);
  }
  /**
   * Protobuf type {@code User}
   */
  public static final class User extends
      com.google.protobuf.GeneratedMessage
      implements UserOrBuilder {
    // Use User.newBuilder() to construct.
    private User(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private User(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final User defaultInstance;
    public static User getDefaultInstance() {
      return defaultInstance;
    }

    public User getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private User(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              firstName_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              lastName_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              weight_ = input.readInt32();
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                address_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              address_.add(input.readBytes());
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = new com.google.protobuf.UnmodifiableLazyStringList(address_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Record.internal_static_User_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Record.internal_static_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Record.User.class, Record.User.Builder.class);
    }

    public static com.google.protobuf.Parser<User> PARSER =
        new com.google.protobuf.AbstractParser<User>() {
      public User parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new User(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<User> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // required string first_name = 1;
    public static final int FIRST_NAME_FIELD_NUMBER = 1;
    private java.lang.Object firstName_;
    /**
     * <code>required string first_name = 1;</code>
     */
    public boolean hasFirstName() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required string first_name = 1;</code>
     */
    public java.lang.String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          firstName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string first_name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required string last_name = 2;
    public static final int LAST_NAME_FIELD_NUMBER = 2;
    private java.lang.Object lastName_;
    /**
     * <code>required string last_name = 2;</code>
     */
    public boolean hasLastName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string last_name = 2;</code>
     */
    public java.lang.String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          lastName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string last_name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // required int32 weight = 3;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private int weight_;
    /**
     * <code>required int32 weight = 3;</code>
     */
    public boolean hasWeight() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 weight = 3;</code>
     */
    public int getWeight() {
      return weight_;
    }

    // repeated string address = 4;
    public static final int ADDRESS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList address_;
    /**
     * <code>repeated string address = 4;</code>
     */
    public java.util.List<java.lang.String>
        getAddressList() {
      return address_;
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public int getAddressCount() {
      return address_.size();
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public java.lang.String getAddress(int index) {
      return address_.get(index);
    }
    /**
     * <code>repeated string address = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAddressBytes(int index) {
      return address_.getByteString(index);
    }

    private void initFields() {
      firstName_ = "";
      lastName_ = "";
      weight_ = 0;
      address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      if (!hasFirstName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasLastName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasWeight()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, weight_);
      }
      for (int i = 0; i < address_.size(); i++) {
        output.writeBytes(4, address_.getByteString(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, weight_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < address_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(address_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getAddressList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static Record.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Record.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Record.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static Record.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static Record.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Record.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static Record.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static Record.User parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static Record.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static Record.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Record.User prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code User}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Record.UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Record.internal_static_User_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Record.internal_static_User_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                Record.User.class, Record.User.Builder.class);
      }

      // Construct using Record.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        firstName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        lastName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        weight_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Record.internal_static_User_descriptor;
      }

      public Record.User getDefaultInstanceForType() {
        return Record.User.getDefaultInstance();
      }

      public Record.User build() {
        Record.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public Record.User buildPartial() {
        Record.User result = new Record.User(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.firstName_ = firstName_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.lastName_ = lastName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.weight_ = weight_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = new com.google.protobuf.UnmodifiableLazyStringList(
              address_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.address_ = address_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Record.User) {
          return mergeFrom((Record.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(Record.User other) {
        if (other == Record.User.getDefaultInstance()) return this;
        if (other.hasFirstName()) {
          bitField0_ |= 0x00000001;
          firstName_ = other.firstName_;
          onChanged();
        }
        if (other.hasLastName()) {
          bitField0_ |= 0x00000002;
          lastName_ = other.lastName_;
          onChanged();
        }
        if (other.hasWeight()) {
          setWeight(other.getWeight());
        }
        if (!other.address_.isEmpty()) {
          if (address_.isEmpty()) {
            address_ = other.address_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureAddressIsMutable();
            address_.addAll(other.address_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasFirstName()) {
          
          return false;
        }
        if (!hasLastName()) {
          
          return false;
        }
        if (!hasWeight()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        Record.User parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (Record.User) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // required string first_name = 1;
      private java.lang.Object firstName_ = "";
      /**
       * <code>required string first_name = 1;</code>
       */
      public boolean hasFirstName() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required string first_name = 1;</code>
       */
      public java.lang.String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string first_name = 1;</code>
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        java.lang.Object ref = firstName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string first_name = 1;</code>
       */
      public Builder setFirstName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        firstName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string first_name = 1;</code>
       */
      public Builder clearFirstName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      /**
       * <code>required string first_name = 1;</code>
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        firstName_ = value;
        onChanged();
        return this;
      }

      // required string last_name = 2;
      private java.lang.Object lastName_ = "";
      /**
       * <code>required string last_name = 2;</code>
       */
      public boolean hasLastName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string last_name = 2;</code>
       */
      public java.lang.String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string last_name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        java.lang.Object ref = lastName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string last_name = 2;</code>
       */
      public Builder setLastName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        lastName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string last_name = 2;</code>
       */
      public Builder clearLastName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      /**
       * <code>required string last_name = 2;</code>
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        lastName_ = value;
        onChanged();
        return this;
      }

      // required int32 weight = 3;
      private int weight_ ;
      /**
       * <code>required int32 weight = 3;</code>
       */
      public boolean hasWeight() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>required int32 weight = 3;</code>
       */
      public int getWeight() {
        return weight_;
      }
      /**
       * <code>required int32 weight = 3;</code>
       */
      public Builder setWeight(int value) {
        bitField0_ |= 0x00000004;
        weight_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 weight = 3;</code>
       */
      public Builder clearWeight() {
        bitField0_ = (bitField0_ & ~0x00000004);
        weight_ = 0;
        onChanged();
        return this;
      }

      // repeated string address = 4;
      private com.google.protobuf.LazyStringList address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureAddressIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          address_ = new com.google.protobuf.LazyStringArrayList(address_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public java.util.List<java.lang.String>
          getAddressList() {
        return java.util.Collections.unmodifiableList(address_);
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public int getAddressCount() {
        return address_.size();
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public java.lang.String getAddress(int index) {
        return address_.get(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAddressBytes(int index) {
        return address_.getByteString(index);
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder setAddress(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAddress(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAllAddress(
          java.lang.Iterable<java.lang.String> values) {
        ensureAddressIsMutable();
        super.addAll(values, address_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder clearAddress() {
        address_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string address = 4;</code>
       */
      public Builder addAddressBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureAddressIsMutable();
        address_.add(value);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:User)
    }

    static {
      defaultInstance = new User(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:User)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_User_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_User_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"N\n\004User\022\022\n\nfirst_name\030\001 \002(\t" +
      "\022\021\n\tlast_name\030\002 \002(\t\022\016\n\006weight\030\003 \002(\005\022\017\n\007a" +
      "ddress\030\004 \003(\tB\010B\006Record"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_User_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_User_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_User_descriptor,
              new java.lang.String[] { "FirstName", "LastName", "Weight", "Address", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
