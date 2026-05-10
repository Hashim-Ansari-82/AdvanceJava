package com.mapping.xml;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertClient {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Client Name");
		String name = br.readLine();
		
		System.out.println("Enter Client Address");
		String address = br.readLine();
		
		System.out.println("Enter Client Number");
		long number = Long.parseLong(br.readLine());
		
		Configuration cfg = new Configuration().configure("client.cfg.xml");
		SessionFactory factory =cfg.buildSessionFactory();
		
		Client c=new Client();
		c.setName(name);
		c.setAddress(address);
		c.setNumber(number);
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.persist(c);
        tx.commit();	
		
		session.close();
		factory.close();
		
	}
}
