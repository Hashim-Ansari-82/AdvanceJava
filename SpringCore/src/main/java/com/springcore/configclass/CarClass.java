package com.springcore.configclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.configentity.Car;

public class CarClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	AnnotationConfigApplicationContext context =
	new	AnnotationConfigApplicationContext(JavaConfig.class);
	
	Car car = context.getBean(Car.class);
	car.car();
	}
}
