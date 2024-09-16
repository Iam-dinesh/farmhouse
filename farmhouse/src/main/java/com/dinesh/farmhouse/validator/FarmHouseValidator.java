package com.dinesh.farmhouse.validator;

import com.dinesh.farmhouse.helper.FarmHouseResponseHelper;
import com.dinesh.farmhousecore.domain.FarmHouse;
import com.dinesh.farmhousecore.domain.FarmHouseServiceResponse;

public class FarmHouseValidator {

	public static FarmHouseServiceResponse validateFarmHouseCreation(FarmHouse farmHouse) {
		// need to validate farmhouse
		return FarmHouseResponseHelper.prepareResponse(null, null);
	}

}
