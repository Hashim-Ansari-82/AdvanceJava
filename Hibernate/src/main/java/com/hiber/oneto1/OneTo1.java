package com.hiber.oneto1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneTo1 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Peon.class);
		SessionFactory factory= cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address();
		address.setId(3483);
		address.setAddress(Peon_Address.BASTI);
		
		Peon peon = new Peon();
		peon.setId(4325);
		peon.setName("Sultan Bhai");
		peon.setSalary(35000);
		
		address.setPeon(peon);
		peon.setAddress(address);
		
		session.persist(peon);
		transaction.commit();
		
		System.out.println("Inserted Successfully");
		
		session.close();
		factory.close();
	}
}
