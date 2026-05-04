package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Student;

public class SecondLevelCache {

		public static void main(String[] args) {

			SessionFactory factory = new Configuration().configure("com/xml/cache.cfg.xml").buildSessionFactory();
			
			Session session1 = factory.openSession();
			Student student1 = session1.get(Student.class, 1);
			System.out.println(student1);
			session1.close();

			Session session2 = factory.openSession();
			Student student2 = session2.get(Student.class, 1);
			System.out.println(student2);
			session2.close();
			
			Session session3 = factory.openSession();
			Student student3 = session3.get(Student.class, 1);
			System.out.println(student3);
			session3.close();
	}
}
