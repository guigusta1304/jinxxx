// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeOfferingLevelRewardRsp.proto

package emu.grasscutter.net.proto;

public final class TakeOfferingLevelRewardRspOuterClass {
  private TakeOfferingLevelRewardRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeOfferingLevelRewardRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeOfferingLevelRewardRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 offeringId = 14;</code>
     * @return The offeringId.
     */
    int getOfferingId();

    /**
     * <code>uint32 takeLevel = 1;</code>
     * @return The takeLevel.
     */
    int getTakeLevel();

    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> 
        getItemListList();
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index);
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    int getItemListCount();
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList();
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index);
  }
  /**
   * <pre>
   *enum GIALMPGJOHD {
   *	option allow_alias= true;
   *	NONE = 0;
   *	PEPPOHPHJOJ = 2907;
   *	DCDNILFDFLB = 0;
   *	NNBKOLMPOEA = 1;
   *}
   * </pre>
   *
   * Protobuf type {@code TakeOfferingLevelRewardRsp}
   */
  public static final class TakeOfferingLevelRewardRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeOfferingLevelRewardRsp)
      TakeOfferingLevelRewardRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeOfferingLevelRewardRsp.newBuilder() to construct.
    private TakeOfferingLevelRewardRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeOfferingLevelRewardRsp() {
      itemList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeOfferingLevelRewardRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeOfferingLevelRewardRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              takeLevel_ = input.readUInt32();
              break;
            }
            case 56: {

              retcode_ = input.readInt32();
              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>();
                mutable_bitField0_ |= 0x00000001;
              }
              itemList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.parser(), extensionRegistry));
              break;
            }
            case 112: {

              offeringId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          itemList_ = java.util.Collections.unmodifiableList(itemList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.internal_static_TakeOfferingLevelRewardRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.internal_static_TakeOfferingLevelRewardRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.class, emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 7;
    private int retcode_;
    /**
     * <code>int32 retcode = 7;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int OFFERINGID_FIELD_NUMBER = 14;
    private int offeringId_;
    /**
     * <code>uint32 offeringId = 14;</code>
     * @return The offeringId.
     */
    @java.lang.Override
    public int getOfferingId() {
      return offeringId_;
    }

    public static final int TAKELEVEL_FIELD_NUMBER = 1;
    private int takeLevel_;
    /**
     * <code>uint32 takeLevel = 1;</code>
     * @return The takeLevel.
     */
    @java.lang.Override
    public int getTakeLevel() {
      return takeLevel_;
    }

    public static final int ITEMLIST_FIELD_NUMBER = 10;
    private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_;
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
        getItemListOrBuilderList() {
      return itemList_;
    }
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    @java.lang.Override
    public int getItemListCount() {
      return itemList_.size();
    }
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
      return itemList_.get(index);
    }
    /**
     * <code>repeated .ItemParam itemList = 10;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
        int index) {
      return itemList_.get(index);
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
      if (takeLevel_ != 0) {
        output.writeUInt32(1, takeLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(7, retcode_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        output.writeMessage(10, itemList_.get(i));
      }
      if (offeringId_ != 0) {
        output.writeUInt32(14, offeringId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (takeLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, takeLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(7, retcode_);
      }
      for (int i = 0; i < itemList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, itemList_.get(i));
      }
      if (offeringId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, offeringId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp other = (emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getOfferingId()
          != other.getOfferingId()) return false;
      if (getTakeLevel()
          != other.getTakeLevel()) return false;
      if (!getItemListList()
          .equals(other.getItemListList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
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
      hash = (37 * hash) + OFFERINGID_FIELD_NUMBER;
      hash = (53 * hash) + getOfferingId();
      hash = (37 * hash) + TAKELEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getTakeLevel();
      if (getItemListCount() > 0) {
        hash = (37 * hash) + ITEMLIST_FIELD_NUMBER;
        hash = (53 * hash) + getItemListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp prototype) {
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
     * <pre>
     *enum GIALMPGJOHD {
     *	option allow_alias= true;
     *	NONE = 0;
     *	PEPPOHPHJOJ = 2907;
     *	DCDNILFDFLB = 0;
     *	NNBKOLMPOEA = 1;
     *}
     * </pre>
     *
     * Protobuf type {@code TakeOfferingLevelRewardRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeOfferingLevelRewardRsp)
        emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.internal_static_TakeOfferingLevelRewardRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.internal_static_TakeOfferingLevelRewardRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.class, emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getItemListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        offeringId_ = 0;

        takeLevel_ = 0;

        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.internal_static_TakeOfferingLevelRewardRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp build() {
        emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp buildPartial() {
        emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp result = new emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp(this);
        int from_bitField0_ = bitField0_;
        result.retcode_ = retcode_;
        result.offeringId_ = offeringId_;
        result.takeLevel_ = takeLevel_;
        if (itemListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            itemList_ = java.util.Collections.unmodifiableList(itemList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.itemList_ = itemList_;
        } else {
          result.itemList_ = itemListBuilder_.build();
        }
        onBuilt();
        return result;
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
        if (other instanceof emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp) {
          return mergeFrom((emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp other) {
        if (other == emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getOfferingId() != 0) {
          setOfferingId(other.getOfferingId());
        }
        if (other.getTakeLevel() != 0) {
          setTakeLevel(other.getTakeLevel());
        }
        if (itemListBuilder_ == null) {
          if (!other.itemList_.isEmpty()) {
            if (itemList_.isEmpty()) {
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureItemListIsMutable();
              itemList_.addAll(other.itemList_);
            }
            onChanged();
          }
        } else {
          if (!other.itemList_.isEmpty()) {
            if (itemListBuilder_.isEmpty()) {
              itemListBuilder_.dispose();
              itemListBuilder_ = null;
              itemList_ = other.itemList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              itemListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getItemListFieldBuilder() : null;
            } else {
              itemListBuilder_.addAllMessages(other.itemList_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
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
        emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int retcode_ ;
      /**
       * <code>int32 retcode = 7;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int offeringId_ ;
      /**
       * <code>uint32 offeringId = 14;</code>
       * @return The offeringId.
       */
      @java.lang.Override
      public int getOfferingId() {
        return offeringId_;
      }
      /**
       * <code>uint32 offeringId = 14;</code>
       * @param value The offeringId to set.
       * @return This builder for chaining.
       */
      public Builder setOfferingId(int value) {
        
        offeringId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 offeringId = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferingId() {
        
        offeringId_ = 0;
        onChanged();
        return this;
      }

      private int takeLevel_ ;
      /**
       * <code>uint32 takeLevel = 1;</code>
       * @return The takeLevel.
       */
      @java.lang.Override
      public int getTakeLevel() {
        return takeLevel_;
      }
      /**
       * <code>uint32 takeLevel = 1;</code>
       * @param value The takeLevel to set.
       * @return This builder for chaining.
       */
      public Builder setTakeLevel(int value) {
        
        takeLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 takeLevel = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTakeLevel() {
        
        takeLevel_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> itemList_ =
        java.util.Collections.emptyList();
      private void ensureItemListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          itemList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam>(itemList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> itemListBuilder_;

      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> getItemListList() {
        if (itemListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(itemList_);
        } else {
          return itemListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public int getItemListCount() {
        if (itemListBuilder_ == null) {
          return itemList_.size();
        } else {
          return itemListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam getItemList(int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);
        } else {
          return itemListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.set(index, value);
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder setItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.set(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder addItemList(emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam value) {
        if (itemListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureItemListIsMutable();
          itemList_.add(index, value);
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder addItemList(
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder addItemList(
          int index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder builderForValue) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.add(index, builderForValue.build());
          onChanged();
        } else {
          itemListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder addAllItemList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam> values) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, itemList_);
          onChanged();
        } else {
          itemListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder clearItemList() {
        if (itemListBuilder_ == null) {
          itemList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          itemListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public Builder removeItemList(int index) {
        if (itemListBuilder_ == null) {
          ensureItemListIsMutable();
          itemList_.remove(index);
          onChanged();
        } else {
          itemListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder getItemListBuilder(
          int index) {
        return getItemListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder getItemListOrBuilder(
          int index) {
        if (itemListBuilder_ == null) {
          return itemList_.get(index);  } else {
          return itemListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
           getItemListOrBuilderList() {
        if (itemListBuilder_ != null) {
          return itemListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(itemList_);
        }
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder() {
        return getItemListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder addItemListBuilder(
          int index) {
        return getItemListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.getDefaultInstance());
      }
      /**
       * <code>repeated .ItemParam itemList = 10;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder> 
           getItemListBuilderList() {
        return getItemListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder> 
          getItemListFieldBuilder() {
        if (itemListBuilder_ == null) {
          itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParam.Builder, emu.grasscutter.net.proto.ItemParamOuterClass.ItemParamOrBuilder>(
                  itemList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          itemList_ = null;
        }
        return itemListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:TakeOfferingLevelRewardRsp)
    }

    // @@protoc_insertion_point(class_scope:TakeOfferingLevelRewardRsp)
    private static final emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp();
    }

    public static emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeOfferingLevelRewardRsp>
        PARSER = new com.google.protobuf.AbstractParser<TakeOfferingLevelRewardRsp>() {
      @java.lang.Override
      public TakeOfferingLevelRewardRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeOfferingLevelRewardRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeOfferingLevelRewardRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeOfferingLevelRewardRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TakeOfferingLevelRewardRspOuterClass.TakeOfferingLevelRewardRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeOfferingLevelRewardRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeOfferingLevelRewardRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n TakeOfferingLevelRewardRsp.proto\032\017Item" +
      "Param.proto\"r\n\032TakeOfferingLevelRewardRs" +
      "p\022\017\n\007retcode\030\007 \001(\005\022\022\n\nofferingId\030\016 \001(\r\022\021" +
      "\n\ttakeLevel\030\001 \001(\r\022\034\n\010itemList\030\n \003(\0132\n.It" +
      "emParamB\033\n\031emu.grasscutter.net.protob\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor(),
        });
    internal_static_TakeOfferingLevelRewardRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeOfferingLevelRewardRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeOfferingLevelRewardRsp_descriptor,
        new java.lang.String[] { "Retcode", "OfferingId", "TakeLevel", "ItemList", });
    emu.grasscutter.net.proto.ItemParamOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}