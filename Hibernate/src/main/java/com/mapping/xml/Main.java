package com.mapping.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/mapping/xml/mappingxml.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Person person1 = new Person();
		person1.setId(23242);
		person1.setName("Hashim Ansari");
		person1.setAddress("Sakinaka 90 ft road wajid ali compound");
		person1.setPhone(975346787);
		
		Person person2 = new Person();
		person2.setId(23243);
		person2.setName("Hashim Ansari");
		person2.setAddress("Sakinaka 90 ft road wajid ali compound");
		person2.setPhone(975346787);
		
		Person person3 = new Person();
		person3.setId(23244);
		person3.setName("Hashim Ansari");
		person3.setAddress("Sakinaka 90 ft road wajid ali compound");
		person3.setPhone(975346787);
		
		Person person4 = new Person();
		person4.setId(23245);
		person4.setName("Hashim Ansari");
		person4.setAddress("Sakinaka 90 ft road wajid ali compound");
		person4.setPhone(975346787);
		
		Person person5 = new Person();
		person5.setId(23246);
		person5.setName("Hashim Ansari");
		person5.setAddress("Sakinaka 90 ft road wajid ali compound");
		person5.setPhone(975346787);
		
		session.save(person1);
		session.save(person2);
		session.save(person3);
		session.save(person4);
		session.save(person5);
		
		tx.commit();
		factory.close();
		session.close();
		System.out.println("Done ✅☑️✅☑️");
	}
	
}
