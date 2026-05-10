package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class FetchBySql {
  
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		System.out.println("Project Started");
		SessionFactory factory = new Configuration().configure("hql.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query="select * From Animal";
		
		NativeQuery sql = session.createSQLQuery(query);
		
		List<Object[]> rs = sql.getResultList();
		
		rs.forEach(value ->{
			System.out.println(Arrays.toString(value));
		});
	
		session.close();
		factory.close();
	}
}
