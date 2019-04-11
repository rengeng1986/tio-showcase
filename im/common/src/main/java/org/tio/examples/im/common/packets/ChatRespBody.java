// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code ChatRespBody}
 */
public final class ChatRespBody extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:ChatRespBody)
		ChatRespBodyOrBuilder {
	/**
	 * Protobuf type {@code ChatRespBody}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:ChatRespBody)
			org.tio.examples.im.common.packets.ChatRespBodyOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatRespBody_descriptor;
		}

		private long time_;

		private int type_ = 0;

		private java.lang.Object text_ = "";

		private org.tio.examples.im.common.packets.Client fromClient_ = null;

		private com.google.protobuf.SingleFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> fromClientBuilder_;

		private org.tio.examples.im.common.packets.Client toClient_ = null;

		private com.google.protobuf.SingleFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> toClientBuilder_;

		private java.lang.Object group_ = "";

		private java.lang.Object id_ = "";

		// Construct using org.tio.examples.im.common.packets.ChatRespBody.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		@Override
		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public org.tio.examples.im.common.packets.ChatRespBody build() {
			org.tio.examples.im.common.packets.ChatRespBody result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.ChatRespBody buildPartial() {
			org.tio.examples.im.common.packets.ChatRespBody result = new org.tio.examples.im.common.packets.ChatRespBody(this);
			result.time_ = time_;
			result.type_ = type_;
			result.text_ = text_;
			if (fromClientBuilder_ == null) {
				result.fromClient_ = fromClient_;
			} else {
				result.fromClient_ = fromClientBuilder_.build();
			}
			if (toClientBuilder_ == null) {
				result.toClient_ = toClient_;
			} else {
				result.toClient_ = toClientBuilder_.build();
			}
			result.group_ = group_;
			result.id_ = id_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			time_ = 0L;

			type_ = 0;

			text_ = "";

			if (fromClientBuilder_ == null) {
				fromClient_ = null;
			} else {
				fromClient_ = null;
				fromClientBuilder_ = null;
			}
			if (toClientBuilder_ == null) {
				toClient_ = null;
			} else {
				toClient_ = null;
				toClientBuilder_ = null;
			}
			group_ = "";

			id_ = "";

			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		public Builder clearFromClient() {
			if (fromClientBuilder_ == null) {
				fromClient_ = null;
				onChanged();
			} else {
				fromClient_ = null;
				fromClientBuilder_ = null;
			}

			return this;
		}

		/**
		 * <pre>
		 *目标组id
		 * </pre>
		 *
		 * <code>string group = 6;</code>
		 */
		public Builder clearGroup() {

			group_ = getDefaultInstance().getGroup();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *消息id，全局唯一
		 * </pre>
		 *
		 * <code>string id = 7;</code>
		 */
		public Builder clearId() {

			id_ = getDefaultInstance().getId();
			onChanged();
			return this;
		}

		@Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		/**
		 * <pre>
		 *聊天内容
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder clearText() {

			text_ = getDefaultInstance().getText();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *消息发送时间
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		public Builder clearTime() {

			time_ = 0L;
			onChanged();
			return this;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		public Builder clearToClient() {
			if (toClientBuilder_ == null) {
				toClient_ = null;
				onChanged();
			} else {
				toClient_ = null;
				toClientBuilder_ = null;
			}

			return this;
		}

		/**
		 * <pre>
		 *聊天类型
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder clearType() {

			type_ = 0;
			onChanged();
			return this;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public org.tio.examples.im.common.packets.ChatRespBody getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.ChatRespBody.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatRespBody_descriptor;
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.Client getFromClient() {
			if (fromClientBuilder_ == null) {
				return fromClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : fromClient_;
			} else {
				return fromClientBuilder_.getMessage();
			}
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		public org.tio.examples.im.common.packets.Client.Builder getFromClientBuilder() {

			onChanged();
			return getFromClientFieldBuilder().getBuilder();
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		private com.google.protobuf.SingleFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> getFromClientFieldBuilder() {
			if (fromClientBuilder_ == null) {
				fromClientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<>(
						getFromClient(), getParentForChildren(), isClean());
				fromClient_ = null;
			}
			return fromClientBuilder_;
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.ClientOrBuilder getFromClientOrBuilder() {
			if (fromClientBuilder_ != null) {
				return fromClientBuilder_.getMessageOrBuilder();
			} else {
				return fromClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : fromClient_;
			}
		}

		/**
		 * <pre>
		 *目标组id
		 * </pre>
		 *
		 * <code>string group = 6;</code>
		 */
		@Override
		public java.lang.String getGroup() {
			java.lang.Object ref = group_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				group_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *目标组id
		 * </pre>
		 *
		 * <code>string group = 6;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getGroupBytes() {
			java.lang.Object ref = group_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				group_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *消息id，全局唯一
		 * </pre>
		 *
		 * <code>string id = 7;</code>
		 */
		@Override
		public java.lang.String getId() {
			java.lang.Object ref = id_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				id_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *消息id，全局唯一
		 * </pre>
		 *
		 * <code>string id = 7;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getIdBytes() {
			java.lang.Object ref = id_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				id_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *聊天内容
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		@Override
		public java.lang.String getText() {
			java.lang.Object ref = text_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				text_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *聊天内容
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getTextBytes() {
			java.lang.Object ref = text_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				text_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *消息发送时间
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		@Override
		public long getTime() {
			return time_;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.Client getToClient() {
			if (toClientBuilder_ == null) {
				return toClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : toClient_;
			} else {
				return toClientBuilder_.getMessage();
			}
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		public org.tio.examples.im.common.packets.Client.Builder getToClientBuilder() {

			onChanged();
			return getToClientFieldBuilder().getBuilder();
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		private com.google.protobuf.SingleFieldBuilderV3<org.tio.examples.im.common.packets.Client, org.tio.examples.im.common.packets.Client.Builder, org.tio.examples.im.common.packets.ClientOrBuilder> getToClientFieldBuilder() {
			if (toClientBuilder_ == null) {
				toClientBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<>(
						getToClient(), getParentForChildren(), isClean());
				toClient_ = null;
			}
			return toClientBuilder_;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.ClientOrBuilder getToClientOrBuilder() {
			if (toClientBuilder_ != null) {
				return toClientBuilder_.getMessageOrBuilder();
			} else {
				return toClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : toClient_;
			}
		}

		/**
		 * <pre>
		 *聊天类型
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.ChatType getType() {
			org.tio.examples.im.common.packets.ChatType result = org.tio.examples.im.common.packets.ChatType.valueOf(type_);
			return result == null ? org.tio.examples.im.common.packets.ChatType.UNRECOGNIZED : result;
		}

		/**
		 * <pre>
		 *聊天类型
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		@Override
		public int getTypeValue() {
			return type_;
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		@Override
		public boolean hasFromClient() {
			return fromClientBuilder_ != null || fromClient_ != null;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		@Override
		public boolean hasToClient() {
			return toClientBuilder_ != null || toClient_ != null;
		}

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatRespBody_fieldAccessorTable
					.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.ChatRespBody.class, org.tio.examples.im.common.packets.ChatRespBody.Builder.class);
		}

		@Override
		public final boolean isInitialized() {
			return true;
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			org.tio.examples.im.common.packets.ChatRespBody parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.ChatRespBody) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof org.tio.examples.im.common.packets.ChatRespBody) {
				return mergeFrom((org.tio.examples.im.common.packets.ChatRespBody) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.ChatRespBody other) {
			if (other == org.tio.examples.im.common.packets.ChatRespBody.getDefaultInstance()) {
				return this;
			}
			if (other.getTime() != 0L) {
				setTime(other.getTime());
			}
			if (other.type_ != 0) {
				setTypeValue(other.getTypeValue());
			}
			if (!other.getText().isEmpty()) {
				text_ = other.text_;
				onChanged();
			}
			if (other.hasFromClient()) {
				mergeFromClient(other.getFromClient());
			}
			if (other.hasToClient()) {
				mergeToClient(other.getToClient());
			}
			if (!other.getGroup().isEmpty()) {
				group_ = other.group_;
				onChanged();
			}
			if (!other.getId().isEmpty()) {
				id_ = other.id_;
				onChanged();
			}
			onChanged();
			return this;
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		public Builder mergeFromClient(org.tio.examples.im.common.packets.Client value) {
			if (fromClientBuilder_ == null) {
				if (fromClient_ != null) {
					fromClient_ = org.tio.examples.im.common.packets.Client.newBuilder(fromClient_).mergeFrom(value).buildPartial();
				} else {
					fromClient_ = value;
				}
				onChanged();
			} else {
				fromClientBuilder_.mergeFrom(value);
			}

			return this;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		public Builder mergeToClient(org.tio.examples.im.common.packets.Client value) {
			if (toClientBuilder_ == null) {
				if (toClient_ != null) {
					toClient_ = org.tio.examples.im.common.packets.Client.newBuilder(toClient_).mergeFrom(value).buildPartial();
				} else {
					toClient_ = value;
				}
				onChanged();
			} else {
				toClientBuilder_.mergeFrom(value);
			}

			return this;
		}

		@Override
		public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		@Override
		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		public Builder setFromClient(org.tio.examples.im.common.packets.Client value) {
			if (fromClientBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				fromClient_ = value;
				onChanged();
			} else {
				fromClientBuilder_.setMessage(value);
			}

			return this;
		}

		/**
		 * <code>.Client fromClient = 4;</code>
		 */
		public Builder setFromClient(org.tio.examples.im.common.packets.Client.Builder builderForValue) {
			if (fromClientBuilder_ == null) {
				fromClient_ = builderForValue.build();
				onChanged();
			} else {
				fromClientBuilder_.setMessage(builderForValue.build());
			}

			return this;
		}

		/**
		 * <pre>
		 *目标组id
		 * </pre>
		 *
		 * <code>string group = 6;</code>
		 */
		public Builder setGroup(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			group_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *目标组id
		 * </pre>
		 *
		 * <code>string group = 6;</code>
		 */
		public Builder setGroupBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			group_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *消息id，全局唯一
		 * </pre>
		 *
		 * <code>string id = 7;</code>
		 */
		public Builder setId(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			id_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *消息id，全局唯一
		 * </pre>
		 *
		 * <code>string id = 7;</code>
		 */
		public Builder setIdBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			id_ = value;
			onChanged();
			return this;
		}

		@Override
		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
			return super.setRepeatedField(field, index, value);
		}

		/**
		 * <pre>
		 *聊天内容
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder setText(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			text_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *聊天内容
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder setTextBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			text_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *消息发送时间
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		public Builder setTime(long value) {

			time_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		public Builder setToClient(org.tio.examples.im.common.packets.Client value) {
			if (toClientBuilder_ == null) {
				if (value == null) {
					throw new NullPointerException();
				}
				toClient_ = value;
				onChanged();
			} else {
				toClientBuilder_.setMessage(value);
			}

			return this;
		}

		/**
		 * <code>.Client toClient = 5;</code>
		 */
		public Builder setToClient(org.tio.examples.im.common.packets.Client.Builder builderForValue) {
			if (toClientBuilder_ == null) {
				toClient_ = builderForValue.build();
				onChanged();
			} else {
				toClientBuilder_.setMessage(builderForValue.build());
			}

			return this;
		}

		/**
		 * <pre>
		 *聊天类型
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder setType(org.tio.examples.im.common.packets.ChatType value) {
			if (value == null) {
				throw new NullPointerException();
			}

			type_ = value.getNumber();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *聊天类型
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder setTypeValue(int value) {
			type_ = value;
			onChanged();
			return this;
		}

		@Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:ChatRespBody)
	}

	public static final int TIME_FIELD_NUMBER = 1;

	public static final int TYPE_FIELD_NUMBER = 2;

	public static final int TEXT_FIELD_NUMBER = 3;

	public static final int FROMCLIENT_FIELD_NUMBER = 4;

	public static final int TOCLIENT_FIELD_NUMBER = 5;

	public static final int GROUP_FIELD_NUMBER = 6;
	public static final int ID_FIELD_NUMBER = 7;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:ChatRespBody)
	private static final org.tio.examples.im.common.packets.ChatRespBody DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.ChatRespBody();
	}

	private static final com.google.protobuf.Parser<ChatRespBody> PARSER = new com.google.protobuf.AbstractParser<ChatRespBody>() {
		@Override
		public ChatRespBody parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new ChatRespBody(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.ChatRespBody getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ChatRespBody_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.ChatRespBody prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatRespBody parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<ChatRespBody> parser() {
		return PARSER;
	}

	private long time_;
	private int type_;

	private volatile java.lang.Object text_;

	private org.tio.examples.im.common.packets.Client fromClient_;

	private org.tio.examples.im.common.packets.Client toClient_;
	private volatile java.lang.Object group_;

	private volatile java.lang.Object id_;

	private byte memoizedIsInitialized = -1;

	private ChatRespBody() {
		time_ = 0L;
		type_ = 0;
		text_ = "";
		group_ = "";
		id_ = "";
	}

	private ChatRespBody(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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

					time_ = input.readInt64();
					break;
				}
				case 16: {
					int rawValue = input.readEnum();

					type_ = rawValue;
					break;
				}
				case 26: {
					java.lang.String s = input.readStringRequireUtf8();

					text_ = s;
					break;
				}
				case 34: {
					org.tio.examples.im.common.packets.Client.Builder subBuilder = null;
					if (fromClient_ != null) {
						subBuilder = fromClient_.toBuilder();
					}
					fromClient_ = input.readMessage(org.tio.examples.im.common.packets.Client.parser(), extensionRegistry);
					if (subBuilder != null) {
						subBuilder.mergeFrom(fromClient_);
						fromClient_ = subBuilder.buildPartial();
					}

					break;
				}
				case 42: {
					org.tio.examples.im.common.packets.Client.Builder subBuilder = null;
					if (toClient_ != null) {
						subBuilder = toClient_.toBuilder();
					}
					toClient_ = input.readMessage(org.tio.examples.im.common.packets.Client.parser(), extensionRegistry);
					if (subBuilder != null) {
						subBuilder.mergeFrom(toClient_);
						toClient_ = subBuilder.buildPartial();
					}

					break;
				}
				case 50: {
					java.lang.String s = input.readStringRequireUtf8();

					group_ = s;
					break;
				}
				case 58: {
					java.lang.String s = input.readStringRequireUtf8();

					id_ = s;
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			makeExtensionsImmutable();
		}
	}

	// Use ChatRespBody.newBuilder() to construct.
	private ChatRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.ChatRespBody)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.ChatRespBody other = (org.tio.examples.im.common.packets.ChatRespBody) obj;

		boolean result = true;
		result = result && getTime() == other.getTime();
		result = result && type_ == other.type_;
		result = result && getText().equals(other.getText());
		result = result && hasFromClient() == other.hasFromClient();
		if (hasFromClient()) {
			result = result && getFromClient().equals(other.getFromClient());
		}
		result = result && hasToClient() == other.hasToClient();
		if (hasToClient()) {
			result = result && getToClient().equals(other.getToClient());
		}
		result = result && getGroup().equals(other.getGroup());
		result = result && getId().equals(other.getId());
		return result;
	}

	@Override
	public org.tio.examples.im.common.packets.ChatRespBody getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <code>.Client fromClient = 4;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.Client getFromClient() {
		return fromClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : fromClient_;
	}

	/**
	 * <code>.Client fromClient = 4;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.ClientOrBuilder getFromClientOrBuilder() {
		return getFromClient();
	}

	/**
	 * <pre>
	 *目标组id
	 * </pre>
	 *
	 * <code>string group = 6;</code>
	 */
	@Override
	public java.lang.String getGroup() {
		java.lang.Object ref = group_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			group_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *目标组id
	 * </pre>
	 *
	 * <code>string group = 6;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getGroupBytes() {
		java.lang.Object ref = group_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			group_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	/**
	 * <pre>
	 *消息id，全局唯一
	 * </pre>
	 *
	 * <code>string id = 7;</code>
	 */
	@Override
	public java.lang.String getId() {
		java.lang.Object ref = id_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			id_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *消息id，全局唯一
	 * </pre>
	 *
	 * <code>string id = 7;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getIdBytes() {
		java.lang.Object ref = id_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			id_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	@java.lang.Override
	public com.google.protobuf.Parser<ChatRespBody> getParserForType() {
		return PARSER;
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (time_ != 0L) {
			size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, time_);
		}
		if (type_ != org.tio.examples.im.common.packets.ChatType.CHAT_TYPE_UNKNOW.getNumber()) {
			size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
		}
		if (!getTextBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
		}
		if (fromClient_ != null) {
			size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getFromClient());
		}
		if (toClient_ != null) {
			size += com.google.protobuf.CodedOutputStream.computeMessageSize(5, getToClient());
		}
		if (!getGroupBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, group_);
		}
		if (!getIdBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, id_);
		}
		memoizedSize = size;
		return size;
	}

	/**
	 * <pre>
	 *聊天内容
	 * </pre>
	 *
	 * <code>string text = 3;</code>
	 */
	@Override
	public java.lang.String getText() {
		java.lang.Object ref = text_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			text_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *聊天内容
	 * </pre>
	 *
	 * <code>string text = 3;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getTextBytes() {
		java.lang.Object ref = text_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			text_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	/**
	 * <pre>
	 *消息发送时间
	 * </pre>
	 *
	 * <code>int64 time = 1;</code>
	 */
	@Override
	public long getTime() {
		return time_;
	}

	/**
	 * <code>.Client toClient = 5;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.Client getToClient() {
		return toClient_ == null ? org.tio.examples.im.common.packets.Client.getDefaultInstance() : toClient_;
	}

	/**
	 * <code>.Client toClient = 5;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.ClientOrBuilder getToClientOrBuilder() {
		return getToClient();
	}

	/**
	 * <pre>
	 *聊天类型
	 * </pre>
	 *
	 * <code>.ChatType type = 2;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.ChatType getType() {
		org.tio.examples.im.common.packets.ChatType result = org.tio.examples.im.common.packets.ChatType.valueOf(type_);
		return result == null ? org.tio.examples.im.common.packets.ChatType.UNRECOGNIZED : result;
	}

	/**
	 * <pre>
	 *聊天类型
	 * </pre>
	 *
	 * <code>.ChatType type = 2;</code>
	 */
	@Override
	public int getTypeValue() {
		return type_;
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
		return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
	}

	/**
	 * <code>.Client fromClient = 4;</code>
	 */
	@Override
	public boolean hasFromClient() {
		return fromClient_ != null;
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = 19 * hash + getDescriptor().hashCode();
		hash = 37 * hash + TIME_FIELD_NUMBER;
		hash = 53 * hash + com.google.protobuf.Internal.hashLong(getTime());
		hash = 37 * hash + TYPE_FIELD_NUMBER;
		hash = 53 * hash + type_;
		hash = 37 * hash + TEXT_FIELD_NUMBER;
		hash = 53 * hash + getText().hashCode();
		if (hasFromClient()) {
			hash = 37 * hash + FROMCLIENT_FIELD_NUMBER;
			hash = 53 * hash + getFromClient().hashCode();
		}
		if (hasToClient()) {
			hash = 37 * hash + TOCLIENT_FIELD_NUMBER;
			hash = 53 * hash + getToClient().hashCode();
		}
		hash = 37 * hash + GROUP_FIELD_NUMBER;
		hash = 53 * hash + getGroup().hashCode();
		hash = 37 * hash + ID_FIELD_NUMBER;
		hash = 53 * hash + getId().hashCode();
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	/**
	 * <code>.Client toClient = 5;</code>
	 */
	@Override
	public boolean hasToClient() {
		return toClient_ != null;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ChatRespBody_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.ChatRespBody.class, org.tio.examples.im.common.packets.ChatRespBody.Builder.class);
	}

	@Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) {
			return true;
		}
		if (isInitialized == 0) {
			return false;
		}

		memoizedIsInitialized = 1;
		return true;
	}

	@Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	@java.lang.Override
	protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	@Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@Override
	public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (time_ != 0L) {
			output.writeInt64(1, time_);
		}
		if (type_ != org.tio.examples.im.common.packets.ChatType.CHAT_TYPE_UNKNOW.getNumber()) {
			output.writeEnum(2, type_);
		}
		if (!getTextBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
		}
		if (fromClient_ != null) {
			output.writeMessage(4, getFromClient());
		}
		if (toClient_ != null) {
			output.writeMessage(5, getToClient());
		}
		if (!getGroupBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 6, group_);
		}
		if (!getIdBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 7, id_);
		}
	}

}
