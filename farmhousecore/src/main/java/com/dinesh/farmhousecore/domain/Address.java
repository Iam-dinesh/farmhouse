package com.dinesh.farmhousecore.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable {

	private static final long serialVersionUID = -3657015157673288812L;

	private int addressID;
	private String country;
	private State state;
	private String city;
	private int pincode;
	private int contactNO;
	private String email;
	private String primaryAddress;
	private String secondaryAddress;
	private String otherAddress;

}
