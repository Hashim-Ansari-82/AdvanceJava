package com.springorm.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.HouseDao;
import com.springorm.entity.House;

public class GetSingleHouse {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("\n<------------ Program Started ----------->\n");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
        HouseDao houseDao = context.getBean("houseDao",HouseDao.class);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter House No You can show detail");
		int no = Integer.parseInt(br.readLine());
		
		HouseDao bean = context.getBean("houseDao",HouseDao.class);
		
		House house = bean.getHouse(no);
		if(house != null) {
			
		System.out.println("\n"+house);
		System.out.println("\nHouse Detail Seen Successfully......!\n");
		}
		else {
			System.out.println("\nData Does not Exists ....!\n");
		}
		
	}
}
