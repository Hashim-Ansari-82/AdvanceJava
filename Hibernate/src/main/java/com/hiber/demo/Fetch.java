package com.hiber.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		List<Student> query = session.createQuery("from Student",Student.class).getResultList();
		
		query.forEach(System.out::println);
		
		session.close();
		factory.close();
	}
}
