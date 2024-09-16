package com.dinesh.farmhouse.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dinesh.farmhouse.constants.FarmHouseErrorMessages;
import com.dinesh.farmhouse.helper.FarmHouseResponseHelper;
import com.dinesh.farmhousecore.domain.FarmHouse;
import com.dinesh.farmhousecore.domain.FarmHouseServiceResponse;
import com.dinesh.farmhousecore.service.FarmHouseService;

@Controller
public class FarmHouseController {

	@Autowired
	private FarmHouseService farmHouseService;

	@PostMapping("/createFarmHouse")
	public FarmHouseServiceResponse createFarmHouse(@RequestBody FarmHouse farmhouse) {
		try {
			return farmHouseService.createFarmHouse(farmhouse);
		} catch (Exception e) {
			return FarmHouseResponseHelper.prepareResponse(null,
					Arrays.asList(FarmHouseErrorMessages.FAILED_TO_CREATE_FARMHOUSE));
		}
	}
}
