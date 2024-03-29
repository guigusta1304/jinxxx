// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DungeonSlipRevivePointActivateRsp.proto

package emu.grasscutter.net.proto;

public final class DungeonSlipRevivePointActivateRspOuterClass {
  private DungeonSlipRevivePointActivateRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DungeonSlipRevivePointActivateRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DungeonSlipRevivePointActivateRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 slipRevivePointId = 11;</code>
     * @return The slipRevivePointId.
     */
    int getSlipRevivePointId();

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * Protobuf type {@code DungeonSlipRevivePointActivateRsp}
   */
  public static final class DungeonSlipRevivePointActivateRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DungeonSlipRevivePointActivateRsp)
      DungeonSlipRevivePointActivateRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DungeonSlipRevivePointActivateRsp.newBuilder() to construct.
    private DungeonSlipRevivePointActivateRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DungeonSlipRevivePointActivateRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DungeonSlipRevivePointActivateRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code DungeonSlipRevivePointActivateRsp.ADCIMBHOHKB}
     */
    public enum ADCIMBHOHKB
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 979;</code>
       */
      PEPPOHPHJOJ(1, 979),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ADCIMBHOHKB DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 979;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 979;
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
      public static ADCIMBHOHKB valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ADCIMBHOHKB forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 979: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ADCIMBHOHKB>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ADCIMBHOHKB> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ADCIMBHOHKB>() {
              public ADCIMBHOHKB findValueByNumber(int number) {
                return ADCIMBHOHKB.forNumber(number);
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
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final ADCIMBHOHKB[] VALUES = getStaticValuesArray();
      private static ADCIMBHOHKB[] getStaticValuesArray() {
        return new ADCIMBHOHKB[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static ADCIMBHOHKB valueOf(
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

      private ADCIMBHOHKB(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:DungeonSlipRevivePointActivateRsp.ADCIMBHOHKB)
    }

    public static final int SLIPREVIVEPOINTID_FIELD_NUMBER = 11;
    private int slipRevivePointId_ = 0;
    /**
     * <code>uint32 slipRevivePointId = 11;</code>
     * @return The slipRevivePointId.
     */
    @java.lang.Override
    public int getSlipRevivePointId() {
      return slipRevivePointId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 5;</code>
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (slipRevivePointId_ != 0) {
        output.writeUInt32(11, slipRevivePointId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (slipRevivePointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, slipRevivePointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp other = (emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp) obj;

      if (getSlipRevivePointId()
          != other.getSlipRevivePointId()) return false;
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
      hash = (37 * hash) + SLIPREVIVEPOINTID_FIELD_NUMBER;
      hash = (53 * hash) + getSlipRevivePointId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp prototype) {
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
     * Protobuf type {@code DungeonSlipRevivePointActivateRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DungeonSlipRevivePointActivateRsp)
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.class, emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.newBuilder()
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
        slipRevivePointId_ = 0;
        retcode_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp build() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp buildPartial() {
        emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp result = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.slipRevivePointId_ = slipRevivePointId_;
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
        if (other instanceof emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp) {
          return mergeFrom((emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp other) {
        if (other == emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp.getDefaultInstance()) return this;
        if (other.getSlipRevivePointId() != 0) {
          setSlipRevivePointId(other.getSlipRevivePointId());
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
              case 40: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 40
              case 88: {
                slipRevivePointId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
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

      private int slipRevivePointId_ ;
      /**
       * <code>uint32 slipRevivePointId = 11;</code>
       * @return The slipRevivePointId.
       */
      @java.lang.Override
      public int getSlipRevivePointId() {
        return slipRevivePointId_;
      }
      /**
       * <code>uint32 slipRevivePointId = 11;</code>
       * @param value The slipRevivePointId to set.
       * @return This builder for chaining.
       */
      public Builder setSlipRevivePointId(int value) {
        
        slipRevivePointId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slipRevivePointId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlipRevivePointId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        slipRevivePointId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
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
       * <code>int32 retcode = 5;</code>
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


      // @@protoc_insertion_point(builder_scope:DungeonSlipRevivePointActivateRsp)
    }

    // @@protoc_insertion_point(class_scope:DungeonSlipRevivePointActivateRsp)
    private static final emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp();
    }

    public static emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp>
        PARSER = new com.google.protobuf.AbstractParser<DungeonSlipRevivePointActivateRsp>() {
      @java.lang.Override
      public DungeonSlipRevivePointActivateRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DungeonSlipRevivePointActivateRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonSlipRevivePointActivateRspOuterClass.DungeonSlipRevivePointActivateRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DungeonSlipRevivePointActivateRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'DungeonSlipRevivePointActivateRsp.prot" +
      "o\"\240\001\n!DungeonSlipRevivePointActivateRsp\022" +
      "\031\n\021slipRevivePointId\030\013 \001(\r\022\017\n\007retcode\030\005 " +
      "\001(\005\"O\n\013ADCIMBHOHKB\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPH" +
      "JOJ\020\323\007\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001" +
      "\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DungeonSlipRevivePointActivateRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DungeonSlipRevivePointActivateRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DungeonSlipRevivePointActivateRsp_descriptor,
        new java.lang.String[] { "SlipRevivePointId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
