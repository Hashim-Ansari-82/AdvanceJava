package com.demo1st;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/demo1st/hiber.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		List<StudentDetail> resultList = session.createQuery("from StudentDetail",StudentDetail.class).getResultList();
		
//		StudentDetail s=session.find(StudentDetail.class,14);
//		System.out.println("Student Name : "+s.getStuName()+"\n"+"Student Age : "+s.getStuAge());
//
//		Session session1 = factory.openSession();
//		
//		StudentDetail s1=session1.get(StudentDetail.class,12);
//		System.out.println("Student Name : "+s1.getStuName()+"\n"+"Student Age : "+s1.getStuAge());
	
		resultList.forEach(value ->{
			System.out.println(value);
		});
		
		session.close();
		factory.close();
		
	  }
}
