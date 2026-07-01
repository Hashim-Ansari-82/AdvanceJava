package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();

		Student student = session.get(Student.class, 1);
		System.out.println(student);

		System.out.println("After Working");
		System.out.println(student);

		session.close();
	}
}
