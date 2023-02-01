// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeLimitedShopBuyGoodsReq.proto

package emu.grasscutter.net.proto;

public final class HomeLimitedShopBuyGoodsReqOuterClass {
  private HomeLimitedShopBuyGoodsReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeLimitedShopBuyGoodsReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeLimitedShopBuyGoodsReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     * @return Whether the goods field is set.
     */
    boolean hasGoods();
    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     * @return The goods.
     */
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoods();
    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     */
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsOrBuilder();

    /**
     * <code>uint32 buyCount = 10;</code>
     * @return The buyCount.
     */
    int getBuyCount();
  }
  /**
   * Protobuf type {@code HomeLimitedShopBuyGoodsReq}
   */
  public static final class HomeLimitedShopBuyGoodsReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeLimitedShopBuyGoodsReq)
      HomeLimitedShopBuyGoodsReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeLimitedShopBuyGoodsReq.newBuilder() to construct.
    private HomeLimitedShopBuyGoodsReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeLimitedShopBuyGoodsReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeLimitedShopBuyGoodsReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.internal_static_HomeLimitedShopBuyGoodsReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.internal_static_HomeLimitedShopBuyGoodsReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.class, emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeLimitedShopBuyGoodsReq.NLNFOCHGLND}
     */
    public enum NLNFOCHGLND
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4647;</code>
       */
      PEPPOHPHJOJ(1, 4647),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final NLNFOCHGLND DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final NLNFOCHGLND EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4647;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4647;
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
      public static NLNFOCHGLND valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static NLNFOCHGLND forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4647: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<NLNFOCHGLND>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          NLNFOCHGLND> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<NLNFOCHGLND>() {
              public NLNFOCHGLND findValueByNumber(int number) {
                return NLNFOCHGLND.forNumber(number);
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
        return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final NLNFOCHGLND[] VALUES = getStaticValuesArray();
      private static NLNFOCHGLND[] getStaticValuesArray() {
        return new NLNFOCHGLND[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static NLNFOCHGLND valueOf(
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

      private NLNFOCHGLND(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeLimitedShopBuyGoodsReq.NLNFOCHGLND)
    }

    public static final int GOODS_FIELD_NUMBER = 1;
    private emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods goods_;
    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     * @return Whether the goods field is set.
     */
    @java.lang.Override
    public boolean hasGoods() {
      return goods_ != null;
    }
    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     * @return The goods.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoods() {
      return goods_ == null ? emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance() : goods_;
    }
    /**
     * <code>.HomeLimitedShopGoods goods = 1;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsOrBuilder() {
      return goods_ == null ? emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance() : goods_;
    }

    public static final int BUYCOUNT_FIELD_NUMBER = 10;
    private int buyCount_ = 0;
    /**
     * <code>uint32 buyCount = 10;</code>
     * @return The buyCount.
     */
    @java.lang.Override
    public int getBuyCount() {
      return buyCount_;
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
      if (goods_ != null) {
        output.writeMessage(1, getGoods());
      }
      if (buyCount_ != 0) {
        output.writeUInt32(10, buyCount_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (goods_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getGoods());
      }
      if (buyCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, buyCount_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq other = (emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq) obj;

      if (hasGoods() != other.hasGoods()) return false;
      if (hasGoods()) {
        if (!getGoods()
            .equals(other.getGoods())) return false;
      }
      if (getBuyCount()
          != other.getBuyCount()) return false;
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
      if (hasGoods()) {
        hash = (37 * hash) + GOODS_FIELD_NUMBER;
        hash = (53 * hash) + getGoods().hashCode();
      }
      hash = (37 * hash) + BUYCOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getBuyCount();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq prototype) {
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
     * Protobuf type {@code HomeLimitedShopBuyGoodsReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeLimitedShopBuyGoodsReq)
        emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.internal_static_HomeLimitedShopBuyGoodsReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.internal_static_HomeLimitedShopBuyGoodsReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.class, emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.newBuilder()
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
        goods_ = null;
        if (goodsBuilder_ != null) {
          goodsBuilder_.dispose();
          goodsBuilder_ = null;
        }
        buyCount_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.internal_static_HomeLimitedShopBuyGoodsReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq build() {
        emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq buildPartial() {
        emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq result = new emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.goods_ = goodsBuilder_ == null
              ? goods_
              : goodsBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.buyCount_ = buyCount_;
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
        if (other instanceof emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq other) {
        if (other == emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq.getDefaultInstance()) return this;
        if (other.hasGoods()) {
          mergeGoods(other.getGoods());
        }
        if (other.getBuyCount() != 0) {
          setBuyCount(other.getBuyCount());
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
              case 10: {
                input.readMessage(
                    getGoodsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 80: {
                buyCount_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 80
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

      private emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods goods_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> goodsBuilder_;
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       * @return Whether the goods field is set.
       */
      public boolean hasGoods() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       * @return The goods.
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods getGoods() {
        if (goodsBuilder_ == null) {
          return goods_ == null ? emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance() : goods_;
        } else {
          return goodsBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public Builder setGoods(emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods value) {
        if (goodsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          goods_ = value;
        } else {
          goodsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public Builder setGoods(
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder builderForValue) {
        if (goodsBuilder_ == null) {
          goods_ = builderForValue.build();
        } else {
          goodsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public Builder mergeGoods(emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods value) {
        if (goodsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            goods_ != null &&
            goods_ != emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance()) {
            getGoodsBuilder().mergeFrom(value);
          } else {
            goods_ = value;
          }
        } else {
          goodsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public Builder clearGoods() {
        bitField0_ = (bitField0_ & ~0x00000001);
        goods_ = null;
        if (goodsBuilder_ != null) {
          goodsBuilder_.dispose();
          goodsBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder getGoodsBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getGoodsFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      public emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder getGoodsOrBuilder() {
        if (goodsBuilder_ != null) {
          return goodsBuilder_.getMessageOrBuilder();
        } else {
          return goods_ == null ?
              emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.getDefaultInstance() : goods_;
        }
      }
      /**
       * <code>.HomeLimitedShopGoods goods = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder> 
          getGoodsFieldBuilder() {
        if (goodsBuilder_ == null) {
          goodsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoods.Builder, emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.HomeLimitedShopGoodsOrBuilder>(
                  getGoods(),
                  getParentForChildren(),
                  isClean());
          goods_ = null;
        }
        return goodsBuilder_;
      }

      private int buyCount_ ;
      /**
       * <code>uint32 buyCount = 10;</code>
       * @return The buyCount.
       */
      @java.lang.Override
      public int getBuyCount() {
        return buyCount_;
      }
      /**
       * <code>uint32 buyCount = 10;</code>
       * @param value The buyCount to set.
       * @return This builder for chaining.
       */
      public Builder setBuyCount(int value) {
        
        buyCount_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 buyCount = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBuyCount() {
        bitField0_ = (bitField0_ & ~0x00000002);
        buyCount_ = 0;
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


      // @@protoc_insertion_point(builder_scope:HomeLimitedShopBuyGoodsReq)
    }

    // @@protoc_insertion_point(class_scope:HomeLimitedShopBuyGoodsReq)
    private static final emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq();
    }

    public static emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeLimitedShopBuyGoodsReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeLimitedShopBuyGoodsReq>() {
      @java.lang.Override
      public HomeLimitedShopBuyGoodsReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeLimitedShopBuyGoodsReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeLimitedShopBuyGoodsReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeLimitedShopBuyGoodsReqOuterClass.HomeLimitedShopBuyGoodsReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeLimitedShopBuyGoodsReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeLimitedShopBuyGoodsReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HomeLimitedShopBuyGoodsReq.proto\032\032Home" +
      "LimitedShopGoods.proto\"\266\001\n\032HomeLimitedSh" +
      "opBuyGoodsReq\022$\n\005goods\030\001 \001(\0132\025.HomeLimit" +
      "edShopGoods\022\020\n\010buyCount\030\n \001(\r\"`\n\013NLNFOCH" +
      "GLND\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\247$\022\017\n\013DCDN" +
      "ILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGAOC" +
      "I\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.getDescriptor(),
        });
    internal_static_HomeLimitedShopBuyGoodsReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeLimitedShopBuyGoodsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeLimitedShopBuyGoodsReq_descriptor,
        new java.lang.String[] { "Goods", "BuyCount", });
    emu.grasscutter.net.proto.HomeLimitedShopGoodsOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}