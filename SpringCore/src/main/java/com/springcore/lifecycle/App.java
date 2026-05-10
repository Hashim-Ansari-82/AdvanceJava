package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=
			new	ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		
		Samosa samosa = context.getBean(Samosa.class);
		System.out.println(samosa);
		
		context.registerShutdownHook();
		
	 Pepsi pepsi = context.getBean(Pepsi.class);
	 System.out.println(pepsi);
	 
	 Chutney chutney = context.getBean(Chutney.class);
	 System.out.println(chutney);
	}
}
