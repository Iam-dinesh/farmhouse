package com.dinesh.farmhouse.serviceImpl;

import org.springframework.stereotype.Service;

import com.dinesh.farmhouse.validator.FarmHouseValidator;
import com.dinesh.farmhousecore.domain.FarmHouse;
import com.dinesh.farmhousecore.domain.FarmHouseServiceResponse;
import com.dinesh.farmhousecore.service.FarmHouseService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service
public class FarmHouseServiceImpl implements FarmHouseService{

	@Override
	public FarmHouseServiceResponse createFarmHouse(FarmHouse farmHouse) {
		try {
			FarmHouseValidator.validateFarmHouseCreation(farmHouse);
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		return null;
	}
	
}
