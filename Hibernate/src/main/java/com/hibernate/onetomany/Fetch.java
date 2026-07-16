package com.hibernate.onetomany;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
 
public class Fetch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("1tomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		String query="from Forest";
		String query1="select distinct f from Forest f join fetch f.animals";
		
		List<Forest> list = session.createQuery(query,Forest.class).getResultList();
		list.forEach(value ->{
			System.out.println(value);
			});
		
		session.close();
		factory.close();
	}
}
