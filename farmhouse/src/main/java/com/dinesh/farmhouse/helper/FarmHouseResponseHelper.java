package com.dinesh.farmhouse.helper;

import java.util.List;

import com.dinesh.farmhousecore.domain.FarmHouseServiceResponse;
import com.dinesh.farmhousecore.domain.StatusCode;

import lombok.experimental.UtilityClass;

@UtilityClass
public class FarmHouseResponseHelper {

	public FarmHouseServiceResponse prepareErrorResponse(Object responseData, List<String> errorMessages) {
		FarmHouseServiceResponse farmHouseServiceResponse = new FarmHouseServiceResponse();
		farmHouseServiceResponse.setData(responseData);
		farmHouseServiceResponse
				.setStatusCode(UtilValidate.isEmpty(errorMessages) ? StatusCode.SUCCESS : StatusCode.FAILED);
		farmHouseServiceResponse.setErrorMessages(errorMessages);
		return farmHouseServiceResponse;
	}

}
