package com.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entity.Vehicle;

public class RowMapperImpl implements RowMapper<Vehicle> {

	@Override
	public Vehicle mapRow(ResultSet rs, int rowNum) throws SQLException {

        Vehicle vehicle = new Vehicle();
		vehicle.setNoOfWheel(rs.getInt(1));
		vehicle.setBrand(rs.getString(2));
		vehicle.setName(rs.getString(3));
		vehicle.setFuel(rs.getString(4));
		vehicle.setId(rs.getInt(5));
		return vehicle;
	}

	

}
