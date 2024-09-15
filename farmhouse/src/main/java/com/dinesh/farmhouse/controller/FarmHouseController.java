package com.dinesh.farmhouse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dinesh.farmhouse.domain.FarmHouse;
import com.dinesh.farmhouse.domain.Response;
import com.dinesh.farmhouse.domain.StatusCode;
import com.dinesh.farmhouse.validator.FarmHouseValidator;

@Controller
public class FarmHouseController {

	@PostMapping("/createFarmHouse")
	public Response createFarmHouse(@RequestBody FarmHouse farmhouse) {
		try {
			FarmHouseValidator.validateFarmHouseCreation(farmhouse);
			return new Response.Builder().withMessage("Farm House Created Successfully")
					.withStatusCode(StatusCode.SUCCESS).withData(null).build();
		} catch (Exception e) {
			return new Response.Builder().withMessage("Failed to create FarmHouse. Please Try again")
					.withStatusCode(StatusCode.FAILED).withData(null).build();
		}
	}
}
