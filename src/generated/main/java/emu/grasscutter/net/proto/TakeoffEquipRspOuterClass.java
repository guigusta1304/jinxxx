// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeoffEquipRsp.proto

package emu.grasscutter.net.proto;

public final class TakeoffEquipRspOuterClass {
  private TakeoffEquipRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeoffEquipRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeoffEquipRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 slot = 3;</code>
     * @return The slot.
     */
    int getSlot();

    /**
     * <code>uint64 avatarGuid = 5;</code>
     * @return The avatarGuid.
     */
    long getAvatarGuid();
  }
  /**
   * Protobuf type {@code TakeoffEquipRsp}
   */
  public static final class TakeoffEquipRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeoffEquipRsp)
      TakeoffEquipRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeoffEquipRsp.newBuilder() to construct.
    private TakeoffEquipRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeoffEquipRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeoffEquipRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.class, emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.Builder.class);
    }

    /**
     * Protobuf enum {@code TakeoffEquipRsp.ALEJPJIDAFJ}
     */
    public enum ALEJPJIDAFJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 606;</code>
       */
      PEPPOHPHJOJ(1, 606),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final ALEJPJIDAFJ DCDNILFDFLB = NONE;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 606;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 606;
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
      public static ALEJPJIDAFJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static ALEJPJIDAFJ forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 606: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<ALEJPJIDAFJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          ALEJPJIDAFJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ALEJPJIDAFJ>() {
              public ALEJPJIDAFJ findValueByNumber(int number) {
                return ALEJPJIDAFJ.forNumber(number);
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
        return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.getDescriptor().getEnumTypes().get(0);
      }

      private static final ALEJPJIDAFJ[] VALUES = getStaticValuesArray();
      private static ALEJPJIDAFJ[] getStaticValuesArray() {
        return new ALEJPJIDAFJ[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, 
        };
      }
      public static ALEJPJIDAFJ valueOf(
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

      private ALEJPJIDAFJ(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:TakeoffEquipRsp.ALEJPJIDAFJ)
    }

    public static final int RETCODE_FIELD_NUMBER = 15;
    private int retcode_ = 0;
    /**
     * <code>int32 retcode = 15;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int SLOT_FIELD_NUMBER = 3;
    private int slot_ = 0;
    /**
     * <code>uint32 slot = 3;</code>
     * @return The slot.
     */
    @java.lang.Override
    public int getSlot() {
      return slot_;
    }

    public static final int AVATARGUID_FIELD_NUMBER = 5;
    private long avatarGuid_ = 0L;
    /**
     * <code>uint64 avatarGuid = 5;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
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
      if (slot_ != 0) {
        output.writeUInt32(3, slot_);
      }
      if (avatarGuid_ != 0L) {
        output.writeUInt64(5, avatarGuid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(15, retcode_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (slot_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, slot_);
      }
      if (avatarGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, avatarGuid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(15, retcode_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp other = (emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getSlot()
          != other.getSlot()) return false;
      if (getAvatarGuid()
          != other.getAvatarGuid()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + SLOT_FIELD_NUMBER;
      hash = (53 * hash) + getSlot();
      hash = (37 * hash) + AVATARGUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getAvatarGuid());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp prototype) {
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
     * Protobuf type {@code TakeoffEquipRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeoffEquipRsp)
        emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.class, emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.newBuilder()
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
        retcode_ = 0;
        slot_ = 0;
        avatarGuid_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.internal_static_TakeoffEquipRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp build() {
        emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp buildPartial() {
        emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp result = new emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.retcode_ = retcode_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.slot_ = slot_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.avatarGuid_ = avatarGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp other) {
        if (other == emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getSlot() != 0) {
          setSlot(other.getSlot());
        }
        if (other.getAvatarGuid() != 0L) {
          setAvatarGuid(other.getAvatarGuid());
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
                slot_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
              case 40: {
                avatarGuid_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
              case 120: {
                retcode_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 120
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

      private int retcode_ ;
      /**
       * <code>int32 retcode = 15;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int slot_ ;
      /**
       * <code>uint32 slot = 3;</code>
       * @return The slot.
       */
      @java.lang.Override
      public int getSlot() {
        return slot_;
      }
      /**
       * <code>uint32 slot = 3;</code>
       * @param value The slot to set.
       * @return This builder for chaining.
       */
      public Builder setSlot(int value) {
        
        slot_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 slot = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSlot() {
        bitField0_ = (bitField0_ & ~0x00000002);
        slot_ = 0;
        onChanged();
        return this;
      }

      private long avatarGuid_ ;
      /**
       * <code>uint64 avatarGuid = 5;</code>
       * @return The avatarGuid.
       */
      @java.lang.Override
      public long getAvatarGuid() {
        return avatarGuid_;
      }
      /**
       * <code>uint64 avatarGuid = 5;</code>
       * @param value The avatarGuid to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuid(long value) {
        
        avatarGuid_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 avatarGuid = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuid() {
        bitField0_ = (bitField0_ & ~0x00000004);
        avatarGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:TakeoffEquipRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeoffEquipRsp)
    private static final emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp();
    }

    public static emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeoffEquipRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeoffEquipRsp>() {
      @java.lang.Override
      public TakeoffEquipRsp parsePartialFrom(
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

    public static com.google.protobuf.Parser<TakeoffEquipRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeoffEquipRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeoffEquipRspOuterClass.TakeoffEquipRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeoffEquipRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeoffEquipRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025TakeoffEquipRsp.proto\"\225\001\n\017TakeoffEquip" +
      "Rsp\022\017\n\007retcode\030\017 \001(\005\022\014\n\004slot\030\003 \001(\r\022\022\n\nav" +
      "atarGuid\030\005 \001(\004\"O\n\013ALEJPJIDAFJ\022\010\n\004NONE\020\000\022" +
      "\020\n\013PEPPOHPHJOJ\020\336\004\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NN" +
      "BKOLMPOEA\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeoffEquipRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeoffEquipRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeoffEquipRsp_descriptor,
        new java.lang.String[] { "Retcode", "Slot", "AvatarGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
