package com.springorm.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.HouseDao;
import com.springorm.entity.House;

public class UpdateHouse {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("\n<------------ Program Started ----------->\n");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
        HouseDao houseDao = context.getBean("houseDao",HouseDao.class);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your house Number You can change Detail");
		int no = Integer.parseInt(br.readLine());
		System.out.println("Enter How many memeber in your house");
		int member = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Location");
		String address = br.readLine();

		House house = new House();
		house.setHouseNo(no);
		house.setMember(member);
		house.setAddress(address);

		houseDao.update(house);
		
			System.out.println("Data updated Successfully ... !");
		
	}
}
