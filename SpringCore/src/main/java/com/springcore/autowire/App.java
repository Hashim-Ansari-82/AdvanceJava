package com.springcore.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("com/springcore/autowire/config.xml");
		
		Machine machine = context.getBean(Machine.class);
		System.out.println(machine);
	}
}
