package com.hibernate.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class UpdateBySql {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Animal.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		System.out.println("Update Start .....! ");
		String query="update animal set name='Lion' where Id=2";
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
