package com.hibernate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Animal;

public class FetchAnimal {

	public static void main(String[] args) {
		
		Configuration configure = new Configuration().addAnnotatedClass(com.hibernate.entity.Animal.class);
		SessionFactory factory = configure.configure().buildSessionFactory();
		Session session = factory.openSession();
		 
		List<Animal> animal=session.createQuery("from Animal",Animal.class).getResultList();
  
		System.out.println("-------------------------------------------------------------");
		
		animal.forEach(System.out::println);
		 
		System.out.println("-------------------------------------------------------------");
		
		animal.forEach(value ->{
			System.out.println(value);
		});
		
		System.out.println("-------------------------------------------------------------");
		
		animal.forEach(value -> System.out.println(value));
		
		System.out.println("-------------------------------------------------------------");
		
		session.close();
	
		factory.close();
	}
}
