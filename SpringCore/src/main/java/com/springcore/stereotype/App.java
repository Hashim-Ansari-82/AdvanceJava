package com.springcore.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext con =
		new ClassPathXmlApplicationContext("com/springcore/stereotype/config.xml");
		
		User user = con.getBean("us",User.class);
		System.out.println(user.hashCode());
		
	  User user2 = con.getBean("us",User.class);
	  System.out.println(user2.hashCode());
	}
}
