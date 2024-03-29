// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CombatInvokeEntry.proto

package emu.grasscutter.net.proto;

public final class CombatInvokeEntryOuterClass {
  private CombatInvokeEntryOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CombatInvokeEntryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CombatInvokeEntry)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bytes combatData = 7;</code>
     * @return The combatData.
     */
    com.google.protobuf.ByteString getCombatData();

    /**
     * <code>.CombatTypeArgument argumentType = 8;</code>
     * @return The enum numeric value on the wire for argumentType.
     */
    int getArgumentTypeValue();
    /**
     * <code>.CombatTypeArgument argumentType = 8;</code>
     * @return The argumentType.
     */
    emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType();

    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    int getForwardTypeValue();
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The forwardType.
     */
    emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType();
  }
  /**
   * Protobuf type {@code CombatInvokeEntry}
   */
  public static final class CombatInvokeEntry extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CombatInvokeEntry)
      CombatInvokeEntryOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CombatInvokeEntry.newBuilder() to construct.
    private CombatInvokeEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CombatInvokeEntry() {
      combatData_ = com.google.protobuf.ByteString.EMPTY;
      argumentType_ = 0;
      forwardType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CombatInvokeEntry();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.class, emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder.class);
    }

    public static final int COMBATDATA_FIELD_NUMBER = 7;
    private com.google.protobuf.ByteString combatData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes combatData = 7;</code>
     * @return The combatData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCombatData() {
      return combatData_;
    }

    public static final int ARGUMENTTYPE_FIELD_NUMBER = 8;
    private int argumentType_ = 0;
    /**
     * <code>.CombatTypeArgument argumentType = 8;</code>
     * @return The enum numeric value on the wire for argumentType.
     */
    @java.lang.Override public int getArgumentTypeValue() {
      return argumentType_;
    }
    /**
     * <code>.CombatTypeArgument argumentType = 8;</code>
     * @return The argumentType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
      emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument result = emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.forNumber(argumentType_);
      return result == null ? emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
    }

    public static final int FORWARDTYPE_FIELD_NUMBER = 15;
    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forwardType = 15;</code>
     * @return The forwardType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
      emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
      return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
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
      if (!combatData_.isEmpty()) {
        output.writeBytes(7, combatData_);
      }
      if (argumentType_ != emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
        output.writeEnum(8, argumentType_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        output.writeEnum(15, forwardType_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!combatData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(7, combatData_);
      }
      if (argumentType_ != emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.COMBAT_TYPE_ARGUMENT_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, argumentType_);
      }
      if (forwardType_ != emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.FORWARD_TYPE_LOCAL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(15, forwardType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry other = (emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry) obj;

      if (!getCombatData()
          .equals(other.getCombatData())) return false;
      if (argumentType_ != other.argumentType_) return false;
      if (forwardType_ != other.forwardType_) return false;
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
      hash = (37 * hash) + COMBATDATA_FIELD_NUMBER;
      hash = (53 * hash) + getCombatData().hashCode();
      hash = (37 * hash) + ARGUMENTTYPE_FIELD_NUMBER;
      hash = (53 * hash) + argumentType_;
      hash = (37 * hash) + FORWARDTYPE_FIELD_NUMBER;
      hash = (53 * hash) + forwardType_;
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry prototype) {
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
     * Protobuf type {@code CombatInvokeEntry}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CombatInvokeEntry)
        emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntryOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.class, emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.newBuilder()
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
        combatData_ = com.google.protobuf.ByteString.EMPTY;
        argumentType_ = 0;
        forwardType_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.internal_static_CombatInvokeEntry_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry build() {
        emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry buildPartial() {
        emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry result = new emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.combatData_ = combatData_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.argumentType_ = argumentType_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.forwardType_ = forwardType_;
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
        if (other instanceof emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry) {
          return mergeFrom((emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry other) {
        if (other == emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry.getDefaultInstance()) return this;
        if (other.getCombatData() != com.google.protobuf.ByteString.EMPTY) {
          setCombatData(other.getCombatData());
        }
        if (other.argumentType_ != 0) {
          setArgumentTypeValue(other.getArgumentTypeValue());
        }
        if (other.forwardType_ != 0) {
          setForwardTypeValue(other.getForwardTypeValue());
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
              case 58: {
                combatData_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 58
              case 64: {
                argumentType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 64
              case 120: {
                forwardType_ = input.readEnum();
                bitField0_ |= 0x00000004;
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

      private com.google.protobuf.ByteString combatData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes combatData = 7;</code>
       * @return The combatData.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getCombatData() {
        return combatData_;
      }
      /**
       * <code>bytes combatData = 7;</code>
       * @param value The combatData to set.
       * @return This builder for chaining.
       */
      public Builder setCombatData(com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        combatData_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>bytes combatData = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCombatData() {
        bitField0_ = (bitField0_ & ~0x00000001);
        combatData_ = getDefaultInstance().getCombatData();
        onChanged();
        return this;
      }

      private int argumentType_ = 0;
      /**
       * <code>.CombatTypeArgument argumentType = 8;</code>
       * @return The enum numeric value on the wire for argumentType.
       */
      @java.lang.Override public int getArgumentTypeValue() {
        return argumentType_;
      }
      /**
       * <code>.CombatTypeArgument argumentType = 8;</code>
       * @param value The enum numeric value on the wire for argumentType to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentTypeValue(int value) {
        argumentType_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.CombatTypeArgument argumentType = 8;</code>
       * @return The argumentType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument getArgumentType() {
        emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument result = emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.forNumber(argumentType_);
        return result == null ? emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument.UNRECOGNIZED : result;
      }
      /**
       * <code>.CombatTypeArgument argumentType = 8;</code>
       * @param value The argumentType to set.
       * @return This builder for chaining.
       */
      public Builder setArgumentType(emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.CombatTypeArgument value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        argumentType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.CombatTypeArgument argumentType = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearArgumentType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        argumentType_ = 0;
        onChanged();
        return this;
      }

      private int forwardType_ = 0;
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return The enum numeric value on the wire for forwardType.
       */
      @java.lang.Override public int getForwardTypeValue() {
        return forwardType_;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @param value The enum numeric value on the wire for forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardTypeValue(int value) {
        forwardType_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return The forwardType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType getForwardType() {
        emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType result = emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.forNumber(forwardType_);
        return result == null ? emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @param value The forwardType to set.
       * @return This builder for chaining.
       */
      public Builder setForwardType(emu.grasscutter.net.proto.ForwardTypeOuterClass.ForwardType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        forwardType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ForwardType forwardType = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearForwardType() {
        bitField0_ = (bitField0_ & ~0x00000004);
        forwardType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CombatInvokeEntry)
    }

    // @@protoc_insertion_point(class_scope:CombatInvokeEntry)
    private static final emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry();
    }

    public static emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CombatInvokeEntry>
        PARSER = new com.google.protobuf.AbstractParser<CombatInvokeEntry>() {
      @java.lang.Override
      public CombatInvokeEntry parsePartialFrom(
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

    public static com.google.protobuf.Parser<CombatInvokeEntry> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CombatInvokeEntry> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CombatInvokeEntryOuterClass.CombatInvokeEntry getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CombatInvokeEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CombatInvokeEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027CombatInvokeEntry.proto\032\030CombatTypeArg" +
      "ument.proto\032\021ForwardType.proto\"u\n\021Combat" +
      "InvokeEntry\022\022\n\ncombatData\030\007 \001(\014\022)\n\014argum" +
      "entType\030\010 \001(\0162\023.CombatTypeArgument\022!\n\013fo" +
      "rwardType\030\017 \001(\0162\014.ForwardTypeB\033\n\031emu.gra" +
      "sscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor(),
        });
    internal_static_CombatInvokeEntry_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CombatInvokeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CombatInvokeEntry_descriptor,
        new java.lang.String[] { "CombatData", "ArgumentType", "ForwardType", });
    emu.grasscutter.net.proto.CombatTypeArgumentOuterClass.getDescriptor();
    emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
