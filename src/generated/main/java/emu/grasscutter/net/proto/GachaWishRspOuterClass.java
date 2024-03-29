// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GachaWishRsp.proto

package emu.grasscutter.net.proto;

public final class GachaWishRspOuterClass {
  private GachaWishRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GachaWishRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GachaWishRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 wishProgress = 3;</code>
     * @return The wishProgress.
     */
    int getWishProgress();

    /**
     * <code>uint32 wishMaxProgress = 7;</code>
     * @return The wishMaxProgress.
     */
    int getWishMaxProgress();

    /**
     * <code>uint32 gachaType = 6;</code>
     * @return The gachaType.
     */
    int getGachaType();

    /**
     * <code>uint32 gachaScheduleId = 11;</code>
     * @return The gachaScheduleId.
     */
    int getGachaScheduleId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 wishItemId = 5;</code>
     * @return The wishItemId.
     */
    int getWishItemId();
  }
  /**
   * Protobuf type {@code GachaWishRsp}
   */
  public static final class GachaWishRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GachaWishRsp)
      GachaWishRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GachaWishRsp.newBuilder() to construct.
    private GachaWishRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GachaWishRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GachaWishRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code GachaWishRsp.COIIDDMDPIL}
     */
    public enum COIIDDMDPIL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 1574;</code>
       */
      PEPPOHPHJOJ(1, 1574),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final COIIDDMDPIL DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 1574;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 1574;
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
      public static COIIDDMDPIL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static COIIDDMDPIL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 1574: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<COIIDDMDPIL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          COIIDDMDPIL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<COIIDDMDPIL>() {
              public COIIDDMDPIL findValueByNumber(int number) {
                return COIIDDMDPIL.forNumber(number);
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
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final COIIDDMDPIL[] VALUES = getStaticValuesArray();
      private static COIIDDMDPIL[] getStaticValuesArray() {
        return new COIIDDMDPIL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static COIIDDMDPIL valueOf(
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

      private COIIDDMDPIL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GachaWishRsp.COIIDDMDPIL)
    }

    public static final int WISHPROGRESS_FIELD_NUMBER = 3;
    private int wishProgress_ = 0;
    /**
     * <code>uint32 wishProgress = 3;</code>
     * @return The wishProgress.
     */
    @java.lang.Override
    public int getWishProgress() {
      return wishProgress_;
    }

    public static final int WISHMAXPROGRESS_FIELD_NUMBER = 7;
    private int wishMaxProgress_ = 0;
    /**
     * <code>uint32 wishMaxProgress = 7;</code>
     * @return The wishMaxProgress.
     */
    @java.lang.Override
    public int getWishMaxProgress() {
      return wishMaxProgress_;
    }

    public static final int GACHATYPE_FIELD_NUMBER = 6;
    private int gachaType_ = 0;
    /**
     * <code>uint32 gachaType = 6;</code>
     * @return The gachaType.
     */
    @java.lang.Override
    public int getGachaType() {
      return gachaType_;
    }

    public static final int GACHASCHEDULEID_FIELD_NUMBER = 11;
    private int gachaScheduleId_ = 0;
    /**
     * <code>uint32 gachaScheduleId = 11;</code>
     * @return The gachaScheduleId.
     */
    @java.lang.Override
    public int getGachaScheduleId() {
      return gachaScheduleId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int WISHITEMID_FIELD_NUMBER = 5;
    private int wishItemId_ = 0;
    /**
     * <code>uint32 wishItemId = 5;</code>
     * @return The wishItemId.
     */
    @java.lang.Override
    public int getWishItemId() {
      return wishItemId_;
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
      if (wishProgress_ != 0) {
        output.writeUInt32(3, wishProgress_);
      }
      if (wishItemId_ != 0) {
        output.writeUInt32(5, wishItemId_);
      }
      if (gachaType_ != 0) {
        output.writeUInt32(6, gachaType_);
      }
      if (wishMaxProgress_ != 0) {
        output.writeUInt32(7, wishMaxProgress_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (gachaScheduleId_ != 0) {
        output.writeUInt32(11, gachaScheduleId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (wishProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, wishProgress_);
      }
      if (wishItemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, wishItemId_);
      }
      if (gachaType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, gachaType_);
      }
      if (wishMaxProgress_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, wishMaxProgress_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (gachaScheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, gachaScheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp other = (emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) obj;

      if (getWishProgress()
          != other.getWishProgress()) return false;
      if (getWishMaxProgress()
          != other.getWishMaxProgress()) return false;
      if (getGachaType()
          != other.getGachaType()) return false;
      if (getGachaScheduleId()
          != other.getGachaScheduleId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getWishItemId()
          != other.getWishItemId()) return false;
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
      hash = (37 * hash) + WISHPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getWishProgress();
      hash = (37 * hash) + WISHMAXPROGRESS_FIELD_NUMBER;
      hash = (53 * hash) + getWishMaxProgress();
      hash = (37 * hash) + GACHATYPE_FIELD_NUMBER;
      hash = (53 * hash) + getGachaType();
      hash = (37 * hash) + GACHASCHEDULEID_FIELD_NUMBER;
      hash = (53 * hash) + getGachaScheduleId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + WISHITEMID_FIELD_NUMBER;
      hash = (53 * hash) + getWishItemId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp prototype) {
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
     * Protobuf type {@code GachaWishRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GachaWishRsp)
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.class, emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.newBuilder()
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
        wishProgress_ = 0;
        wishMaxProgress_ = 0;
        gachaType_ = 0;
        gachaScheduleId_ = 0;
        retcode_ = 0;
        wishItemId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.internal_static_GachaWishRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp build() {
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp buildPartial() {
        emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.wishProgress_ = wishProgress_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.wishMaxProgress_ = wishMaxProgress_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gachaType_ = gachaType_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.gachaScheduleId_ = gachaScheduleId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.wishItemId_ = wishItemId_;
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
        if (other instanceof emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp) {
          return mergeFrom((emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp other) {
        if (other == emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp.getDefaultInstance()) return this;
        if (other.getWishProgress() != 0) {
          setWishProgress(other.getWishProgress());
        }
        if (other.getWishMaxProgress() != 0) {
          setWishMaxProgress(other.getWishMaxProgress());
        }
        if (other.getGachaType() != 0) {
          setGachaType(other.getGachaType());
        }
        if (other.getGachaScheduleId() != 0) {
          setGachaScheduleId(other.getGachaScheduleId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getWishItemId() != 0) {
          setWishItemId(other.getWishItemId());
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
              case 24: {
                wishProgress_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 24
              case 40: {
                wishItemId_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 40
              case 48: {
                gachaType_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 48
              case 56: {
                wishMaxProgress_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 56
              case 72: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000010;
                break;
              } // case 72
              case 88: {
                gachaScheduleId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 88
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

      private int wishProgress_ ;
      /**
       * <code>uint32 wishProgress = 3;</code>
       * @return The wishProgress.
       */
      @java.lang.Override
      public int getWishProgress() {
        return wishProgress_;
      }
      /**
       * <code>uint32 wishProgress = 3;</code>
       * @param value The wishProgress to set.
       * @return This builder for chaining.
       */
      public Builder setWishProgress(int value) {
        
        wishProgress_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishProgress = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishProgress() {
        bitField0_ = (bitField0_ & ~0x00000001);
        wishProgress_ = 0;
        onChanged();
        return this;
      }

      private int wishMaxProgress_ ;
      /**
       * <code>uint32 wishMaxProgress = 7;</code>
       * @return The wishMaxProgress.
       */
      @java.lang.Override
      public int getWishMaxProgress() {
        return wishMaxProgress_;
      }
      /**
       * <code>uint32 wishMaxProgress = 7;</code>
       * @param value The wishMaxProgress to set.
       * @return This builder for chaining.
       */
      public Builder setWishMaxProgress(int value) {
        
        wishMaxProgress_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishMaxProgress = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishMaxProgress() {
        bitField0_ = (bitField0_ & ~0x00000002);
        wishMaxProgress_ = 0;
        onChanged();
        return this;
      }

      private int gachaType_ ;
      /**
       * <code>uint32 gachaType = 6;</code>
       * @return The gachaType.
       */
      @java.lang.Override
      public int getGachaType() {
        return gachaType_;
      }
      /**
       * <code>uint32 gachaType = 6;</code>
       * @param value The gachaType to set.
       * @return This builder for chaining.
       */
      public Builder setGachaType(int value) {
        
        gachaType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaType = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gachaType_ = 0;
        onChanged();
        return this;
      }

      private int gachaScheduleId_ ;
      /**
       * <code>uint32 gachaScheduleId = 11;</code>
       * @return The gachaScheduleId.
       */
      @java.lang.Override
      public int getGachaScheduleId() {
        return gachaScheduleId_;
      }
      /**
       * <code>uint32 gachaScheduleId = 11;</code>
       * @param value The gachaScheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setGachaScheduleId(int value) {
        
        gachaScheduleId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gachaScheduleId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGachaScheduleId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gachaScheduleId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000010);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int wishItemId_ ;
      /**
       * <code>uint32 wishItemId = 5;</code>
       * @return The wishItemId.
       */
      @java.lang.Override
      public int getWishItemId() {
        return wishItemId_;
      }
      /**
       * <code>uint32 wishItemId = 5;</code>
       * @param value The wishItemId to set.
       * @return This builder for chaining.
       */
      public Builder setWishItemId(int value) {
        
        wishItemId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wishItemId = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearWishItemId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        wishItemId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GachaWishRsp)
    }

    // @@protoc_insertion_point(class_scope:GachaWishRsp)
    private static final emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp();
    }

    public static emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GachaWishRsp>
        PARSER = new com.google.protobuf.AbstractParser<GachaWishRsp>() {
      @java.lang.Override
      public GachaWishRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<GachaWishRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GachaWishRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GachaWishRspOuterClass.GachaWishRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GachaWishRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GachaWishRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022GachaWishRsp.proto\"\337\001\n\014GachaWishRsp\022\024\n" +
      "\014wishProgress\030\003 \001(\r\022\027\n\017wishMaxProgress\030\007" +
      " \001(\r\022\021\n\tgachaType\030\006 \001(\r\022\027\n\017gachaSchedule" +
      "Id\030\013 \001(\r\022\017\n\007retcode\030\t \001(\005\022\022\n\nwishItemId\030" +
      "\005 \001(\r\"O\n\013COIIDDMDPIL\022\010\n\004NONE\020\000\022\020\n\013PEPPOH" +
      "PHJOJ\020\246\014\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA" +
      "\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GachaWishRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GachaWishRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GachaWishRsp_descriptor,
        new java.lang.String[] { "WishProgress", "WishMaxProgress", "GachaType", "GachaScheduleId", "Retcode", "WishItemId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
