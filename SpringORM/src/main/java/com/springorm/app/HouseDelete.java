package com.springorm.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.HouseDao;

public class HouseDelete {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("\n<------------ Program Started ----------->\n");
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter House No You can delete");
		int no = Integer.parseInt(br.readLine());
				
		try {
		HouseDao bean = context.getBean("houseDao",HouseDao.class);
		bean.delete(no);
	    System.out.println("House Delete Successfully......!");
		}
		catch(Exception e) {
			System.out.println("Entry not found .... !");
		}
	}
}
