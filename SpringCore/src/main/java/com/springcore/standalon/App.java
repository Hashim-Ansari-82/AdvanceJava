package com.springcore.standalon;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
       new ClassPathXmlApplicationContext("com/springcore/standalon/config.xml");
		
		Friends friends = context.getBean(Friends.class);
		System.out.println(friends.getFriends());
		System.out.println(friends.getFees());
		System.out.println(friends.getProps());
		
	}
}
