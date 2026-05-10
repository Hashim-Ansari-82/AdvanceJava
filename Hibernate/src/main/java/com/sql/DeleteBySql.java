package com.sql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class DeleteBySql {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hql.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String query="delete from animal where id=5";
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
