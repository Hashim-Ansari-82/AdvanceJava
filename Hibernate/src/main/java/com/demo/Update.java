package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.Certificate;

public class Update {
     public static void main(String[] args) {
		
    	Configuration configure = new Configuration().configure("com/test/test.cfg.xml");
    	SessionFactory factory = configure.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	 
 		Certificate s=session.get(Certificate.class,1); 
 		if(s != null) { 
 			s.setStudentName("Qasim Ansari");
 			s.setCourse("Python Developer...!");
 			session.update(s);
 			System.out.println("Updated Successfully...!");
 		}
 		else {
 			System.out.println("Updated Failed....!");
 		}
 		 
 		tx.commit();
 		factory.close();
 		System.out.println("Transaction Successfully....!");
	}
     
}
