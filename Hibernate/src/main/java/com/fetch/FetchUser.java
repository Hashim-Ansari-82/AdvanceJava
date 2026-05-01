package com.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class FetchUser {

	public static void main(String[] args) {
		 
		Configuration cfg = new Configuration().configure("com/xml/user.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		List<User> user=session.createQuery("from User",User.class).getResultList();
		
		user.forEach(value -> {
			System.out.println(value);
		});
		factory.close();
		session.close();
	}
}
