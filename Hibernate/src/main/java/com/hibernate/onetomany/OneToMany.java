package com.hibernate.onetomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("1tomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Forest forest = new Forest();
		
		Animal animal1 = new Animal();
		animal1.setName("Lion");
		animal1.setFood("Meat");
		animal1.setForest(forest);
		
		Animal animal2 = new Animal();
		animal2.setName("Deer");
		animal2.setFood("Grass");
		animal2.setForest(forest);
		
		Animal animal3 = new Animal();
		animal3.setName("Heron");
		animal3.setFood("Grass");
		animal3.setForest(forest);
		
		Animal animal4 = new Animal();
		animal4.setName("King Fisher");
		animal4.setFood("Fish");
		animal4.setForest(forest);
		
		Animal animal5 = new Animal();
		animal5.setName("Parrot");
		animal5.setFood("Chilly");
		animal5.setForest(forest);
		
		List<Animal> list=new ArrayList<Animal>();
		list.add(animal1);
		list.add(animal2);
		list.add(animal3);
		list.add(animal4);
		list.add(animal5);
		
		forest.setId(24464);
		forest.setForestName("Amazon Jungel");
		forest.setAnimals(list);
			
		session.persist(forest);
		
		tx.commit();
		
		session.close();
		factory.close();
	}
}
