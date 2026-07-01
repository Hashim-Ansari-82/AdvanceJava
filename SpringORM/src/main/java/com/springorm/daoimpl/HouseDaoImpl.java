package com.springorm.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.dao.HouseDao;
import com.springorm.entity.House;

import javax.transaction.Transactional;
import lombok.Data;

@Data
public class HouseDaoImpl implements HouseDao{

	private HibernateTemplate template;
	
	@Transactional
	@Override
	public int insert(House house) {
		Integer save = (Integer) template.save(house);
		return save;
	}

	@Transactional 
	@Override
	public void update(House house) {
     template.update(house);
	} 
	@Transactional
	@Override
	public void delete(int houseNo) {
		House house = template.get(House.class,houseNo);
		this.template.delete(house);
	}

	@Override
	public List<House> fetch() {
		List<House> all = template.loadAll(House.class);
		return all;
	}

	@Override
	public House getHouse(int houseNo) {
		House house = template.get(House.class, houseNo);
		return house;
	}
      
	  
}
