// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AvatarTeam.proto

package emu.grasscutter.net.proto;

public final class AvatarTeamOuterClass {
  private AvatarTeamOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AvatarTeamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AvatarTeam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string teamName = 11;</code>
     * @return The teamName.
     */
    java.lang.String getTeamName();
    /**
     * <code>string teamName = 11;</code>
     * @return The bytes for teamName.
     */
    com.google.protobuf.ByteString
        getTeamNameBytes();

    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @return A list containing the avatarGuidList.
     */
    java.util.List<java.lang.Long> getAvatarGuidListList();
    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @return The count of avatarGuidList.
     */
    int getAvatarGuidListCount();
    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    long getAvatarGuidList(int index);
  }
  /**
   * Protobuf type {@code AvatarTeam}
   */
  public static final class AvatarTeam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AvatarTeam)
      AvatarTeamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AvatarTeam.newBuilder() to construct.
    private AvatarTeam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AvatarTeam() {
      teamName_ = "";
      avatarGuidList_ = emptyLongList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AvatarTeam();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AvatarTeamOuterClass.internal_static_AvatarTeam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AvatarTeamOuterClass.internal_static_AvatarTeam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.class, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.Builder.class);
    }

    public static final int TEAMNAME_FIELD_NUMBER = 11;
    @SuppressWarnings("serial")
    private volatile java.lang.Object teamName_ = "";
    /**
     * <code>string teamName = 11;</code>
     * @return The teamName.
     */
    @java.lang.Override
    public java.lang.String getTeamName() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        teamName_ = s;
        return s;
      }
    }
    /**
     * <code>string teamName = 11;</code>
     * @return The bytes for teamName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTeamNameBytes() {
      java.lang.Object ref = teamName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        teamName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AVATARGUIDLIST_FIELD_NUMBER = 5;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.LongList avatarGuidList_;
    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @return A list containing the avatarGuidList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Long>
        getAvatarGuidListList() {
      return avatarGuidList_;
    }
    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @return The count of avatarGuidList.
     */
    public int getAvatarGuidListCount() {
      return avatarGuidList_.size();
    }
    /**
     * <code>repeated uint64 avatarGuidList = 5;</code>
     * @param index The index of the element to return.
     * @return The avatarGuidList at the given index.
     */
    public long getAvatarGuidList(int index) {
      return avatarGuidList_.getLong(index);
    }
    private int avatarGuidListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getAvatarGuidListList().size() > 0) {
        output.writeUInt32NoTag(42);
        output.writeUInt32NoTag(avatarGuidListMemoizedSerializedSize);
      }
      for (int i = 0; i < avatarGuidList_.size(); i++) {
        output.writeUInt64NoTag(avatarGuidList_.getLong(i));
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, teamName_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < avatarGuidList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt64SizeNoTag(avatarGuidList_.getLong(i));
        }
        size += dataSize;
        if (!getAvatarGuidListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        avatarGuidListMemoizedSerializedSize = dataSize;
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(teamName_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, teamName_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam other = (emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam) obj;

      if (!getTeamName()
          .equals(other.getTeamName())) return false;
      if (!getAvatarGuidListList()
          .equals(other.getAvatarGuidListList())) return false;
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
      hash = (37 * hash) + TEAMNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTeamName().hashCode();
      if (getAvatarGuidListCount() > 0) {
        hash = (37 * hash) + AVATARGUIDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getAvatarGuidListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam prototype) {
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
     * Protobuf type {@code AvatarTeam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AvatarTeam)
        emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AvatarTeamOuterClass.internal_static_AvatarTeam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AvatarTeamOuterClass.internal_static_AvatarTeam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.class, emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.newBuilder()
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
        teamName_ = "";
        avatarGuidList_ = emptyLongList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AvatarTeamOuterClass.internal_static_AvatarTeam_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam build() {
        emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam buildPartial() {
        emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam result = new emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam result) {
        if (((bitField0_ & 0x00000002) != 0)) {
          avatarGuidList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.avatarGuidList_ = avatarGuidList_;
      }

      private void buildPartial0(emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.teamName_ = teamName_;
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
        if (other instanceof emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam) {
          return mergeFrom((emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam other) {
        if (other == emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam.getDefaultInstance()) return this;
        if (!other.getTeamName().isEmpty()) {
          teamName_ = other.teamName_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.avatarGuidList_.isEmpty()) {
          if (avatarGuidList_.isEmpty()) {
            avatarGuidList_ = other.avatarGuidList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAvatarGuidListIsMutable();
            avatarGuidList_.addAll(other.avatarGuidList_);
          }
          onChanged();
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
                long v = input.readUInt64();
                ensureAvatarGuidListIsMutable();
                avatarGuidList_.addLong(v);
                break;
              } // case 40
              case 42: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAvatarGuidListIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  avatarGuidList_.addLong(input.readUInt64());
                }
                input.popLimit(limit);
                break;
              } // case 42
              case 90: {
                teamName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 90
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

      private java.lang.Object teamName_ = "";
      /**
       * <code>string teamName = 11;</code>
       * @return The teamName.
       */
      public java.lang.String getTeamName() {
        java.lang.Object ref = teamName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          teamName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string teamName = 11;</code>
       * @return The bytes for teamName.
       */
      public com.google.protobuf.ByteString
          getTeamNameBytes() {
        java.lang.Object ref = teamName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          teamName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string teamName = 11;</code>
       * @param value The teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamName(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        teamName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string teamName = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearTeamName() {
        teamName_ = getDefaultInstance().getTeamName();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string teamName = 11;</code>
       * @param value The bytes for teamName to set.
       * @return This builder for chaining.
       */
      public Builder setTeamNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        teamName_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.LongList avatarGuidList_ = emptyLongList();
      private void ensureAvatarGuidListIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          avatarGuidList_ = mutableCopy(avatarGuidList_);
          bitField0_ |= 0x00000002;
        }
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @return A list containing the avatarGuidList.
       */
      public java.util.List<java.lang.Long>
          getAvatarGuidListList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(avatarGuidList_) : avatarGuidList_;
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @return The count of avatarGuidList.
       */
      public int getAvatarGuidListCount() {
        return avatarGuidList_.size();
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @param index The index of the element to return.
       * @return The avatarGuidList at the given index.
       */
      public long getAvatarGuidList(int index) {
        return avatarGuidList_.getLong(index);
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @param index The index to set the value at.
       * @param value The avatarGuidList to set.
       * @return This builder for chaining.
       */
      public Builder setAvatarGuidList(
          int index, long value) {
        
        ensureAvatarGuidListIsMutable();
        avatarGuidList_.setLong(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @param value The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAvatarGuidList(long value) {
        
        ensureAvatarGuidListIsMutable();
        avatarGuidList_.addLong(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @param values The avatarGuidList to add.
       * @return This builder for chaining.
       */
      public Builder addAllAvatarGuidList(
          java.lang.Iterable<? extends java.lang.Long> values) {
        ensureAvatarGuidListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarGuidList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint64 avatarGuidList = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAvatarGuidList() {
        avatarGuidList_ = emptyLongList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:AvatarTeam)
    }

    // @@protoc_insertion_point(class_scope:AvatarTeam)
    private static final emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam();
    }

    public static emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AvatarTeam>
        PARSER = new com.google.protobuf.AbstractParser<AvatarTeam>() {
      @java.lang.Override
      public AvatarTeam parsePartialFrom(
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

    public static com.google.protobuf.Parser<AvatarTeam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AvatarTeam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AvatarTeamOuterClass.AvatarTeam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarTeam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarTeam_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020AvatarTeam.proto\"6\n\nAvatarTeam\022\020\n\010team" +
      "Name\030\013 \001(\t\022\026\n\016avatarGuidList\030\005 \003(\004B\033\n\031em" +
      "u.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AvatarTeam_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AvatarTeam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarTeam_descriptor,
        new java.lang.String[] { "TeamName", "AvatarGuidList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
