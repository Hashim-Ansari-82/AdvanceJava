package com.hql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class UpdateByHql {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter new Animal Name");
		String name = br.readLine();
		System.out.println("Project Started....!");
		
		Configuration cfg = new Configuration().configure("com/xml/hql.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query="update Animal set name=:n Where Id=:i";
		Query q = session.createQuery(query);
		
		q.setParameter("n",name);
		q.setParameter("i",id);
		
		int i = q.executeUpdate();
		tx.commit();
		if(i>0) {
			System.out.println("Updated Successfully .... !");
		}
		else {
			System.out.println("Updated Failed");
		}
		session.close();
		factory.close();
	}
}
