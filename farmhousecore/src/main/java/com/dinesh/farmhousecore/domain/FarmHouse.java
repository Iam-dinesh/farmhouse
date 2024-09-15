package com.dinesh.farmhousecore.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class FarmHouse implements Serializable {

	private static final long serialVersionUID = -686927613597379902L;

	private int farmHouseID;
	private String farmHouseName;
	private OwnerDetails ownerDetails;
	private String email;
	private int contactNo;
	private Address address;
	private Date dateCreated;
	private Date dateModified;

}
