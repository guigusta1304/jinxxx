// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerEnterDungeonReq.proto

package emu.grasscutter.net.proto;

public final class PlayerEnterDungeonReqOuterClass {
  private PlayerEnterDungeonReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerEnterDungeonReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerEnterDungeonReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 dungeonId = 2;</code>
     * @return The dungeonId.
     */
    int getDungeonId();

    /**
     * <code>uint32 pointId = 9;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     * @return Whether the enterPosInfo field is set.
     */
    boolean hasEnterPosInfo();
    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     * @return The enterPosInfo.
     */
    emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo();
    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     */
    emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder();
  }
  /**
   * Protobuf type {@code PlayerEnterDungeonReq}
   */
  public static final class PlayerEnterDungeonReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerEnterDungeonReq)
      PlayerEnterDungeonReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerEnterDungeonReq.newBuilder() to construct.
    private PlayerEnterDungeonReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerEnterDungeonReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerEnterDungeonReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
    }

    /**
     * Protobuf enum {@code PlayerEnterDungeonReq.IGBPMBLKBOF}
     */
    public enum IGBPMBLKBOF
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 987;</code>
       */
      PEPPOHPHJOJ(1, 987),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final IGBPMBLKBOF DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final IGBPMBLKBOF EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 987;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 987;
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
      public static IGBPMBLKBOF valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static IGBPMBLKBOF forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 987: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IGBPMBLKBOF>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IGBPMBLKBOF> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IGBPMBLKBOF>() {
              public IGBPMBLKBOF findValueByNumber(int number) {
                return IGBPMBLKBOF.forNumber(number);
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
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final IGBPMBLKBOF[] VALUES = getStaticValuesArray();
      private static IGBPMBLKBOF[] getStaticValuesArray() {
        return new IGBPMBLKBOF[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static IGBPMBLKBOF valueOf(
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

      private IGBPMBLKBOF(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:PlayerEnterDungeonReq.IGBPMBLKBOF)
    }

    public static final int DUNGEONID_FIELD_NUMBER = 2;
    private int dungeonId_ = 0;
    /**
     * <code>uint32 dungeonId = 2;</code>
     * @return The dungeonId.
     */
    @java.lang.Override
    public int getDungeonId() {
      return dungeonId_;
    }

    public static final int POINTID_FIELD_NUMBER = 9;
    private int pointId_ = 0;
    /**
     * <code>uint32 pointId = 9;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int ENTERPOSINFO_FIELD_NUMBER = 4;
    private emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo enterPosInfo_;
    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     * @return Whether the enterPosInfo field is set.
     */
    @java.lang.Override
    public boolean hasEnterPosInfo() {
      return enterPosInfo_ != null;
    }
    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     * @return The enterPosInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo() {
      return enterPosInfo_ == null ? emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
    }
    /**
     * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder() {
      return enterPosInfo_ == null ? emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
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
      if (dungeonId_ != 0) {
        output.writeUInt32(2, dungeonId_);
      }
      if (enterPosInfo_ != null) {
        output.writeMessage(4, getEnterPosInfo());
      }
      if (pointId_ != 0) {
        output.writeUInt32(9, pointId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dungeonId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, dungeonId_);
      }
      if (enterPosInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getEnterPosInfo());
      }
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, pointId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other = (emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) obj;

      if (getDungeonId()
          != other.getDungeonId()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (hasEnterPosInfo() != other.hasEnterPosInfo()) return false;
      if (hasEnterPosInfo()) {
        if (!getEnterPosInfo()
            .equals(other.getEnterPosInfo())) return false;
      }
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
      hash = (37 * hash) + DUNGEONID_FIELD_NUMBER;
      hash = (53 * hash) + getDungeonId();
      hash = (37 * hash) + POINTID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      if (hasEnterPosInfo()) {
        hash = (37 * hash) + ENTERPOSINFO_FIELD_NUMBER;
        hash = (53 * hash) + getEnterPosInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq prototype) {
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
     * Protobuf type {@code PlayerEnterDungeonReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerEnterDungeonReq)
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.class, emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.newBuilder()
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
        dungeonId_ = 0;
        pointId_ = 0;
        enterPosInfo_ = null;
        if (enterPosInfoBuilder_ != null) {
          enterPosInfoBuilder_.dispose();
          enterPosInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.internal_static_PlayerEnterDungeonReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq build() {
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq buildPartial() {
        emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result = new emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.dungeonId_ = dungeonId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.pointId_ = pointId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.enterPosInfo_ = enterPosInfoBuilder_ == null
              ? enterPosInfo_
              : enterPosInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq) {
          return mergeFrom((emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq other) {
        if (other == emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq.getDefaultInstance()) return this;
        if (other.getDungeonId() != 0) {
          setDungeonId(other.getDungeonId());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.hasEnterPosInfo()) {
          mergeEnterPosInfo(other.getEnterPosInfo());
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
              case 16: {
                dungeonId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
              case 34: {
                input.readMessage(
                    getEnterPosInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000004;
                break;
              } // case 34
              case 72: {
                pointId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 72
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

      private int dungeonId_ ;
      /**
       * <code>uint32 dungeonId = 2;</code>
       * @return The dungeonId.
       */
      @java.lang.Override
      public int getDungeonId() {
        return dungeonId_;
      }
      /**
       * <code>uint32 dungeonId = 2;</code>
       * @param value The dungeonId to set.
       * @return This builder for chaining.
       */
      public Builder setDungeonId(int value) {
        
        dungeonId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 dungeonId = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearDungeonId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        dungeonId_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 pointId = 9;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 pointId = 9;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 pointId = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        pointId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo enterPosInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder> enterPosInfoBuilder_;
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       * @return Whether the enterPosInfo field is set.
       */
      public boolean hasEnterPosInfo() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       * @return The enterPosInfo.
       */
      public emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo getEnterPosInfo() {
        if (enterPosInfoBuilder_ == null) {
          return enterPosInfo_ == null ? emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
        } else {
          return enterPosInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public Builder setEnterPosInfo(emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo value) {
        if (enterPosInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          enterPosInfo_ = value;
        } else {
          enterPosInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public Builder setEnterPosInfo(
          emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder builderForValue) {
        if (enterPosInfoBuilder_ == null) {
          enterPosInfo_ = builderForValue.build();
        } else {
          enterPosInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public Builder mergeEnterPosInfo(emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo value) {
        if (enterPosInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
            enterPosInfo_ != null &&
            enterPosInfo_ != emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance()) {
            getEnterPosInfoBuilder().mergeFrom(value);
          } else {
            enterPosInfo_ = value;
          }
        } else {
          enterPosInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public Builder clearEnterPosInfo() {
        bitField0_ = (bitField0_ & ~0x00000004);
        enterPosInfo_ = null;
        if (enterPosInfoBuilder_ != null) {
          enterPosInfoBuilder_.dispose();
          enterPosInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder getEnterPosInfoBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getEnterPosInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      public emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder getEnterPosInfoOrBuilder() {
        if (enterPosInfoBuilder_ != null) {
          return enterPosInfoBuilder_.getMessageOrBuilder();
        } else {
          return enterPosInfo_ == null ?
              emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.getDefaultInstance() : enterPosInfo_;
        }
      }
      /**
       * <code>.DungeonEnterPosInfo enterPosInfo = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder> 
          getEnterPosInfoFieldBuilder() {
        if (enterPosInfoBuilder_ == null) {
          enterPosInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfo.Builder, emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.DungeonEnterPosInfoOrBuilder>(
                  getEnterPosInfo(),
                  getParentForChildren(),
                  isClean());
          enterPosInfo_ = null;
        }
        return enterPosInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PlayerEnterDungeonReq)
    }

    // @@protoc_insertion_point(class_scope:PlayerEnterDungeonReq)
    private static final emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq();
    }

    public static emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerEnterDungeonReq>
        PARSER = new com.google.protobuf.AbstractParser<PlayerEnterDungeonReq>() {
      @java.lang.Override
      public PlayerEnterDungeonReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<PlayerEnterDungeonReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerEnterDungeonReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PlayerEnterDungeonReqOuterClass.PlayerEnterDungeonReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerEnterDungeonReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerEnterDungeonReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerEnterDungeonReq.proto\032\031DungeonEn" +
      "terPosInfo.proto\"\311\001\n\025PlayerEnterDungeonR" +
      "eq\022\021\n\tdungeonId\030\002 \001(\r\022\017\n\007pointId\030\t \001(\r\022*" +
      "\n\014enterPosInfo\030\004 \001(\0132\024.DungeonEnterPosIn" +
      "fo\"`\n\013IGBPMBLKBOF\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJ" +
      "OJ\020\333\007\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022" +
      "\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.getDescriptor(),
        });
    internal_static_PlayerEnterDungeonReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerEnterDungeonReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerEnterDungeonReq_descriptor,
        new java.lang.String[] { "DungeonId", "PointId", "EnterPosInfo", });
    emu.grasscutter.net.proto.DungeonEnterPosInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
