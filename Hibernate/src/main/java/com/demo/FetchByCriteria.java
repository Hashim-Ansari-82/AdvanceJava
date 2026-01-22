package com.demo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.test.Student;

public class FetchByCriteria {

	public static void main(String[] args) {
		

		SessionFactory factory = new Configuration().configure("com/test/test.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		
		Criteria criteria = session.createCriteria(Student.class);
		
	//	criteria.add(Restrictions.eq("studentAge",23));		
	//	criteria.add(Restrictions.gt("studentAge",23));		
		criteria.add(Restrictions.lt("studentAge",23));		
		List<Student> student=criteria.list();
		
		student.forEach(st -> {
			System.out.println(st);
		});
		
	}
}
