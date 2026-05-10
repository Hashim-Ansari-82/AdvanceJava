package com.hql;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Animal;

public class Pegination {
     
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Starting point");
		int start = Integer.parseInt(br.readLine());
		System.out.println("Enter Ending point");
		int end = Integer.parseInt(br.readLine());
		System.out.println("Project Started....!");
		
		Configuration cfg = new Configuration().configure("hql.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Query<Animal> list = session.createQuery("from Animal");
		
		list.setFirstResult(start);
		list.setMaxResults(end);
		
		List<Animal> rs = list.getResultList();
		
		rs.forEach(value ->{
			System.out.println(value);
		});
		session.close();
		factory.close();
	}
}
