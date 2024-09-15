package com.dinesh.farmhousecore.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class OwnerDetails implements Serializable {

	private static final long serialVersionUID = -222865914633308943L;

	private int ownerID;
	private String ownerName;
	private int ownerAddressID;
	private Date dateCreated = new Date();
	private Date dateModified;

}
