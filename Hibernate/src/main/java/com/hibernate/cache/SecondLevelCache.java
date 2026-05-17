package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.Student;

public class SecondLevelCache {

	public static void main(String[] args) {

		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();

		Student student = session1.get(Student.class, 12);
		System.out.println(student);

		session1.close();
		Session session2 = factory.openSession();
		
		Student student1 = session2.get(Student.class, 12);
		System.out.println(student1);

		session2.close();

	}
}
