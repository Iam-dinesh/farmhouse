package com.dinesh.farmhouse.domain;

import java.io.Serializable;
import java.util.Date;

public class OwnerDetails implements Serializable {

	private static final long serialVersionUID = -222865914633308943L;

	private int ownerID;
	private String ownerName;
	private int ownerAddressID;
	private Date dateCreated = new Date();
	private Date dateModified;

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getOwnerAddressID() {
		return ownerAddressID;
	}

	public void setOwnerAddressID(int ownerAddressID) {
		this.ownerAddressID = ownerAddressID;
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
