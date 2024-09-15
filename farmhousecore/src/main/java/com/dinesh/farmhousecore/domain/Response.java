package com.dinesh.farmhousecore.domain;

import java.util.Objects;

import lombok.Data;

@Data
public class Response {

	private final StatusCode statusCode;
	private final String message;
	private final Object data; // Optional field for additional data

	private Response(Builder builder) {
		this.statusCode = Objects.requireNonNull(builder.statusCode, "StatusCode cannot be null");
		this.message = builder.message;
		this.data = builder.data;
	}

	public static class Builder {
		private StatusCode statusCode;
		private String message;
		private Object data;

		public Builder withStatusCode(StatusCode statusCode) {
			this.statusCode = statusCode;
			return this;
		}

		public Builder withMessage(String message) {
			this.message = message;
			return this;
		}

		public Builder withData(Object data) {
			this.data = data;
			return this;
		}

		public Response build() {
			return new Response(this);
		}
	}
}
