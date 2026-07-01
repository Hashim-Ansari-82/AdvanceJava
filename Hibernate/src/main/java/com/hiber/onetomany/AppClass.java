package com.hiber.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Bank.class);
		cfg.addAnnotatedClass(User.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Bank bank = new Bank();
		bank.setBank_Id(534523);
		bank.setBank_Name("State Bank Of India");
		
		User user1 = new User();
		user1.setAccNo(654787453);
		user1.setUserName("Hashim Ansari");
		user1.setAge(19);
		user1.setAddress("Sakinaka");
		
		User user2 = new User();
		user2.setAccNo(68475675);
		user2.setUserName("Altmash Khan");
		user2.setAge(18);
		user2.setAddress("Sakinaka");
		
		User user3 = new User();
		user3.setAccNo(986755254);
		user3.setUserName("Moiez Khan");
		user3.setAge(19);
		user3.setAddress("Sakinaka");
		
		List<User> userList = new ArrayList<User>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);
		
		
		
		userList.forEach(list ->{
			bank.setUser(userList);
		});
		
		session.save(bank);
		
		tx.commit();
		
		session.close();
		factory.close();
		
	}
}
