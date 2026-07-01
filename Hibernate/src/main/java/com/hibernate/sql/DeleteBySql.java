package com.hibernate.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class DeleteBySql {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Animal.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query="delete from animal where id=3";
		NativeQuery sql = session.createSQLQuery(query);
		
		int i = sql.executeUpdate();
		
		tx.commit();
		 if(i>0) {
			 System.out.println("Deleted Succesfully ..... !");
		 }
		 else {
			 System.out.println("Deleted Failed ..... !");
		 }
	}
}
