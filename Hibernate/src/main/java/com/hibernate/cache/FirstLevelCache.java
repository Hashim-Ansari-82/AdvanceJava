package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

<<<<<<< HEAD
import com.hibernate.demo.Student;
=======
import com.hibernate.entity.Student;
>>>>>>> 99d440f25785920ae7674e56da661aa8a975bd8d

public class FirstLevelCache {

	public static void main(String[] args) {
		
<<<<<<< HEAD
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
     Student student = session.get(Student.class, 12);
     System.out.println(student);
     
     Student student1 = session.get(Student.class, 12);
     System.out.println(student1);
     
     session.close();
	
=======
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();

		Student student = session.get(Student.class, 1);
		System.out.println(student);

		System.out.println("After Working");
		System.out.println(student);

		session.close();
>>>>>>> 99d440f25785920ae7674e56da661aa8a975bd8d
	}
}
