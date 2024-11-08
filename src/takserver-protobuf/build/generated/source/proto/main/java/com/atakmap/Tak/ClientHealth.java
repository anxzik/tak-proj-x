// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fig.proto

package com.atakmap.Tak;

/**
 * Protobuf type {@code com.atakmap.ClientHealth}
 */
public  final class ClientHealth extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.atakmap.ClientHealth)
    ClientHealthOrBuilder {
  // Use ClientHealth.newBuilder() to construct.
  private ClientHealth(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClientHealth() {
    status_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClientHealth(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
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
    return com.atakmap.Tak.FigProto.internal_static_com_atakmap_ClientHealth_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.atakmap.Tak.FigProto.internal_static_com_atakmap_ClientHealth_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.atakmap.Tak.ClientHealth.class, com.atakmap.Tak.ClientHealth.Builder.class);
  }

  /**
   * Protobuf enum {@code com.atakmap.ClientHealth.ServingStatus}
   */
  public enum ServingStatus
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UNKNOWN = 0;</code>
     */
    UNKNOWN(0),
    /**
     * <code>SERVING = 1;</code>
     */
    SERVING(1),
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    NOT_SERVING(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>UNKNOWN = 0;</code>
     */
    public static final int UNKNOWN_VALUE = 0;
    /**
     * <code>SERVING = 1;</code>
     */
    public static final int SERVING_VALUE = 1;
    /**
     * <code>NOT_SERVING = 2;</code>
     */
    public static final int NOT_SERVING_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServingStatus valueOf(int value) {
      return forNumber(value);
    }

    public static ServingStatus forNumber(int value) {
      switch (value) {
        case 0: return UNKNOWN;
        case 1: return SERVING;
        case 2: return NOT_SERVING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServingStatus>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ServingStatus> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServingStatus>() {
            public ServingStatus findValueByNumber(int number) {
              return ServingStatus.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.atakmap.Tak.ClientHealth.getDescriptor().getEnumTypes().get(0);
    }

    private static final ServingStatus[] VALUES = values();

    public static ServingStatus valueOf(
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

    private final int value;

    private ServingStatus(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:com.atakmap.ClientHealth.ServingStatus)
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
   */
  public com.atakmap.Tak.ClientHealth.ServingStatus getStatus() {
    com.atakmap.Tak.ClientHealth.ServingStatus result = com.atakmap.Tak.ClientHealth.ServingStatus.valueOf(status_);
    return result == null ? com.atakmap.Tak.ClientHealth.ServingStatus.UNRECOGNIZED : result;
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
    if (status_ != com.atakmap.Tak.ClientHealth.ServingStatus.UNKNOWN.getNumber()) {
      output.writeEnum(1, status_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != com.atakmap.Tak.ClientHealth.ServingStatus.UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, status_);
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
    if (!(obj instanceof com.atakmap.Tak.ClientHealth)) {
      return super.equals(obj);
    }
    com.atakmap.Tak.ClientHealth other = (com.atakmap.Tak.ClientHealth) obj;

    boolean result = true;
    result = result && status_ == other.status_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.atakmap.Tak.ClientHealth parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.ClientHealth parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ClientHealth parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.atakmap.Tak.ClientHealth parseFrom(
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
  public static Builder newBuilder(com.atakmap.Tak.ClientHealth prototype) {
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
   * Protobuf type {@code com.atakmap.ClientHealth}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.atakmap.ClientHealth)
      com.atakmap.Tak.ClientHealthOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_ClientHealth_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_ClientHealth_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.atakmap.Tak.ClientHealth.class, com.atakmap.Tak.ClientHealth.Builder.class);
    }

    // Construct using com.atakmap.Tak.ClientHealth.newBuilder()
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
      status_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.atakmap.Tak.FigProto.internal_static_com_atakmap_ClientHealth_descriptor;
    }

    public com.atakmap.Tak.ClientHealth getDefaultInstanceForType() {
      return com.atakmap.Tak.ClientHealth.getDefaultInstance();
    }

    public com.atakmap.Tak.ClientHealth build() {
      com.atakmap.Tak.ClientHealth result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.atakmap.Tak.ClientHealth buildPartial() {
      com.atakmap.Tak.ClientHealth result = new com.atakmap.Tak.ClientHealth(this);
      result.status_ = status_;
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
      if (other instanceof com.atakmap.Tak.ClientHealth) {
        return mergeFrom((com.atakmap.Tak.ClientHealth)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.atakmap.Tak.ClientHealth other) {
      if (other == com.atakmap.Tak.ClientHealth.getDefaultInstance()) return this;
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
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
      com.atakmap.Tak.ClientHealth parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.atakmap.Tak.ClientHealth) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int status_ = 0;
    /**
     * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
     */
    public com.atakmap.Tak.ClientHealth.ServingStatus getStatus() {
      com.atakmap.Tak.ClientHealth.ServingStatus result = com.atakmap.Tak.ClientHealth.ServingStatus.valueOf(status_);
      return result == null ? com.atakmap.Tak.ClientHealth.ServingStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
     */
    public Builder setStatus(com.atakmap.Tak.ClientHealth.ServingStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.atakmap.ClientHealth.ServingStatus status = 1;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
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


    // @@protoc_insertion_point(builder_scope:com.atakmap.ClientHealth)
  }

  // @@protoc_insertion_point(class_scope:com.atakmap.ClientHealth)
  private static final com.atakmap.Tak.ClientHealth DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.atakmap.Tak.ClientHealth();
  }

  public static com.atakmap.Tak.ClientHealth getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClientHealth>
      PARSER = new com.google.protobuf.AbstractParser<ClientHealth>() {
    public ClientHealth parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClientHealth(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClientHealth> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClientHealth> getParserForType() {
    return PARSER;
  }

  public com.atakmap.Tak.ClientHealth getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

