package com.hql;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteByHql {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Project Started....!");
		
		Configuration cfg = new Configuration().configure("hql.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query = "delete from Animal where id=:x";
		Query q = session.createQuery(query);
		
		q.setParameter("x", id);
		int i = q.executeUpdate();
		tx.commit();
		
		if (i != 0) {
			System.out.println("Deleted Successfully.....!");
			System.out.println(i);
		} else {
			System.out.println("Deleted failed ......!");
		}
		session.close();
		factory.close();
	}
}
