// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GadgetInteractReq.proto

package emu.grasscutter.net.proto;

public final class GadgetInteractReqOuterClass {
  private GadgetInteractReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GadgetInteractReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GadgetInteractReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.InterOpType opType = 1;</code>
     * @return The enum numeric value on the wire for opType.
     */
    int getOpTypeValue();
    /**
     * <code>.InterOpType opType = 1;</code>
     * @return The opType.
     */
    emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType();

    /**
     * <code>bool isUseCondenseResin = 14;</code>
     * @return The isUseCondenseResin.
     */
    boolean getIsUseCondenseResin();

    /**
     * <code>uint32 gadgetEntityId = 8;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 gadgetId = 15;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>.ResinCostType resinCostType = 7;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    int getResinCostTypeValue();
    /**
     * <code>.ResinCostType resinCostType = 7;</code>
     * @return The resinCostType.
     */
    emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType();

    /**
     * <code>uint32 uiInteractId = 6;</code>
     * @return The uiInteractId.
     */
    int getUiInteractId();
  }
  /**
   * Protobuf type {@code GadgetInteractReq}
   */
  public static final class GadgetInteractReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GadgetInteractReq)
      GadgetInteractReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GadgetInteractReq.newBuilder() to construct.
    private GadgetInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GadgetInteractReq() {
      opType_ = 0;
      resinCostType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GadgetInteractReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
    }

    /**
     * Protobuf enum {@code GadgetInteractReq.HNAHFIOGDFG}
     */
    public enum HNAHFIOGDFG
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 805;</code>
       */
      PEPPOHPHJOJ(1, 805),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final HNAHFIOGDFG DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final HNAHFIOGDFG EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 805;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 805;
      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final int DCDNILFDFLB_VALUE = 0;
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      public static final int NNBKOLMPOEA_VALUE = 1;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final int EAJIABGAOCI_VALUE = 1;


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
      public static HNAHFIOGDFG valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static HNAHFIOGDFG forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 805: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<HNAHFIOGDFG>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          HNAHFIOGDFG> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<HNAHFIOGDFG>() {
              public HNAHFIOGDFG findValueByNumber(int number) {
                return HNAHFIOGDFG.forNumber(number);
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
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final HNAHFIOGDFG[] VALUES = getStaticValuesArray();
      private static HNAHFIOGDFG[] getStaticValuesArray() {
        return new HNAHFIOGDFG[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static HNAHFIOGDFG valueOf(
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

      private HNAHFIOGDFG(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:GadgetInteractReq.HNAHFIOGDFG)
    }

    public static final int OPTYPE_FIELD_NUMBER = 1;
    private int opType_ = 0;
    /**
     * <code>.InterOpType opType = 1;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType opType = 1;</code>
     * @return The opType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
      emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.forNumber(opType_);
      return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
    }

    public static final int ISUSECONDENSERESIN_FIELD_NUMBER = 14;
    private boolean isUseCondenseResin_ = false;
    /**
     * <code>bool isUseCondenseResin = 14;</code>
     * @return The isUseCondenseResin.
     */
    @java.lang.Override
    public boolean getIsUseCondenseResin() {
      return isUseCondenseResin_;
    }

    public static final int GADGETENTITYID_FIELD_NUMBER = 8;
    private int gadgetEntityId_ = 0;
    /**
     * <code>uint32 gadgetEntityId = 8;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int GADGETID_FIELD_NUMBER = 15;
    private int gadgetId_ = 0;
    /**
     * <code>uint32 gadgetId = 15;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int RESINCOSTTYPE_FIELD_NUMBER = 7;
    private int resinCostType_ = 0;
    /**
     * <code>.ResinCostType resinCostType = 7;</code>
     * @return The enum numeric value on the wire for resinCostType.
     */
    @java.lang.Override public int getResinCostTypeValue() {
      return resinCostType_;
    }
    /**
     * <code>.ResinCostType resinCostType = 7;</code>
     * @return The resinCostType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
      emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.forNumber(resinCostType_);
      return result == null ? emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
    }

    public static final int UIINTERACTID_FIELD_NUMBER = 6;
    private int uiInteractId_ = 0;
    /**
     * <code>uint32 uiInteractId = 6;</code>
     * @return The uiInteractId.
     */
    @java.lang.Override
    public int getUiInteractId() {
      return uiInteractId_;
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
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        output.writeEnum(1, opType_);
      }
      if (uiInteractId_ != 0) {
        output.writeUInt32(6, uiInteractId_);
      }
      if (resinCostType_ != emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        output.writeEnum(7, resinCostType_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(8, gadgetEntityId_);
      }
      if (isUseCondenseResin_ != false) {
        output.writeBool(14, isUseCondenseResin_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(15, gadgetId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (opType_ != emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.INTER_OP_TYPE_FINISH.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, opType_);
      }
      if (uiInteractId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, uiInteractId_);
      }
      if (resinCostType_ != emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.RESIN_COST_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, resinCostType_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, gadgetEntityId_);
      }
      if (isUseCondenseResin_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(14, isUseCondenseResin_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, gadgetId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq other = (emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq) obj;

      if (opType_ != other.opType_) return false;
      if (getIsUseCondenseResin()
          != other.getIsUseCondenseResin()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (resinCostType_ != other.resinCostType_) return false;
      if (getUiInteractId()
          != other.getUiInteractId()) return false;
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
      hash = (37 * hash) + OPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + opType_;
      hash = (37 * hash) + ISUSECONDENSERESIN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUseCondenseResin());
      hash = (37 * hash) + GADGETENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + GADGETID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + RESINCOSTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + resinCostType_;
      hash = (37 * hash) + UIINTERACTID_FIELD_NUMBER;
      hash = (53 * hash) + getUiInteractId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq prototype) {
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
     * Protobuf type {@code GadgetInteractReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GadgetInteractReq)
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.class, emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.newBuilder()
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
        opType_ = 0;
        isUseCondenseResin_ = false;
        gadgetEntityId_ = 0;
        gadgetId_ = 0;
        resinCostType_ = 0;
        uiInteractId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.internal_static_GadgetInteractReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq build() {
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq buildPartial() {
        emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq result = new emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.opType_ = opType_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isUseCondenseResin_ = isUseCondenseResin_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.gadgetEntityId_ = gadgetEntityId_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.gadgetId_ = gadgetId_;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.resinCostType_ = resinCostType_;
        }
        if (((from_bitField0_ & 0x00000020) != 0)) {
          result.uiInteractId_ = uiInteractId_;
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
        if (other instanceof emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq) {
          return mergeFrom((emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq other) {
        if (other == emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq.getDefaultInstance()) return this;
        if (other.opType_ != 0) {
          setOpTypeValue(other.getOpTypeValue());
        }
        if (other.getIsUseCondenseResin() != false) {
          setIsUseCondenseResin(other.getIsUseCondenseResin());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.resinCostType_ != 0) {
          setResinCostTypeValue(other.getResinCostTypeValue());
        }
        if (other.getUiInteractId() != 0) {
          setUiInteractId(other.getUiInteractId());
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
                opType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 48: {
                uiInteractId_ = input.readUInt32();
                bitField0_ |= 0x00000020;
                break;
              } // case 48
              case 56: {
                resinCostType_ = input.readEnum();
                bitField0_ |= 0x00000010;
                break;
              } // case 56
              case 64: {
                gadgetEntityId_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 64
              case 112: {
                isUseCondenseResin_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 112
              case 120: {
                gadgetId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
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

      private int opType_ = 0;
      /**
       * <code>.InterOpType opType = 1;</code>
       * @return The enum numeric value on the wire for opType.
       */
      @java.lang.Override public int getOpTypeValue() {
        return opType_;
      }
      /**
       * <code>.InterOpType opType = 1;</code>
       * @param value The enum numeric value on the wire for opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpTypeValue(int value) {
        opType_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType opType = 1;</code>
       * @return The opType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType getOpType() {
        emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType result = emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.forNumber(opType_);
        return result == null ? emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType.UNRECOGNIZED : result;
      }
      /**
       * <code>.InterOpType opType = 1;</code>
       * @param value The opType to set.
       * @return This builder for chaining.
       */
      public Builder setOpType(emu.grasscutter.net.proto.InterOpTypeOuterClass.InterOpType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        opType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.InterOpType opType = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        opType_ = 0;
        onChanged();
        return this;
      }

      private boolean isUseCondenseResin_ ;
      /**
       * <code>bool isUseCondenseResin = 14;</code>
       * @return The isUseCondenseResin.
       */
      @java.lang.Override
      public boolean getIsUseCondenseResin() {
        return isUseCondenseResin_;
      }
      /**
       * <code>bool isUseCondenseResin = 14;</code>
       * @param value The isUseCondenseResin to set.
       * @return This builder for chaining.
       */
      public Builder setIsUseCondenseResin(boolean value) {
        
        isUseCondenseResin_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isUseCondenseResin = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUseCondenseResin() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isUseCondenseResin_ = false;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadgetEntityId = 8;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadgetEntityId = 8;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetEntityId = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadgetId = 15;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadgetId = 15;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadgetId = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private int resinCostType_ = 0;
      /**
       * <code>.ResinCostType resinCostType = 7;</code>
       * @return The enum numeric value on the wire for resinCostType.
       */
      @java.lang.Override public int getResinCostTypeValue() {
        return resinCostType_;
      }
      /**
       * <code>.ResinCostType resinCostType = 7;</code>
       * @param value The enum numeric value on the wire for resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostTypeValue(int value) {
        resinCostType_ = value;
        bitField0_ |= 0x00000010;
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resinCostType = 7;</code>
       * @return The resinCostType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType getResinCostType() {
        emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType result = emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.forNumber(resinCostType_);
        return result == null ? emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ResinCostType resinCostType = 7;</code>
       * @param value The resinCostType to set.
       * @return This builder for chaining.
       */
      public Builder setResinCostType(emu.grasscutter.net.proto.ResinCostTypeOuterClass.ResinCostType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000010;
        resinCostType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ResinCostType resinCostType = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearResinCostType() {
        bitField0_ = (bitField0_ & ~0x00000010);
        resinCostType_ = 0;
        onChanged();
        return this;
      }

      private int uiInteractId_ ;
      /**
       * <code>uint32 uiInteractId = 6;</code>
       * @return The uiInteractId.
       */
      @java.lang.Override
      public int getUiInteractId() {
        return uiInteractId_;
      }
      /**
       * <code>uint32 uiInteractId = 6;</code>
       * @param value The uiInteractId to set.
       * @return This builder for chaining.
       */
      public Builder setUiInteractId(int value) {
        
        uiInteractId_ = value;
        bitField0_ |= 0x00000020;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uiInteractId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearUiInteractId() {
        bitField0_ = (bitField0_ & ~0x00000020);
        uiInteractId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GadgetInteractReq)
    }

    // @@protoc_insertion_point(class_scope:GadgetInteractReq)
    private static final emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq();
    }

    public static emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GadgetInteractReq>
        PARSER = new com.google.protobuf.AbstractParser<GadgetInteractReq>() {
      @java.lang.Override
      public GadgetInteractReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<GadgetInteractReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GadgetInteractReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GadgetInteractReqOuterClass.GadgetInteractReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GadgetInteractReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GadgetInteractReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GadgetInteractReq.proto\032\021InterOpType.p" +
      "roto\032\023ResinCostType.proto\"\226\002\n\021GadgetInte" +
      "ractReq\022\034\n\006opType\030\001 \001(\0162\014.InterOpType\022\032\n" +
      "\022isUseCondenseResin\030\016 \001(\010\022\026\n\016gadgetEntit" +
      "yId\030\010 \001(\r\022\020\n\010gadgetId\030\017 \001(\r\022%\n\rresinCost" +
      "Type\030\007 \001(\0162\016.ResinCostType\022\024\n\014uiInteract" +
      "Id\030\006 \001(\r\"`\n\013HNAHFIOGDFG\022\010\n\004NONE\020\000\022\020\n\013PEP" +
      "POHPHJOJ\020\245\006\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMP" +
      "OEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ResinCostTypeOuterClass.getDescriptor(),
        });
    internal_static_GadgetInteractReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GadgetInteractReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GadgetInteractReq_descriptor,
        new java.lang.String[] { "OpType", "IsUseCondenseResin", "GadgetEntityId", "GadgetId", "ResinCostType", "UiInteractId", });
    emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ResinCostTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
