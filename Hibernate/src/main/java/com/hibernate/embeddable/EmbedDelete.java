package com.hibernate.embeddable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedDelete {

	public static void main(String[] args) {
		
		System.out.println("\n<-------- Program Started Successfully ------->\n");
		
		Configuration cfg = new Configuration().configure("embaded.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Company ID");
		int id = Integer.parseInt(br.readLine());
		
		Company company = session.get(Company.class, id);
		session.delete(company);
		System.out.println("Deleted Successfully");
		}
		catch(Exception e) {
			System.out.println("Deleted Failed");
		}
		tx.commit();
		session.close();
		
	}
}
