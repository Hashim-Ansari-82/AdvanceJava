package com.springorm.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.HouseDao;
import com.springorm.entity.House;

public class FetchHouse {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("\n<------------ Program Started ----------->\n");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
        HouseDao bean = context.getBean("houseDao",HouseDao.class);
		
		List<House> fetch = bean.fetch();
		
		for(House house:fetch) {
			System.out.println(house);
		}
	}
}
