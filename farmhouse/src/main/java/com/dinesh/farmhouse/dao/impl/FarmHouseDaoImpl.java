package com.dinesh.farmhouse.dao.impl;

import org.springframework.stereotype.Repository;

import com.dinesh.farmhouse.dao.FarmHouseDao;
import com.dinesh.farmhousecore.domain.FarmHouse;

@Repository
public class FarmHouseDaoImpl implements FarmHouseDao {

	@Override
	public boolean createFarmHouse(FarmHouse farmHouse) {
		return false;
	}

}
