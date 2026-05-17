package com.hibernate.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.Student;

public class Criteria {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		List<Student> list = session.createCriteria(Student.class).list();
		
		System.out.println("\n                                  Student Detail List Here");
		list.forEach(result -> {
		   System.out.println("____________________________________________________________________________________________________________________________\n");
		   System.out.println(result);
		});
		System.out.println("____________________________________________________________________________________________________________________________\n");
		
		factory.close();
		session.close();
	}
}
