package com.dinesh.farmhouse.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dinesh.farmhouse.dao.FarmHouseDao;
import com.dinesh.farmhouse.validator.FarmHouseValidator;
import com.dinesh.farmhousecore.domain.FarmHouse;
import com.dinesh.farmhousecore.domain.FarmHouseServiceResponse;
import com.dinesh.farmhousecore.domain.StatusCode;
import com.dinesh.farmhousecore.service.FarmHouseService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FarmHouseServiceImpl implements FarmHouseService {

	@Autowired
	private FarmHouseDao farmhouseDao;

	@Override
	public FarmHouseServiceResponse createFarmHouse(FarmHouse farmHouse) {
		try {
			FarmHouseServiceResponse farmhHouseServiceResponse = FarmHouseValidator
					.validateFarmHouseCreation(farmHouse);
			if (StatusCode.FAILED.equals(farmhHouseServiceResponse.getStatusCode())) {
				return farmhHouseServiceResponse;
			}
			farmhouseDao.createFarmHouse(farmHouse);
		} catch (Exception e) {
			log.info(e.getMessage(), e);
		}
		return null;
	}

}
