package com.hibernate.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		
	Configuration cfg = new Configuration().configure();
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
     Student student = session.get(Student.class, 12);
     System.out.println(student);
     
     Student student1 = session.get(Student.class, 12);
     System.out.println(student1);
     
     session.close();
	
	}
}
