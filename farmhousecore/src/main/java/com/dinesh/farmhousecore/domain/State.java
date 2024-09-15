package com.dinesh.farmhousecore.domain;

public enum State {

	AP("Andhra Pradesh"), TELANGANA("Telangana");

	private final String state;

	private State(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}
