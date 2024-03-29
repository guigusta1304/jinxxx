// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSceneJumpRsp.proto

package emu.grasscutter.net.proto;

public final class HomeSceneJumpRspOuterClass {
  private HomeSceneJumpRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSceneJumpRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSceneJumpRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool isEnterRoomScene = 1;</code>
     * @return The isEnterRoomScene.
     */
    boolean getIsEnterRoomScene();

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code HomeSceneJumpRsp}
   */
  public static final class HomeSceneJumpRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSceneJumpRsp)
      HomeSceneJumpRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSceneJumpRsp.newBuilder() to construct.
    private HomeSceneJumpRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSceneJumpRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSceneJumpRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.internal_static_HomeSceneJumpRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.internal_static_HomeSceneJumpRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.class, emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeSceneJumpRsp.BCOGMNPNJPD}
     */
    public enum BCOGMNPNJPD
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4822;</code>
       */
      PEPPOHPHJOJ(1, 4822),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final BCOGMNPNJPD DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4822;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4822;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;


      public final int getNumber() {
        if (index == -1) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static BCOGMNPNJPD valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static BCOGMNPNJPD forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4822: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<BCOGMNPNJPD>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          BCOGMNPNJPD> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<BCOGMNPNJPD>() {
              public BCOGMNPNJPD findValueByNumber(int number) {
                return BCOGMNPNJPD.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        if (index == -1) {
          throw new java.lang.IllegalStateException(
              "Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final BCOGMNPNJPD[] VALUES = getStaticValuesArray();
      private static BCOGMNPNJPD[] getStaticValuesArray() {
        return new BCOGMNPNJPD[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static BCOGMNPNJPD valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int index;
      private final int value;

      private BCOGMNPNJPD(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeSceneJumpRsp.BCOGMNPNJPD)
    }

    public static final int ISENTERROOMSCENE_FIELD_NUMBER = 1;
    private boolean isEnterRoomScene_ = false;
    /**
     * <code>bool isEnterRoomScene = 1;</code>
     * @return The isEnterRoomScene.
     */
    @java.lang.Override
    public boolean getIsEnterRoomScene() {
      return isEnterRoomScene_;
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (isEnterRoomScene_ != false) {
        output.writeBool(1, isEnterRoomScene_);
      }
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isEnterRoomScene_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isEnterRoomScene_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp other = (emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp) obj;

      if (getIsEnterRoomScene()
          != other.getIsEnterRoomScene()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ISENTERROOMSCENE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnterRoomScene());
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code HomeSceneJumpRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSceneJumpRsp)
        emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.internal_static_HomeSceneJumpRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.internal_static_HomeSceneJumpRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.class, emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        isEnterRoomScene_ = false;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.internal_static_HomeSceneJumpRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp build() {
        emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp buildPartial() {
        emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp result = new emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.isEnterRoomScene_ = isEnterRoomScene_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.retcode_ = retcode_;
        }
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp other) {
        if (other == emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp.getDefaultInstance()) return this;
        if (other.getIsEnterRoomScene() != false) {
          setIsEnterRoomScene(other.getIsEnterRoomScene());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                isEnterRoomScene_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private boolean isEnterRoomScene_ ;
      /**
       * <code>bool isEnterRoomScene = 1;</code>
       * @return The isEnterRoomScene.
       */
      @java.lang.Override
      public boolean getIsEnterRoomScene() {
        return isEnterRoomScene_;
      }
      /**
       * <code>bool isEnterRoomScene = 1;</code>
       * @param value The isEnterRoomScene to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnterRoomScene(boolean value) {
        
        isEnterRoomScene_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bool isEnterRoomScene = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnterRoomScene() {
        bitField0_ = (bitField0_ & ~0x00000001);
        isEnterRoomScene_ = false;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HomeSceneJumpRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeSceneJumpRsp)
    private static final emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp();
    }

    public static emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSceneJumpRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeSceneJumpRsp>() {
      @java.lang.Override
      public HomeSceneJumpRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<HomeSceneJumpRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSceneJumpRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSceneJumpRspOuterClass.HomeSceneJumpRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSceneJumpRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSceneJumpRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026HomeSceneJumpRsp.proto\"\216\001\n\020HomeSceneJu" +
      "mpRsp\022\030\n\020isEnterRoomScene\030\001 \001(\010\022\017\n\007retco" +
      "de\030\002 \001(\005\"O\n\013BCOGMNPNJPD\022\010\n\004NONE\020\000\022\020\n\013PEP" +
      "POHPHJOJ\020\326%\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMP" +
      "OEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_HomeSceneJumpRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSceneJumpRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSceneJumpRsp_descriptor,
        new java.lang.String[] { "IsEnterRoomScene", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
