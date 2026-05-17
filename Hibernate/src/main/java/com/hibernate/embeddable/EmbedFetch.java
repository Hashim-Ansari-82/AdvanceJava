package com.hibernate.embeddable;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmbedFetch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("\n<-------- Program Started Successfully ------->\n");
		
		Configuration cfg = new Configuration().configure("embaded.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Company> list = session.createCriteria(Company.class).list();
		
		System.out.println("\n                                  Company Detail List Here");
		for(Company compnay:list) {
			System.out.println("____________________________________________________________________________________________________________________________\n");
			System.out.println(compnay);
		}
		System.out.println("____________________________________________________________________________________________________________________________\n");
	    
		factory.close();
		session.close();
	}
}
