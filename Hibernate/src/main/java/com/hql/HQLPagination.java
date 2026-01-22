package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.test.Student;

public class HQLPagination {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/test/test.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		String query="from Student";
		Query q= session.createQuery(query);
		
		q.setFirstResult(0);
		q.setMaxResults(7);
		
		List<Student> list=q.list();
		list.forEach(element -> {
			System.out.println(element);
		});
	}
}
