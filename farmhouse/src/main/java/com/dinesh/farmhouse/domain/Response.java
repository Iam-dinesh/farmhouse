package com.dinesh.farmhouse.domain;

import java.util.Objects;

/**
 * Represents a response with a status code and an optional message.
 */
public class Response {

    private final StatusCode statusCode;
    private final String message;
    private final Object data; // Optional field for additional data

    private Response(Builder builder) {
        this.statusCode = Objects.requireNonNull(builder.statusCode, "StatusCode cannot be null");
        this.message = builder.message;
        this.data = builder.data;
    }

    public StatusCode getStatusCode() {
        return statusCode;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "statusCode=" + statusCode +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Response response = (Response) o;
        return statusCode == response.statusCode &&
               Objects.equals(message, response.message) &&
               Objects.equals(data, response.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusCode, message, data);
    }

    /**
     * Builder class for creating Response objects.
     */
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
