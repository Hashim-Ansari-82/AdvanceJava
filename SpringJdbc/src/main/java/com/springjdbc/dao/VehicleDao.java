package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entity.Vehicle;

public interface VehicleDao {

	public int insert(Vehicle vehicle);
	public int update(Vehicle vehicle);
	public int delete(int id);
	public List<Vehicle> fetch();
	public Vehicle getVehicle(int id);
}
