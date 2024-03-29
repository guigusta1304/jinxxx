// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockedPersonallineData.proto

package emu.grasscutter.net.proto;

public final class LockedPersonallineDataOuterClass {
  private LockedPersonallineDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LockedPersonallineDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LockedPersonallineData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 personalLineId = 6;</code>
     * @return The personalLineId.
     */
    int getPersonalLineId();

    /**
     * <code>.LockReason lockReason = 4;</code>
     * @return The enum numeric value on the wire for lockReason.
     */
    int getLockReasonValue();
    /**
     * <code>.LockReason lockReason = 4;</code>
     * @return The lockReason.
     */
    emu.grasscutter.net.proto.LockReasonOuterClass.LockReason getLockReason();

    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return Whether the chapterId field is set.
     */
    boolean hasChapterId();
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return The chapterId.
     */
    int getChapterId();

    /**
     * <code>uint32 level = 13;</code>
     * @return Whether the level field is set.
     */
    boolean hasLevel();
    /**
     * <code>uint32 level = 13;</code>
     * @return The level.
     */
    int getLevel();

    public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.ParamCase getParamCase();
  }
  /**
   * Protobuf type {@code LockedPersonallineData}
   */
  public static final class LockedPersonallineData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LockedPersonallineData)
      LockedPersonallineDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LockedPersonallineData.newBuilder() to construct.
    private LockedPersonallineData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LockedPersonallineData() {
      lockReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LockedPersonallineData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.class, emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.Builder.class);
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      CHAPTER_ID(5),
      LEVEL(13),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 5: return CHAPTER_ID;
          case 13: return LEVEL;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int PERSONALLINEID_FIELD_NUMBER = 6;
    private int personalLineId_ = 0;
    /**
     * <code>uint32 personalLineId = 6;</code>
     * @return The personalLineId.
     */
    @java.lang.Override
    public int getPersonalLineId() {
      return personalLineId_;
    }

    public static final int LOCKREASON_FIELD_NUMBER = 4;
    private int lockReason_ = 0;
    /**
     * <code>.LockReason lockReason = 4;</code>
     * @return The enum numeric value on the wire for lockReason.
     */
    @java.lang.Override public int getLockReasonValue() {
      return lockReason_;
    }
    /**
     * <code>.LockReason lockReason = 4;</code>
     * @return The lockReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.LockReasonOuterClass.LockReason getLockReason() {
      emu.grasscutter.net.proto.LockReasonOuterClass.LockReason result = emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.forNumber(lockReason_);
      return result == null ? emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.UNRECOGNIZED : result;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 5;
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return Whether the chapterId field is set.
     */
    @java.lang.Override
    public boolean hasChapterId() {
      return paramCase_ == 5;
    }
    /**
     * <code>uint32 chapter_id = 5;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      if (paramCase_ == 5) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int LEVEL_FIELD_NUMBER = 13;
    /**
     * <code>uint32 level = 13;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return paramCase_ == 13;
    }
    /**
     * <code>uint32 level = 13;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      if (paramCase_ == 13) {
        return (java.lang.Integer) param_;
      }
      return 0;
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
      if (lockReason_ != emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.LOCK_REASON_LEVEL.getNumber()) {
        output.writeEnum(4, lockReason_);
      }
      if (paramCase_ == 5) {
        output.writeUInt32(
            5, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        output.writeUInt32(6, personalLineId_);
      }
      if (paramCase_ == 13) {
        output.writeUInt32(
            13, (int)((java.lang.Integer) param_));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lockReason_ != emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.LOCK_REASON_LEVEL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(4, lockReason_);
      }
      if (paramCase_ == 5) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              5, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, personalLineId_);
      }
      if (paramCase_ == 13) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              13, (int)((java.lang.Integer) param_));
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
      if (!(obj instanceof emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData other = (emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData) obj;

      if (getPersonalLineId()
          != other.getPersonalLineId()) return false;
      if (lockReason_ != other.lockReason_) return false;
      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 5:
          if (getChapterId()
              != other.getChapterId()) return false;
          break;
        case 13:
          if (getLevel()
              != other.getLevel()) return false;
          break;
        case 0:
        default:
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
      hash = (37 * hash) + PERSONALLINEID_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLineId();
      hash = (37 * hash) + LOCKREASON_FIELD_NUMBER;
      hash = (53 * hash) + lockReason_;
      switch (paramCase_) {
        case 5:
          hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getChapterId();
          break;
        case 13:
          hash = (37 * hash) + LEVEL_FIELD_NUMBER;
          hash = (53 * hash) + getLevel();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData prototype) {
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
     * Protobuf type {@code LockedPersonallineData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LockedPersonallineData)
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.class, emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.newBuilder()
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
        personalLineId_ = 0;
        lockReason_ = 0;
        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData build() {
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData buildPartial() {
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result = new emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        buildPartialOneofs(result);
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.personalLineId_ = personalLineId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.lockReason_ = lockReason_;
        }
      }

      private void buildPartialOneofs(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result) {
        result.paramCase_ = paramCase_;
        result.param_ = this.param_;
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
        if (other instanceof emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData) {
          return mergeFrom((emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData other) {
        if (other == emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance()) return this;
        if (other.getPersonalLineId() != 0) {
          setPersonalLineId(other.getPersonalLineId());
        }
        if (other.lockReason_ != 0) {
          setLockReasonValue(other.getLockReasonValue());
        }
        switch (other.getParamCase()) {
          case CHAPTER_ID: {
            setChapterId(other.getChapterId());
            break;
          }
          case LEVEL: {
            setLevel(other.getLevel());
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
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
                lockReason_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 32
              case 40: {
                param_ = input.readUInt32();
                paramCase_ = 5;
                break;
              } // case 40
              case 48: {
                personalLineId_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 48
              case 104: {
                param_ = input.readUInt32();
                paramCase_ = 13;
                break;
              } // case 104
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
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }

      private int bitField0_;

      private int personalLineId_ ;
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @return The personalLineId.
       */
      @java.lang.Override
      public int getPersonalLineId() {
        return personalLineId_;
      }
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @param value The personalLineId to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineId(int value) {
        
        personalLineId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 personalLineId = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        personalLineId_ = 0;
        onChanged();
        return this;
      }

      private int lockReason_ = 0;
      /**
       * <code>.LockReason lockReason = 4;</code>
       * @return The enum numeric value on the wire for lockReason.
       */
      @java.lang.Override public int getLockReasonValue() {
        return lockReason_;
      }
      /**
       * <code>.LockReason lockReason = 4;</code>
       * @param value The enum numeric value on the wire for lockReason to set.
       * @return This builder for chaining.
       */
      public Builder setLockReasonValue(int value) {
        lockReason_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.LockReason lockReason = 4;</code>
       * @return The lockReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.LockReasonOuterClass.LockReason getLockReason() {
        emu.grasscutter.net.proto.LockReasonOuterClass.LockReason result = emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.forNumber(lockReason_);
        return result == null ? emu.grasscutter.net.proto.LockReasonOuterClass.LockReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.LockReason lockReason = 4;</code>
       * @param value The lockReason to set.
       * @return This builder for chaining.
       */
      public Builder setLockReason(emu.grasscutter.net.proto.LockReasonOuterClass.LockReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        lockReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.LockReason lockReason = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearLockReason() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lockReason_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return Whether the chapterId field is set.
       */
      public boolean hasChapterId() {
        return paramCase_ == 5;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return The chapterId.
       */
      public int getChapterId() {
        if (paramCase_ == 5) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        
        paramCase_ = 5;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        if (paramCase_ == 5) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 level = 13;</code>
       * @return Whether the level field is set.
       */
      public boolean hasLevel() {
        return paramCase_ == 13;
      }
      /**
       * <code>uint32 level = 13;</code>
       * @return The level.
       */
      public int getLevel() {
        if (paramCase_ == 13) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 level = 13;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        paramCase_ = 13;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        if (paramCase_ == 13) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
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


      // @@protoc_insertion_point(builder_scope:LockedPersonallineData)
    }

    // @@protoc_insertion_point(class_scope:LockedPersonallineData)
    private static final emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData();
    }

    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LockedPersonallineData>
        PARSER = new com.google.protobuf.AbstractParser<LockedPersonallineData>() {
      @java.lang.Override
      public LockedPersonallineData parsePartialFrom(
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

    public static com.google.protobuf.Parser<LockedPersonallineData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LockedPersonallineData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LockedPersonallineData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LockedPersonallineData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034LockedPersonallineData.proto\032\020LockReas" +
      "on.proto\"\201\001\n\026LockedPersonallineData\022\026\n\016p" +
      "ersonalLineId\030\006 \001(\r\022\037\n\nlockReason\030\004 \001(\0162" +
      "\013.LockReason\022\024\n\nchapter_id\030\005 \001(\rH\000\022\017\n\005le" +
      "vel\030\r \001(\rH\000B\007\n\005paramB\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.LockReasonOuterClass.getDescriptor(),
        });
    internal_static_LockedPersonallineData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LockedPersonallineData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LockedPersonallineData_descriptor,
        new java.lang.String[] { "PersonalLineId", "LockReason", "ChapterId", "Level", "Param", });
    emu.grasscutter.net.proto.LockReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
