package com.hiber.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentGet {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();

		Student student = session.load(Student.class, 1);
		Student student1 = session.load(Student.class, 1);
	
		System.out.println(student);
		System.out.println(student1);
		
		session.close();
	}
}
