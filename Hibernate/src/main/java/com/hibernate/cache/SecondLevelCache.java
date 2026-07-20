package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

<<<<<<< HEAD
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

=======
import com.hibernate.entity.Student;

public class SecondLevelCache {

		public static void main(String[] args) {

			Configuration cfg = new Configuration();
			cfg.addAnnotatedClass(com.hibernate.entity.Student.class);
			SessionFactory factory = cfg.configure().buildSessionFactory();
			
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
>>>>>>> 99d440f25785920ae7674e56da661aa8a975bd8d
	}
}
