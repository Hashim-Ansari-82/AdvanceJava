package com.hibernate.hql;

import java.io.IOException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Animal;

public class FetchByHql {
   
	public static void main(String[] args) throws IOException {
		
		System.out.println("Project Started....!");
		Configuration cfg = new Configuration().addAnnotatedClass(Animal.class).configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
        		
		List<Animal> list = session.createQuery("from Animal",Animal.class).getResultList();
		
		for(Animal animal:list) {
			System.out.println(animal);
		}
		System.out.println("Fetch Successfully.....!");
		session.close();
		factory.close();
	}
}
