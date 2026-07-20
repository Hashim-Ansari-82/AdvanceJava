package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.VehicleDao;
import com.springjdbc.entity.Vehicle;

import lombok.Data;

@Data
@Component("vehicle")
public class VehicleDaoImpl implements VehicleDao{
	
	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int insert(Vehicle vehicle) {

		String query="insert into vehicle(noOfWheel,brand,name,fuel) values(?,?,?,?)";
		int update = this.template.update(query,vehicle.getNoOfWheel(),vehicle.getBrand(),vehicle.getName(),vehicle.getFuel());

		return update;
	}

	@Override
	public int update(Vehicle vehicle) {
		String query="update vehicle set brand=?, name=?,fuel=?, noOfWheel=? where id=?";
		int update = template.update(query,vehicle.getBrand(),vehicle.getName(),vehicle.getFuel(),vehicle.getNoOfWheel(),vehicle.getId());
		return update;
	}

	@Override
	public int delete(int id) {
		
		String query="delete from vehicle where id = ?";
		int update = template.update(query,id);
		return update;
	}

	@Override
	public List<Vehicle> fetch() {
		
		String query="select * from Vehicle";
		/* RowMapperImpl rowMapper = new RowMapperImpl(); */
		List<Vehicle> fetch = template.query(query,new RowMapperImpl());
		return fetch; 
	}

	@Override
	public Vehicle getVehicle(int id) {
		String query="select * from Vehicle where id=?";
		/* RowMapperImpl rowMapper = new RowMapperImpl(); */
		Vehicle vehicle = template.queryForObject(query, new RowMapperImpl(),id);
		return vehicle;
	}

}
