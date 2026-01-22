package com.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
 
	public static void main(String[] args) {
		
		Configuration cfg =new Configuration();
		cfg.configure("com/onetomany/onetomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee e=session.get(Employee.class,435);
		System.out.println(e.getEmpAddr());
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getDepart().getEmp());
		
		Employee e1=session.get(Employee.class,435);
		System.out.println(e1.getEmpAddr());
		System.out.println(e1.getEmpId());
		System.out.println(e1.getEmpName());
		System.out.println(e1.getDepart().getEmp());
		
		session.close();
		factory.close();
	}
}
