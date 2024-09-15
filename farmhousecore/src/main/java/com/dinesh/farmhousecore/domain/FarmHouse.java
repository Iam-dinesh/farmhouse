package com.dinesh.farmhousecore.domain;

import java.io.Serializable;
import java.util.Date;

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

	public int getFarmHouseID() {
		return farmHouseID;
	}

	public void setFarmHouseID(int farmHouseID) {
		this.farmHouseID = farmHouseID;
	}

	public String getFarmHouseName() {
		return farmHouseName;
	}

	public void setFarmHouseName(String farmHouseName) {
		this.farmHouseName = farmHouseName;
	}

	public OwnerDetails getOwnerDetails() {
		return ownerDetails;
	}

	public void setOwnerDetails(OwnerDetails ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
}
