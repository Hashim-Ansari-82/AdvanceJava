package com.hibernate.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("1tomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		@SuppressWarnings("unchecked")
		List<Animal> list = session.createCriteria(Animal.class).list();
		list.forEach(value ->{
			System.out.println(value.getAnimalId()+"    "+value.getName()+"   "+value.getFood());
		});
		
		session.close();
		factory.close();
	}
}
