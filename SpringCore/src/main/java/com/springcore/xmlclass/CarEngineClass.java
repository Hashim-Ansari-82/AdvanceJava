package com.springcore.xmlclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.xmlentity.Car;

public class CarEngineClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
		new ClassPathXmlApplicationContext("com/springcore/xml/ref.xml");
		
		Car car = context.getBean(Car.class);
		System.out.println(car.getName());
		System.out.println(car.getNumber());
		System.out.println(car.getPrice());
		System.out.println(car.getEngine());
	}
}
