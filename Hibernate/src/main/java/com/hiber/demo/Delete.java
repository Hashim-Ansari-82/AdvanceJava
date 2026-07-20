package com.hiber.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Student student = session.get(Student.class,3);
		
		session.delete(student);
		transaction.commit();
		System.out.println("Deleted Successfully");
		session.close();
		factory.close();
	}
	
}
