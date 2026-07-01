package com.springorm.dao;

import java.util.List;

import com.springorm.entity.House;

public interface HouseDao {

	public int insert(House house);
	public void update(House house);
	public void delete(int houseNo );
	public List<House> fetch();
	public House getHouse(int houseNo);
	
}
