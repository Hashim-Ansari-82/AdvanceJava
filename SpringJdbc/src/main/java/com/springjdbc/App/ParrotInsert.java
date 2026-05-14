package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.daoimpl.ParrotDaoImpl;
import com.springjdbc.entity.Parrot;

public class ParrotInsert {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Parrot color");
		String color = br.readLine();
		System.out.println("Enter Parrot speed");
		String speed = br.readLine();
		System.out.println("Enter Parrot food");
		String food = br.readLine();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ParrotDaoImpl bean = context.getBean("parrot",ParrotDaoImpl.class);
		 
		Parrot parrot = new Parrot();
		parrot.setColor(color);
		parrot.setSpeed(speed);
		parrot.setFood(food);
		int insert = bean.insert(parrot);
		if(insert > 0) {
			System.out.println("Insert Successfully......!");
		} 
		else
		{
           System.out.println("Insert Failed ..........! ");
		}
	}
}
