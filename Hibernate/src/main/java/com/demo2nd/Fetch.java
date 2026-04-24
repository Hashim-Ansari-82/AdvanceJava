package com.demo2nd;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/demo2nd/hr.cfg.xml").buildSessionFactory();
	   Session session = factory.openSession();
	   
       List<HR> list = session.createQuery("from HR",HR.class).getResultList();
       
       list.forEach(value ->{
    	   System.out.println(value);
       });
	}
}
