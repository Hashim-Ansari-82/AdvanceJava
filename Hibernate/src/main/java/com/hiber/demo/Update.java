package com.hiber.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = session.get(Student.class, 1);
		student.setName("Qasim Ansari");
		
		session.update(student);
		tx.commit();
		System.out.println("Updated Successfully");
		session.close();
        factory.close();
		
	}
}
