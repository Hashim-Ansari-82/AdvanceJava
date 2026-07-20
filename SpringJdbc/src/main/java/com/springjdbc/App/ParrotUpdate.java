package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.ParrotDao;
import com.springjdbc.entity.Parrot;

public class ParrotUpdate {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id you can change");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter new food");
		String food = br.readLine();
		System.out.println("Enter new speed");
		String speed=br.readLine();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ParrotDao parrotDao = context.getBean("parrot",ParrotDao.class);
		Parrot parrot = new Parrot();
		parrot.setId(id);
		parrot.setFood(food);
		parrot.setSpeed(speed);
		int update = parrotDao.update(parrot);
		if(update>0) {
			System.out.println("updated Successfully....!");
		}
		else {
			System.out.println("Updated Failed ....! ");
		}
	}
}
