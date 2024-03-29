// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EvtAvatarSitDownNotify.proto

package emu.grasscutter.net.proto;

public final class EvtAvatarSitDownNotifyOuterClass {
  private EvtAvatarSitDownNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EvtAvatarSitDownNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EvtAvatarSitDownNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.Vector position = 2;</code>
     * @return Whether the position field is set.
     */
    boolean hasPosition();
    /**
     * <code>.Vector position = 2;</code>
     * @return The position.
     */
    emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition();
    /**
     * <code>.Vector position = 2;</code>
     */
    emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder();

    /**
     * <code>uint32 entityId = 4;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>uint64 chairId = 11;</code>
     * @return The chairId.
     */
    long getChairId();
  }
  /**
   * Protobuf type {@code EvtAvatarSitDownNotify}
   */
  public static final class EvtAvatarSitDownNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EvtAvatarSitDownNotify)
      EvtAvatarSitDownNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EvtAvatarSitDownNotify.newBuilder() to construct.
    private EvtAvatarSitDownNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EvtAvatarSitDownNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EvtAvatarSitDownNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.class, emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.Builder.class);
    }

    /**
     * Protobuf enum {@code EvtAvatarSitDownNotify.EHJKHGFNIEL}
     */
    public enum EHJKHGFNIEL
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 353;</code>
       */
      PEPPOHPHJOJ(1, 353),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final EHJKHGFNIEL DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final EHJKHGFNIEL EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 353;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 353;
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
      public static EHJKHGFNIEL valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static EHJKHGFNIEL forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 353: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<EHJKHGFNIEL>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          EHJKHGFNIEL> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EHJKHGFNIEL>() {
              public EHJKHGFNIEL findValueByNumber(int number) {
                return EHJKHGFNIEL.forNumber(number);
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
        return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.getDescriptor().getEnumTypes().get(0);
      }

      private static final EHJKHGFNIEL[] VALUES = getStaticValuesArray();
      private static EHJKHGFNIEL[] getStaticValuesArray() {
        return new EHJKHGFNIEL[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static EHJKHGFNIEL valueOf(
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

      private EHJKHGFNIEL(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:EvtAvatarSitDownNotify.EHJKHGFNIEL)
    }

    public static final int POSITION_FIELD_NUMBER = 2;
    private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
    /**
     * <code>.Vector position = 2;</code>
     * @return Whether the position field is set.
     */
    @java.lang.Override
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <code>.Vector position = 2;</code>
     * @return The position.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
      return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }
    /**
     * <code>.Vector position = 2;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
      return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
    }

    public static final int ENTITYID_FIELD_NUMBER = 4;
    private int entityId_ = 0;
    /**
     * <code>uint32 entityId = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int CHAIRID_FIELD_NUMBER = 11;
    private long chairId_ = 0L;
    /**
     * <code>uint64 chairId = 11;</code>
     * @return The chairId.
     */
    @java.lang.Override
    public long getChairId() {
      return chairId_;
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
      if (position_ != null) {
        output.writeMessage(2, getPosition());
      }
      if (entityId_ != 0) {
        output.writeUInt32(4, entityId_);
      }
      if (chairId_ != 0L) {
        output.writeUInt64(11, chairId_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getPosition());
      }
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, entityId_);
      }
      if (chairId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(11, chairId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify other = (emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify) obj;

      if (hasPosition() != other.hasPosition()) return false;
      if (hasPosition()) {
        if (!getPosition()
            .equals(other.getPosition())) return false;
      }
      if (getEntityId()
          != other.getEntityId()) return false;
      if (getChairId()
          != other.getChairId()) return false;
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
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + ENTITYID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      hash = (37 * hash) + CHAIRID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getChairId());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify prototype) {
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
     * Protobuf type {@code EvtAvatarSitDownNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EvtAvatarSitDownNotify)
        emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.class, emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.newBuilder()
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
        position_ = null;
        if (positionBuilder_ != null) {
          positionBuilder_.dispose();
          positionBuilder_ = null;
        }
        entityId_ = 0;
        chairId_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.internal_static_EvtAvatarSitDownNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify build() {
        emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify buildPartial() {
        emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify result = new emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.position_ = positionBuilder_ == null
              ? position_
              : positionBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.entityId_ = entityId_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.chairId_ = chairId_;
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
        if (other instanceof emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify) {
          return mergeFrom((emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify other) {
        if (other == emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify.getDefaultInstance()) return this;
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.getChairId() != 0L) {
          setChairId(other.getChairId());
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
              case 18: {
                input.readMessage(
                    getPositionFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 18
              case 32: {
                entityId_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 88: {
                chairId_ = input.readUInt64();
                bitField0_ |= 0x00000004;
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

      private emu.grasscutter.net.proto.VectorOuterClass.Vector position_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> positionBuilder_;
      /**
       * <code>.Vector position = 2;</code>
       * @return Whether the position field is set.
       */
      public boolean hasPosition() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.Vector position = 2;</code>
       * @return The position.
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public Builder setPosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
        } else {
          positionBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public Builder setPosition(
          emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public Builder mergePosition(emu.grasscutter.net.proto.VectorOuterClass.Vector value) {
        if (positionBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            position_ != null &&
            position_ != emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance()) {
            getPositionBuilder().mergeFrom(value);
          } else {
            position_ = value;
          }
        } else {
          positionBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public Builder clearPosition() {
        bitField0_ = (bitField0_ & ~0x00000001);
        position_ = null;
        if (positionBuilder_ != null) {
          positionBuilder_.dispose();
          positionBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder getPositionBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      public emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              emu.grasscutter.net.proto.VectorOuterClass.Vector.getDefaultInstance() : position_;
        }
      }
      /**
       * <code>.Vector position = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VectorOuterClass.Vector, emu.grasscutter.net.proto.VectorOuterClass.Vector.Builder, emu.grasscutter.net.proto.VectorOuterClass.VectorOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entityId = 4;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entityId = 4;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entityId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        entityId_ = 0;
        onChanged();
        return this;
      }

      private long chairId_ ;
      /**
       * <code>uint64 chairId = 11;</code>
       * @return The chairId.
       */
      @java.lang.Override
      public long getChairId() {
        return chairId_;
      }
      /**
       * <code>uint64 chairId = 11;</code>
       * @param value The chairId to set.
       * @return This builder for chaining.
       */
      public Builder setChairId(long value) {
        
        chairId_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 chairId = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearChairId() {
        bitField0_ = (bitField0_ & ~0x00000004);
        chairId_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:EvtAvatarSitDownNotify)
    }

    // @@protoc_insertion_point(class_scope:EvtAvatarSitDownNotify)
    private static final emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify();
    }

    public static emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EvtAvatarSitDownNotify>
        PARSER = new com.google.protobuf.AbstractParser<EvtAvatarSitDownNotify>() {
      @java.lang.Override
      public EvtAvatarSitDownNotify parsePartialFrom(
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

    public static com.google.protobuf.Parser<EvtAvatarSitDownNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EvtAvatarSitDownNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.EvtAvatarSitDownNotifyOuterClass.EvtAvatarSitDownNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EvtAvatarSitDownNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EvtAvatarSitDownNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034EvtAvatarSitDownNotify.proto\032\014Vector.p" +
      "roto\"\270\001\n\026EvtAvatarSitDownNotify\022\031\n\010posit" +
      "ion\030\002 \001(\0132\007.Vector\022\020\n\010entityId\030\004 \001(\r\022\017\n\007" +
      "chairId\030\013 \001(\004\"`\n\013EHJKHGFNIEL\022\010\n\004NONE\020\000\022\020" +
      "\n\013PEPPOHPHJOJ\020\341\002\022\017\n\013DCDNILFDFLB\020\000\022\017\n\013NNB" +
      "KOLMPOEA\020\001\022\017\n\013EAJIABGAOCI\020\001\032\002\020\001B\033\n\031emu.g" +
      "rasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorOuterClass.getDescriptor(),
        });
    internal_static_EvtAvatarSitDownNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EvtAvatarSitDownNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EvtAvatarSitDownNotify_descriptor,
        new java.lang.String[] { "Position", "EntityId", "ChairId", });
    emu.grasscutter.net.proto.VectorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
