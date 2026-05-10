package com.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Animal;

public class DeleteHR {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Project Started .... !");
		Thread.sleep(5000);
		Configuration configure = new Configuration().configure("hiber.cfg.xml");
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Animal animal = session.get(Animal.class,6);
		
		if(animal != null) {
			session.delete(animal);
			System.out.println("Deleted Successfully ");
		}		
		else {
			System.out.println("Deleted Failed ....! ");
		}
		tx.commit();
		
		session.close();
		factory.close();
	}
}