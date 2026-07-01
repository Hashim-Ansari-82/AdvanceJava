package com.hiber.embeddable;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
    	Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory= cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		
		List<Employee> list = session.createCriteria(Employee.class).list();
		
		list.forEach(System.out::println);
	}
}
