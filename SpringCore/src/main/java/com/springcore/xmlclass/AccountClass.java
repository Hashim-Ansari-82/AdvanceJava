package com.springcore.xmlclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.xmlentity.Account;
 
public class AccountClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=
		new ClassPathXmlApplicationContext("com/springcore/xml/constructor.xml");
		
		Account account = (Account)context.getBean("account");
		System.out.println(account); 
		Account account1 = context.getBean("account1",Account.class);
		System.out.println(account1);
	}
}
