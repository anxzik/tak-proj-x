// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: streaminginput.proto

package com.atakmap.Tak;

/**
 * Protobuf type {@code com.atakmap.ServerVersion}
 */
public  final class ServerVersion extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.atakmap.ServerVersion)
    ServerVersionOrBuilder {
  // Use ServerVersion.newBuilder() to construct.
  private ServerVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ServerVersion() {
    version_ = 0;
    compatible_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ServerVersion(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            version_ = input.readInt32();
            break;
          }
          case 16: {

            compatible_ = input.readBool();
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
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.atakmap.Tak.StreamingInputProto.internal_static_com_atakmap_ServerVersion_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.atakmap.Tak.StreamingInputProto.internal_static_com_atakmap_ServerVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.atakmap.Tak.ServerVersion.class, com.atakmap.Tak.ServerVersion.Builder.class);
  }

  public static final int VERSION_FIELD_NUMBER = 1;
  private int version_;
  /**
   * <code>optional int32 version = 1;</code>
   */
  public int getVersion() {
    return version_;
  }

  public static final int COMPATIBLE_FIELD_NUMBER = 2;
  private boolean compatible_;
  /**
   * <code>optional bool compatible = 2;</code>
   */
  public boolean getCompatible() {
    return compatible_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (version_ != 0) {
      output.writeInt32(1, version_);
    }
    if (compatible_ != false) {
      output.writeBool(2, compatible_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (version_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, version_);
    }
    if (compatible_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, compatible_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.atakmap.Tak.ServerVersion)) {
      return super.equals(obj);
    }
    com.atakmap.Tak.ServerVersion other = (com.atakmap.Tak.ServerVersion) obj;

    boolean result = true;
    result = result && (getVersion()
        == other.getVersion());
    result = result && (getCompatible()
        == other.getCompatible());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion();
    hash = (37 * hash) + COMPATIBLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getCompatible());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.atakmap.Tak.ServerVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.ServerVersion parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ServerVersion parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ServerVersion parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.atakmap.Tak.ServerVersion prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.atakmap.ServerVersion}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.atakmap.ServerVersion)
      com.atakmap.Tak.ServerVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.atakmap.Tak.StreamingInputProto.internal_static_com_atakmap_ServerVersion_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.atakmap.Tak.StreamingInputProto.internal_static_com_atakmap_ServerVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.atakmap.Tak.ServerVersion.class, com.atakmap.Tak.ServerVersion.Builder.class);
    }

    // Construct using com.atakmap.Tak.ServerVersion.newBuilder()
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
      }
    }
    public Builder clear() {
      super.clear();
      version_ = 0;

      compatible_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.atakmap.Tak.StreamingInputProto.internal_static_com_atakmap_ServerVersion_descriptor;
    }

    public com.atakmap.Tak.ServerVersion getDefaultInstanceForType() {
      return com.atakmap.Tak.ServerVersion.getDefaultInstance();
    }

    public com.atakmap.Tak.ServerVersion build() {
      com.atakmap.Tak.ServerVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.atakmap.Tak.ServerVersion buildPartial() {
      com.atakmap.Tak.ServerVersion result = new com.atakmap.Tak.ServerVersion(this);
      result.version_ = version_;
      result.compatible_ = compatible_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.atakmap.Tak.ServerVersion) {
        return mergeFrom((com.atakmap.Tak.ServerVersion)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.atakmap.Tak.ServerVersion other) {
      if (other == com.atakmap.Tak.ServerVersion.getDefaultInstance()) return this;
      if (other.getVersion() != 0) {
        setVersion(other.getVersion());
      }
      if (other.getCompatible() != false) {
        setCompatible(other.getCompatible());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.atakmap.Tak.ServerVersion parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.atakmap.Tak.ServerVersion) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int version_ ;
    /**
     * <code>optional int32 version = 1;</code>
     */
    public int getVersion() {
      return version_;
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder setVersion(int value) {
      
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 version = 1;</code>
     */
    public Builder clearVersion() {
      
      version_ = 0;
      onChanged();
      return this;
    }

    private boolean compatible_ ;
    /**
     * <code>optional bool compatible = 2;</code>
     */
    public boolean getCompatible() {
      return compatible_;
    }
    /**
     * <code>optional bool compatible = 2;</code>
     */
    public Builder setCompatible(boolean value) {
      
      compatible_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool compatible = 2;</code>
     */
    public Builder clearCompatible() {
      
      compatible_ = false;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.atakmap.ServerVersion)
  }

  // @@protoc_insertion_point(class_scope:com.atakmap.ServerVersion)
  private static final com.atakmap.Tak.ServerVersion DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.atakmap.Tak.ServerVersion();
  }

  public static com.atakmap.Tak.ServerVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ServerVersion>
      PARSER = new com.google.protobuf.AbstractParser<ServerVersion>() {
    public ServerVersion parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ServerVersion(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ServerVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ServerVersion> getParserForType() {
    return PARSER;
  }

  public com.atakmap.Tak.ServerVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

