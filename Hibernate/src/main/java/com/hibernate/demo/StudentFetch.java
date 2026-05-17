package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentFetch {

	public static void main(String[] args){
		
		System.out.println("\n<-------- Program Started Successfully ------->\n");
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		Session session = factory.openSession();
		List<Student> list = session.createQuery("from Student",Student.class).getResultList();
		
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
