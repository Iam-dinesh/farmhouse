package com.dinesh.farmhouse.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dinesh.farmhouse.dao.FarmHouseDao;
import com.dinesh.farmhousecore.domain.FarmHouse;

@Repository
public class FarmHouseDaoImpl implements FarmHouseDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;

	@Override
	public boolean createFarmHouse(FarmHouse farmHouse) {
		return false;
	}

}
