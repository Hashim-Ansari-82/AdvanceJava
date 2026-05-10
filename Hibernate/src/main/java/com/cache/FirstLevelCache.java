package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class FirstLevelCache {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("cache.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();

		Student student = session.get(Student.class, 1);
		System.out.println(student);

		System.out.println("After Working");
		System.out.println(student);

		session.close();
	}
}
