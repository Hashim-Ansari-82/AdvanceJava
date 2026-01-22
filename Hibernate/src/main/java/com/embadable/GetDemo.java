package com.embadable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/embadable/embaded.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student st=session.get(Student.class,2);
		System.out.println("Student Name : "+st.getStudentName()+"\n"+"Student Age : "+st.getStudentAge());
		
		Student st1=session.get(Student.class,2);
		System.out.println("Student Name : "+st1.getStudentName()+"\n"+"Student Age : "+st1.getStudentAge());
	
		Company co=session.get(Company.class,3);
		System.out.println("Company Name : "+co.getCompName()+"\n"+"Company Emp : "+co.getCompId());
		
		session.close();
		factory.close();
	}
}
