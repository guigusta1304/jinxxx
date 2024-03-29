// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestCreateEntityReq.proto

package emu.grasscutter.net.proto;

public final class QuestCreateEntityReqOuterClass {
  private QuestCreateEntityReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestCreateEntityReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestCreateEntityReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 parentQuestId = 4;</code>
     * @return The parentQuestId.
     */
    int getParentQuestId();

    /**
     * <code>bool isRewind = 12;</code>
     * @return The isRewind.
     */
    boolean getIsRewind();

    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     * @return Whether the entity field is set.
     */
    boolean hasEntity();
    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     * @return The entity.
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity();
    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     */
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder();

    /**
     * <code>uint32 questId = 10;</code>
     * @return The questId.
     */
    int getQuestId();
  }
  /**
   * Protobuf type {@code QuestCreateEntityReq}
   */
  public static final class QuestCreateEntityReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestCreateEntityReq)
      QuestCreateEntityReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestCreateEntityReq.newBuilder() to construct.
    private QuestCreateEntityReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestCreateEntityReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestCreateEntityReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
    }

    /**
     * Protobuf enum {@code QuestCreateEntityReq.MKFMDGNPOMH}
     */
    public enum MKFMDGNPOMH
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 414;</code>
       */
      PEPPOHPHJOJ(1, 414),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final MKFMDGNPOMH DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final MKFMDGNPOMH EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 414;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 414;
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
      public static MKFMDGNPOMH valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static MKFMDGNPOMH forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 414: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<MKFMDGNPOMH>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          MKFMDGNPOMH> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<MKFMDGNPOMH>() {
              public MKFMDGNPOMH findValueByNumber(int number) {
                return MKFMDGNPOMH.forNumber(number);
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
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final MKFMDGNPOMH[] VALUES = getStaticValuesArray();
      private static MKFMDGNPOMH[] getStaticValuesArray() {
        return new MKFMDGNPOMH[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static MKFMDGNPOMH valueOf(
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

      private MKFMDGNPOMH(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:QuestCreateEntityReq.MKFMDGNPOMH)
    }

    public static final int PARENTQUESTID_FIELD_NUMBER = 4;
    private int parentQuestId_ = 0;
    /**
     * <code>uint32 parentQuestId = 4;</code>
     * @return The parentQuestId.
     */
    @java.lang.Override
    public int getParentQuestId() {
      return parentQuestId_;
    }

    public static final int ISREWIND_FIELD_NUMBER = 12;
    private boolean isRewind_ = false;
    /**
     * <code>bool isRewind = 12;</code>
     * @return The isRewind.
     */
    @java.lang.Override
    public boolean getIsRewind() {
      return isRewind_;
    }

    public static final int ENTITY_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     * @return Whether the entity field is set.
     */
    @java.lang.Override
    public boolean hasEntity() {
      return entity_ != null;
    }
    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     * @return The entity.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
      return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }
    /**
     * <code>.CreateEntityInfo entity = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
      return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
    }

    public static final int QUESTID_FIELD_NUMBER = 10;
    private int questId_ = 0;
    /**
     * <code>uint32 questId = 10;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
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
      if (parentQuestId_ != 0) {
        output.writeUInt32(4, parentQuestId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(10, questId_);
      }
      if (entity_ != null) {
        output.writeMessage(11, getEntity());
      }
      if (isRewind_ != false) {
        output.writeBool(12, isRewind_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (parentQuestId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, parentQuestId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, questId_);
      }
      if (entity_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getEntity());
      }
      if (isRewind_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(12, isRewind_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other = (emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) obj;

      if (getParentQuestId()
          != other.getParentQuestId()) return false;
      if (getIsRewind()
          != other.getIsRewind()) return false;
      if (hasEntity() != other.hasEntity()) return false;
      if (hasEntity()) {
        if (!getEntity()
            .equals(other.getEntity())) return false;
      }
      if (getQuestId()
          != other.getQuestId()) return false;
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
      hash = (37 * hash) + PARENTQUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getParentQuestId();
      hash = (37 * hash) + ISREWIND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsRewind());
      if (hasEntity()) {
        hash = (37 * hash) + ENTITY_FIELD_NUMBER;
        hash = (53 * hash) + getEntity().hashCode();
      }
      hash = (37 * hash) + QUESTID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq prototype) {
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
     * Protobuf type {@code QuestCreateEntityReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestCreateEntityReq)
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.class, emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.newBuilder()
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
        parentQuestId_ = 0;
        isRewind_ = false;
        entity_ = null;
        if (entityBuilder_ != null) {
          entityBuilder_.dispose();
          entityBuilder_ = null;
        }
        questId_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.internal_static_QuestCreateEntityReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq build() {
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq buildPartial() {
        emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result = new emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.parentQuestId_ = parentQuestId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.isRewind_ = isRewind_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.entity_ = entityBuilder_ == null
              ? entity_
              : entityBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.questId_ = questId_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq other) {
        if (other == emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq.getDefaultInstance()) return this;
        if (other.getParentQuestId() != 0) {
          setParentQuestId(other.getParentQuestId());
        }
        if (other.getIsRewind() != false) {
          setIsRewind(other.getIsRewind());
        }
        if (other.hasEntity()) {
          mergeEntity(other.getEntity());
        }
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
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
              case 32: {
                parentQuestId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 32
              case 80: {
                questId_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 80
              case 90: {
                input.readMessage(
                    getEntityFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 90
              case 96: {
                isRewind_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 96
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

      private int parentQuestId_ ;
      /**
       * <code>uint32 parentQuestId = 4;</code>
       * @return The parentQuestId.
       */
      @java.lang.Override
      public int getParentQuestId() {
        return parentQuestId_;
      }
      /**
       * <code>uint32 parentQuestId = 4;</code>
       * @param value The parentQuestId to set.
       * @return This builder for chaining.
       */
      public Builder setParentQuestId(int value) {
        
        parentQuestId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 parentQuestId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParentQuestId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        parentQuestId_ = 0;
        onChanged();
        return this;
      }

      private boolean isRewind_ ;
      /**
       * <code>bool isRewind = 12;</code>
       * @return The isRewind.
       */
      @java.lang.Override
      public boolean getIsRewind() {
        return isRewind_;
      }
      /**
       * <code>bool isRewind = 12;</code>
       * @param value The isRewind to set.
       * @return This builder for chaining.
       */
      public Builder setIsRewind(boolean value) {
        
        isRewind_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>bool isRewind = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsRewind() {
        bitField0_ = (bitField0_ & ~0x00000002);
        isRewind_ = false;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo entity_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> entityBuilder_;
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       * @return Whether the entity field is set.
       */
      public boolean hasEntity() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       * @return The entity.
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo getEntity() {
        if (entityBuilder_ == null) {
          return entity_ == null ? emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        } else {
          return entityBuilder_.getMessage();
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public Builder setEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          entity_ = value;
        } else {
          entityBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public Builder setEntity(
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder builderForValue) {
        if (entityBuilder_ == null) {
          entity_ = builderForValue.build();
        } else {
          entityBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public Builder mergeEntity(emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo value) {
        if (entityBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            entity_ != null &&
            entity_ != emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance()) {
            getEntityBuilder().mergeFrom(value);
          } else {
            entity_ = value;
          }
        } else {
          entityBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public Builder clearEntity() {
        bitField0_ = (bitField0_ & ~0x00000004);
        entity_ = null;
        if (entityBuilder_ != null) {
          entityBuilder_.dispose();
          entityBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder getEntityBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getEntityFieldBuilder().getBuilder();
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      public emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder getEntityOrBuilder() {
        if (entityBuilder_ != null) {
          return entityBuilder_.getMessageOrBuilder();
        } else {
          return entity_ == null ?
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.getDefaultInstance() : entity_;
        }
      }
      /**
       * <code>.CreateEntityInfo entity = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder> 
          getEntityFieldBuilder() {
        if (entityBuilder_ == null) {
          entityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfo.Builder, emu.grasscutter.net.proto.CreateEntityInfoOuterClass.CreateEntityInfoOrBuilder>(
                  getEntity(),
                  getParentForChildren(),
                  isClean());
          entity_ = null;
        }
        return entityBuilder_;
      }

      private int questId_ ;
      /**
       * <code>uint32 questId = 10;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 questId = 10;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 questId = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        questId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestCreateEntityReq)
    }

    // @@protoc_insertion_point(class_scope:QuestCreateEntityReq)
    private static final emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq();
    }

    public static emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestCreateEntityReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestCreateEntityReq>() {
      @java.lang.Override
      public QuestCreateEntityReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<QuestCreateEntityReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestCreateEntityReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestCreateEntityReqOuterClass.QuestCreateEntityReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestCreateEntityReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestCreateEntityReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032QuestCreateEntityReq.proto\032\026CreateEnti" +
      "tyInfo.proto\"\325\001\n\024QuestCreateEntityReq\022\025\n" +
      "\rparentQuestId\030\004 \001(\r\022\020\n\010isRewind\030\014 \001(\010\022!" +
      "\n\006entity\030\013 \001(\0132\021.CreateEntityInfo\022\017\n\007que" +
      "stId\030\n \001(\r\"`\n\013MKFMDGNPOMH\022\010\n\004NONE\020\000\022\020\n\013P" +
      "EPPOHPHJOJ\020\236\003\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOL" +
      "MPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor(),
        });
    internal_static_QuestCreateEntityReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestCreateEntityReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestCreateEntityReq_descriptor,
        new java.lang.String[] { "ParentQuestId", "IsRewind", "Entity", "QuestId", });
    emu.grasscutter.net.proto.CreateEntityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
