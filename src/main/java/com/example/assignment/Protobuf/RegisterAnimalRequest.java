// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Slaghterhouse.proto

package com.example.assignment.Protobuf;

/**
 * Protobuf type {@code org.example.RegisterAnimalRequest}
 */
public  final class RegisterAnimalRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.RegisterAnimalRequest)
        RegisterAnimalRequestOrBuilder {
  // Use RegisterAnimalRequest.newBuilder() to construct.
  private RegisterAnimalRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterAnimalRequest() {
    regNum_ = 0;
    animalType_ = "";
    weight_ = 0D;
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private RegisterAnimalRequest(
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

            regNum_ = input.readInt32();
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            animalType_ = s;
            break;
          }
          case 26: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (dateOfBirth_ != null) {
              subBuilder = dateOfBirth_.toBuilder();
            }
            dateOfBirth_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dateOfBirth_);
              dateOfBirth_ = subBuilder.buildPartial();
            }

            break;
          }
          case 33: {

            weight_ = input.readDouble();
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
    return Slaghterhouse.internal_static_org_example_RegisterAnimalRequest_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Slaghterhouse.internal_static_org_example_RegisterAnimalRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            RegisterAnimalRequest.class, RegisterAnimalRequest.Builder.class);
  }

  public static final int REGNUM_FIELD_NUMBER = 1;
  private int regNum_;
  /**
   * <code>int32 regNum = 1;</code>
   */
  public int getRegNum() {
    return regNum_;
  }

  public static final int ANIMALTYPE_FIELD_NUMBER = 2;
  private volatile Object animalType_;
  /**
   * <code>string animalType = 2;</code>
   */
  public String getAnimalType() {
    Object ref = animalType_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      animalType_ = s;
      return s;
    }
  }
  /**
   * <code>string animalType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAnimalTypeBytes() {
    Object ref = animalType_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      animalType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATEOFBIRTH_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp dateOfBirth_;
  /**
   * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
   */
  public boolean hasDateOfBirth() {
    return dateOfBirth_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
   */
  public com.google.protobuf.Timestamp getDateOfBirth() {
    return dateOfBirth_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateOfBirth_;
  }
  /**
   * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getDateOfBirthOrBuilder() {
    return getDateOfBirth();
  }

  public static final int WEIGHT_FIELD_NUMBER = 4;
  private double weight_;
  /**
   * <code>double weight = 4;</code>
   */
  public double getWeight() {
    return weight_;
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
    if (regNum_ != 0) {
      output.writeInt32(1, regNum_);
    }
    if (!getAnimalTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, animalType_);
    }
    if (dateOfBirth_ != null) {
      output.writeMessage(3, getDateOfBirth());
    }
    if (weight_ != 0D) {
      output.writeDouble(4, weight_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (regNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, regNum_);
    }
    if (!getAnimalTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, animalType_);
    }
    if (dateOfBirth_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDateOfBirth());
    }
    if (weight_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, weight_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof RegisterAnimalRequest)) {
      return super.equals(obj);
    }
    RegisterAnimalRequest other = (RegisterAnimalRequest) obj;

    boolean result = true;
    result = result && (getRegNum()
        == other.getRegNum());
    result = result && getAnimalType()
        .equals(other.getAnimalType());
    result = result && (hasDateOfBirth() == other.hasDateOfBirth());
    if (hasDateOfBirth()) {
      result = result && getDateOfBirth()
          .equals(other.getDateOfBirth());
    }
    result = result && (
        Double.doubleToLongBits(getWeight())
        == Double.doubleToLongBits(
            other.getWeight()));
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REGNUM_FIELD_NUMBER;
    hash = (53 * hash) + getRegNum();
    hash = (37 * hash) + ANIMALTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getAnimalType().hashCode();
    if (hasDateOfBirth()) {
      hash = (37 * hash) + DATEOFBIRTH_FIELD_NUMBER;
      hash = (53 * hash) + getDateOfBirth().hashCode();
    }
    hash = (37 * hash) + WEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        Double.doubleToLongBits(getWeight()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static RegisterAnimalRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterAnimalRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterAnimalRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterAnimalRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterAnimalRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static RegisterAnimalRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static RegisterAnimalRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterAnimalRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterAnimalRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static RegisterAnimalRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static RegisterAnimalRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static RegisterAnimalRequest parseFrom(
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
  public static Builder newBuilder(RegisterAnimalRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.RegisterAnimalRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.RegisterAnimalRequest)
          RegisterAnimalRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Slaghterhouse.internal_static_org_example_RegisterAnimalRequest_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Slaghterhouse.internal_static_org_example_RegisterAnimalRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RegisterAnimalRequest.class, RegisterAnimalRequest.Builder.class);
    }

    // Construct using org.example.RegisterAnimalRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      regNum_ = 0;

      animalType_ = "";

      if (dateOfBirthBuilder_ == null) {
        dateOfBirth_ = null;
      } else {
        dateOfBirth_ = null;
        dateOfBirthBuilder_ = null;
      }
      weight_ = 0D;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Slaghterhouse.internal_static_org_example_RegisterAnimalRequest_descriptor;
    }

    public RegisterAnimalRequest getDefaultInstanceForType() {
      return RegisterAnimalRequest.getDefaultInstance();
    }

    public RegisterAnimalRequest build() {
      RegisterAnimalRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public RegisterAnimalRequest buildPartial() {
      RegisterAnimalRequest result = new RegisterAnimalRequest(this);
      result.regNum_ = regNum_;
      result.animalType_ = animalType_;
      if (dateOfBirthBuilder_ == null) {
        result.dateOfBirth_ = dateOfBirth_;
      } else {
        result.dateOfBirth_ = dateOfBirthBuilder_.build();
      }
      result.weight_ = weight_;
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
      if (other instanceof RegisterAnimalRequest) {
        return mergeFrom((RegisterAnimalRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(RegisterAnimalRequest other) {
      if (other == RegisterAnimalRequest.getDefaultInstance()) return this;
      if (other.getRegNum() != 0) {
        setRegNum(other.getRegNum());
      }
      if (!other.getAnimalType().isEmpty()) {
        animalType_ = other.animalType_;
        onChanged();
      }
      if (other.hasDateOfBirth()) {
        mergeDateOfBirth(other.getDateOfBirth());
      }
      if (other.getWeight() != 0D) {
        setWeight(other.getWeight());
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
      RegisterAnimalRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (RegisterAnimalRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int regNum_ ;
    /**
     * <code>int32 regNum = 1;</code>
     */
    public int getRegNum() {
      return regNum_;
    }
    /**
     * <code>int32 regNum = 1;</code>
     */
    public Builder setRegNum(int value) {
      
      regNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 regNum = 1;</code>
     */
    public Builder clearRegNum() {
      
      regNum_ = 0;
      onChanged();
      return this;
    }

    private Object animalType_ = "";
    /**
     * <code>string animalType = 2;</code>
     */
    public String getAnimalType() {
      Object ref = animalType_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        animalType_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string animalType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAnimalTypeBytes() {
      Object ref = animalType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        animalType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string animalType = 2;</code>
     */
    public Builder setAnimalType(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      animalType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string animalType = 2;</code>
     */
    public Builder clearAnimalType() {
      
      animalType_ = getDefaultInstance().getAnimalType();
      onChanged();
      return this;
    }
    /**
     * <code>string animalType = 2;</code>
     */
    public Builder setAnimalTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      animalType_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp dateOfBirth_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dateOfBirthBuilder_;
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public boolean hasDateOfBirth() {
      return dateOfBirthBuilder_ != null || dateOfBirth_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public com.google.protobuf.Timestamp getDateOfBirth() {
      if (dateOfBirthBuilder_ == null) {
        return dateOfBirth_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : dateOfBirth_;
      } else {
        return dateOfBirthBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public Builder setDateOfBirth(com.google.protobuf.Timestamp value) {
      if (dateOfBirthBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dateOfBirth_ = value;
        onChanged();
      } else {
        dateOfBirthBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public Builder setDateOfBirth(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dateOfBirthBuilder_ == null) {
        dateOfBirth_ = builderForValue.build();
        onChanged();
      } else {
        dateOfBirthBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public Builder mergeDateOfBirth(com.google.protobuf.Timestamp value) {
      if (dateOfBirthBuilder_ == null) {
        if (dateOfBirth_ != null) {
          dateOfBirth_ =
            com.google.protobuf.Timestamp.newBuilder(dateOfBirth_).mergeFrom(value).buildPartial();
        } else {
          dateOfBirth_ = value;
        }
        onChanged();
      } else {
        dateOfBirthBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public Builder clearDateOfBirth() {
      if (dateOfBirthBuilder_ == null) {
        dateOfBirth_ = null;
        onChanged();
      } else {
        dateOfBirth_ = null;
        dateOfBirthBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDateOfBirthBuilder() {
      
      onChanged();
      return getDateOfBirthFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDateOfBirthOrBuilder() {
      if (dateOfBirthBuilder_ != null) {
        return dateOfBirthBuilder_.getMessageOrBuilder();
      } else {
        return dateOfBirth_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : dateOfBirth_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp dateOfBirth = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDateOfBirthFieldBuilder() {
      if (dateOfBirthBuilder_ == null) {
        dateOfBirthBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDateOfBirth(),
                getParentForChildren(),
                isClean());
        dateOfBirth_ = null;
      }
      return dateOfBirthBuilder_;
    }

    private double weight_ ;
    /**
     * <code>double weight = 4;</code>
     */
    public double getWeight() {
      return weight_;
    }
    /**
     * <code>double weight = 4;</code>
     */
    public Builder setWeight(double value) {
      
      weight_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double weight = 4;</code>
     */
    public Builder clearWeight() {
      
      weight_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:org.example.RegisterAnimalRequest)
  }

  // @@protoc_insertion_point(class_scope:org.example.RegisterAnimalRequest)
  private static final RegisterAnimalRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new RegisterAnimalRequest();
  }

  public static RegisterAnimalRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterAnimalRequest>
      PARSER = new com.google.protobuf.AbstractParser<RegisterAnimalRequest>() {
    public RegisterAnimalRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegisterAnimalRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterAnimalRequest> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<RegisterAnimalRequest> getParserForType() {
    return PARSER;
  }

  public RegisterAnimalRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

