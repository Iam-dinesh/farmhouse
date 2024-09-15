package com.dinesh.farmhousecore.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class FarmHouseServiceResponse implements Serializable {

	private static final long serialVersionUID = 7931575631889750413L;

	private List<String> errorMessages;
	private StatusCode statusCode;
	private Object data;

}
