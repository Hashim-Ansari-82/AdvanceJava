package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class InnerJoin {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("1ToMany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query="select f.Father_Id,f.Father_Name,s.Son_Name , s.Son_Id from Father as f Inner Join f.son as s";
		List<Object[]> list = session.createQuery(query).getResultList();
		
		for(Object[]  o:list) {
			System.out.println(Arrays.toString(o));
		}
		session.close();
		factory.close();
	}
}
