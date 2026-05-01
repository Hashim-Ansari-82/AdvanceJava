package com.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Certificate;
import com.entity.Student;

public class Embed {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Project Started .... !");
		Thread.sleep(5000);
		Configuration configure = new Configuration().configure("com/xml/embed.cfg.xml");
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Certificate certificate1 = new Certificate();
		certificate1.setId(143);
       certificate1.setCourse("Become Full Stack Java Developer");
       certificate1.setDuration("1 Year 6 Month");
       
       Student student1 = new Student();
       student1.setName("Rani Ansari");
       student1.setDivision("12th");
       student1.setCity("Mumbai");
       student1.setAddress("Nallasopara");
       student1.setCerti(certificate1);
       
       Certificate certificate2 = new Certificate();
       certificate2.setId(1432);
       certificate2.setCourse("Full Stack Java Developer");
       certificate2.setDuration("1 Year 1 Month");
       
       Student student2 = new Student();
       student2.setName("Hashim Ansari");
       student2.setDivision("BSC IT");
       student2.setCity("Mumbai");
       student2.setAddress("Sakinaka");
       student2.setCerti(certificate2);
       
       session.persist(student1);
       session.persist(student2);
       
       try {
       tx.commit();
       System.out.println("Insert Successfully .....!");
       }
       catch(Exception e) {
    	   tx.rollback();
    	   System.out.println("Something went Wrong .... !");
       }
       
       session.close();
       factory.close();
       
	}
}
