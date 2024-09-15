package com.dinesh.farmhousecore.domain;

import java.util.List;

public class FarmHouseServiceResponse {

	private List<String> message;
	private StatusCode statusCode;
	public List<String> getMessage() {
		return message;
	}
	public void setMessage(List<String> message) {
		this.message = message;
	}
	public StatusCode getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(StatusCode statusCode) {
		this.statusCode = statusCode;
	}

}
