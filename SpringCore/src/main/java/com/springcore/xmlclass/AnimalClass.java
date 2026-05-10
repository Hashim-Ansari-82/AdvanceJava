package com.springcore.xmlclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.xmlentity.Animal;

public class AnimalClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("com/springcore/xml/config.xml");
	
		Animal animal1 = context.getBean( Animal.class);
		System.out.println(animal1);
		
	}
}
