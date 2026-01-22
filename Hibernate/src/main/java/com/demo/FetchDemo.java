package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.test.Certificate;
import com.test.Student;


public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/test/test.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student s=session.find(Student.class,5);
		System.out.println("Student Name : "+s.getStudentName()+"\n"+"Student Age : "+s.getStudentAge());
	
		Session session1 = factory.openSession();
		
		Student s1=session1.get(Student.class,4);
		System.out.println("Student Name : "+s1.getStudentName()+"\n"+"Student Age : "+s1.getStudentAge());
	
		Certificate ct=session1.get(Certificate.class,2);
		System.out.println("Student Name : "+ct.getStudentName()+"\n"+"Certificate Name : "+ct.getCertiName());
	
		session1.close();
		factory.close();
		
	}
}
