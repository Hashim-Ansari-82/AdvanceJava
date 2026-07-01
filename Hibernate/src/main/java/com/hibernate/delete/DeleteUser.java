package com.hibernate.delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.User;

public class DeleteUser {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Project Started .... !");
		Thread.sleep(5000);
		Configuration configure = new Configuration().addAnnotatedClass(com.hibernate.entity.User.class);
		SessionFactory factory = configure.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user=session.get(User.class,15);
		
		if(user != null) {
			session.delete(user);
			System.out.println("Deleted Successfully.....!");
		}
		else {
			System.out.println("Deleted Failed");
		}
		tx.commit();
		session.close();
		factory.close();
	}
}
