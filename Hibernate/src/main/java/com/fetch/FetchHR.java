package com.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Animal;

public class FetchHR {

	public static void main(String[] args) {
		
		Configuration configure = new Configuration().configure("hiber.cfg.xml");
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		 
		List<Animal> animal=session.createQuery("from Animal",Animal.class).getResultList();

		animal.forEach(value ->{
			System.out.println(value);
		});
		animal.forEach(value ->{
			System.out.println(value);
		});
		animal.forEach(value ->{
			System.out.println(value);
		});
		
		for(Animal an:animal) {
			System.out.println(an);
		}
		
		session.close();
	
		factory.close();
	}
}
