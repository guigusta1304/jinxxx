// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeEditCustomFurnitureReq.proto

package emu.grasscutter.net.proto;

public final class HomeEditCustomFurnitureReqOuterClass {
  private HomeEditCustomFurnitureReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeEditCustomFurnitureReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeEditCustomFurnitureReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     * @return Whether the customFurnitureInfo field is set.
     */
    boolean hasCustomFurnitureInfo();
    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     * @return The customFurnitureInfo.
     */
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo();
    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     */
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder();
  }
  /**
   * Protobuf type {@code HomeEditCustomFurnitureReq}
   */
  public static final class HomeEditCustomFurnitureReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeEditCustomFurnitureReq)
      HomeEditCustomFurnitureReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeEditCustomFurnitureReq.newBuilder() to construct.
    private HomeEditCustomFurnitureReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeEditCustomFurnitureReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeEditCustomFurnitureReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.internal_static_HomeEditCustomFurnitureReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.class, emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.Builder.class);
    }

    /**
     * Protobuf enum {@code HomeEditCustomFurnitureReq.OPCOAINIFHP}
     */
    public enum OPCOAINIFHP
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>NONE = 0;</code>
       */
      NONE(0, 0),
      /**
       * <code>PEPPOHPHJOJ = 4685;</code>
       */
      PEPPOHPHJOJ(1, 4685),
      /**
       * <code>NNBKOLMPOEA = 1;</code>
       */
      NNBKOLMPOEA(3, 1),
      UNRECOGNIZED(-1, -1),
      ;

      /**
       * <code>DCDNILFDFLB = 0;</code>
       */
      public static final OPCOAINIFHP DCDNILFDFLB = NONE;
      /**
       * <code>EAJIABGAOCI = 1;</code>
       */
      public static final OPCOAINIFHP EAJIABGAOCI = NNBKOLMPOEA;
      /**
       * <code>NONE = 0;</code>
       */
      public static final int NONE_VALUE = 0;
      /**
       * <code>PEPPOHPHJOJ = 4685;</code>
       */
      public static final int PEPPOHPHJOJ_VALUE = 4685;
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
      public static OPCOAINIFHP valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static OPCOAINIFHP forNumber(int value) {
        switch (value) {
          case 0: return NONE;
          case 4685: return PEPPOHPHJOJ;
          case 1: return NNBKOLMPOEA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<OPCOAINIFHP>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          OPCOAINIFHP> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OPCOAINIFHP>() {
              public OPCOAINIFHP findValueByNumber(int number) {
                return OPCOAINIFHP.forNumber(number);
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
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final OPCOAINIFHP[] VALUES = getStaticValuesArray();
      private static OPCOAINIFHP[] getStaticValuesArray() {
        return new OPCOAINIFHP[] {
          NONE, PEPPOHPHJOJ, DCDNILFDFLB, NNBKOLMPOEA, EAJIABGAOCI, 
        };
      }
      public static OPCOAINIFHP valueOf(
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

      private OPCOAINIFHP(int index, int value) {
        this.index = index;
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:HomeEditCustomFurnitureReq.OPCOAINIFHP)
    }

    public static final int CUSTOMFURNITUREINFO_FIELD_NUMBER = 5;
    private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo customFurnitureInfo_;
    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     * @return Whether the customFurnitureInfo field is set.
     */
    @java.lang.Override
    public boolean hasCustomFurnitureInfo() {
      return customFurnitureInfo_ != null;
    }
    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     * @return The customFurnitureInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo() {
      return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
    }
    /**
     * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder() {
      return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
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
      if (customFurnitureInfo_ != null) {
        output.writeMessage(5, getCustomFurnitureInfo());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (customFurnitureInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getCustomFurnitureInfo());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq other = (emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq) obj;

      if (hasCustomFurnitureInfo() != other.hasCustomFurnitureInfo()) return false;
      if (hasCustomFurnitureInfo()) {
        if (!getCustomFurnitureInfo()
            .equals(other.getCustomFurnitureInfo())) return false;
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
      if (hasCustomFurnitureInfo()) {
        hash = (37 * hash) + CUSTOMFURNITUREINFO_FIELD_NUMBER;
        hash = (53 * hash) + getCustomFurnitureInfo().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq prototype) {
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
     * Protobuf type {@code HomeEditCustomFurnitureReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeEditCustomFurnitureReq)
        emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.internal_static_HomeEditCustomFurnitureReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.class, emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.newBuilder()
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
        customFurnitureInfo_ = null;
        if (customFurnitureInfoBuilder_ != null) {
          customFurnitureInfoBuilder_.dispose();
          customFurnitureInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.internal_static_HomeEditCustomFurnitureReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq build() {
        emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq buildPartial() {
        emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq result = new emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.customFurnitureInfo_ = customFurnitureInfoBuilder_ == null
              ? customFurnitureInfo_
              : customFurnitureInfoBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq) {
          return mergeFrom((emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq other) {
        if (other == emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq.getDefaultInstance()) return this;
        if (other.hasCustomFurnitureInfo()) {
          mergeCustomFurnitureInfo(other.getCustomFurnitureInfo());
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
              case 42: {
                input.readMessage(
                    getCustomFurnitureInfoFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 42
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

      private emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo customFurnitureInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder> customFurnitureInfoBuilder_;
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       * @return Whether the customFurnitureInfo field is set.
       */
      public boolean hasCustomFurnitureInfo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       * @return The customFurnitureInfo.
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo getCustomFurnitureInfo() {
        if (customFurnitureInfoBuilder_ == null) {
          return customFurnitureInfo_ == null ? emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
        } else {
          return customFurnitureInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public Builder setCustomFurnitureInfo(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo value) {
        if (customFurnitureInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          customFurnitureInfo_ = value;
        } else {
          customFurnitureInfoBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public Builder setCustomFurnitureInfo(
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder builderForValue) {
        if (customFurnitureInfoBuilder_ == null) {
          customFurnitureInfo_ = builderForValue.build();
        } else {
          customFurnitureInfoBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public Builder mergeCustomFurnitureInfo(emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo value) {
        if (customFurnitureInfoBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            customFurnitureInfo_ != null &&
            customFurnitureInfo_ != emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance()) {
            getCustomFurnitureInfoBuilder().mergeFrom(value);
          } else {
            customFurnitureInfo_ = value;
          }
        } else {
          customFurnitureInfoBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public Builder clearCustomFurnitureInfo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        customFurnitureInfo_ = null;
        if (customFurnitureInfoBuilder_ != null) {
          customFurnitureInfoBuilder_.dispose();
          customFurnitureInfoBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder getCustomFurnitureInfoBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getCustomFurnitureInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder getCustomFurnitureInfoOrBuilder() {
        if (customFurnitureInfoBuilder_ != null) {
          return customFurnitureInfoBuilder_.getMessageOrBuilder();
        } else {
          return customFurnitureInfo_ == null ?
              emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.getDefaultInstance() : customFurnitureInfo_;
        }
      }
      /**
       * <code>.HomeCustomFurnitureInfo customFurnitureInfo = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder> 
          getCustomFurnitureInfoFieldBuilder() {
        if (customFurnitureInfoBuilder_ == null) {
          customFurnitureInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfo.Builder, emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.HomeCustomFurnitureInfoOrBuilder>(
                  getCustomFurnitureInfo(),
                  getParentForChildren(),
                  isClean());
          customFurnitureInfo_ = null;
        }
        return customFurnitureInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeEditCustomFurnitureReq)
    }

    // @@protoc_insertion_point(class_scope:HomeEditCustomFurnitureReq)
    private static final emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq();
    }

    public static emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeEditCustomFurnitureReq>
        PARSER = new com.google.protobuf.AbstractParser<HomeEditCustomFurnitureReq>() {
      @java.lang.Override
      public HomeEditCustomFurnitureReq parsePartialFrom(
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

    public static com.google.protobuf.Parser<HomeEditCustomFurnitureReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeEditCustomFurnitureReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeEditCustomFurnitureReqOuterClass.HomeEditCustomFurnitureReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeEditCustomFurnitureReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HomeEditCustomFurnitureReq.proto\032\035Home" +
      "CustomFurnitureInfo.proto\"\265\001\n\032HomeEditCu" +
      "stomFurnitureReq\0225\n\023customFurnitureInfo\030" +
      "\005 \001(\0132\030.HomeCustomFurnitureInfo\"`\n\013OPCOA" +
      "INIFHP\022\010\n\004NONE\020\000\022\020\n\013PEPPOHPHJOJ\020\315$\022\017\n\013DC" +
      "DNILFDFLB\020\000\022\017\n\013NNBKOLMPOEA\020\001\022\017\n\013EAJIABGA" +
      "OCI\020\001\032\002\020\001B\033\n\031emu.grasscutter.net.protob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor(),
        });
    internal_static_HomeEditCustomFurnitureReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeEditCustomFurnitureReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeEditCustomFurnitureReq_descriptor,
        new java.lang.String[] { "CustomFurnitureInfo", });
    emu.grasscutter.net.proto.HomeCustomFurnitureInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
