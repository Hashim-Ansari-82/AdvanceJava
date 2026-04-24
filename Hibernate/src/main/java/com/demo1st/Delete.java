package com.demo1st;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cache.Student;

public class Delete {

	public static void main(String[] args) {
		
		Session session = new Configuration().configure("com/demo/hiber.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		Student s=session.get(Student.class,5);
		
		if(s != null) {
			session.delete(s);
			System.out.println("Deleted Successfully.....!");
		}
		else {
			System.out.println("Deleted failed....!");
		}
		
		tx.commit();
		session.close();
		
		System.out.println("Transaction Successfully....!");
		
	}
}
