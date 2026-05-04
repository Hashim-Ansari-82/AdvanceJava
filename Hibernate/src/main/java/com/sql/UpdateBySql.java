package com.sql;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class UpdateBySql {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/xml/hql.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Update Start .....! ");
		String query="update animal set name='Tiger' where Id=2";
		NativeQuery sqlQuery = session.createSQLQuery(query);
		
		int i = sqlQuery.executeUpdate();
		 tx.commit();
		
		 if(i>0) {
			 System.out.println("Updated Succesfully ..... !");
		 }
		 else {
			 System.out.println("Updated Failed ..... !");
		 }
		 
	}
}
