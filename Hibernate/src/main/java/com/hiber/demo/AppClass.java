package com.hiber.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppClass {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setName("Hashim Ansari");
		student.setAddress("Sakinaka");
		student.setCity(StudentCity.MUMBAI);
		student.setAddDate(new Date());
		
		String image="src/main/java/mypic.jpg";
		student.setImage(image.getBytes());
		
		Student student1 = new Student();
		student1.setName("Qasim Ansari");
		student1.setAddress("Nallasopara");
		student1.setCity(StudentCity.BANGLORE);
		student1.setAddDate(new Date());
		
		String image1="src/main/java/Qasim.jpg";
		student.setImage(image1.getBytes());
		
		Student student2 = new Student();
		student2.setName("Adnan Khan");
		student2.setAddress("Powai");
		student2.setCity(StudentCity.DELHI);
		student2.setAddDate(new Date());
		
		String image2="C:\\Users\\lenovo\\OneDrive\\文档\\Photos";
		student.setImage(image2.getBytes());
		
		Student student3 = new Student();
		student3.setName("Moiez Khan");
		student3.setAddress("Sakinaka");
		student3.setCity(StudentCity.GORAKHPUR);
		student3.setAddDate(new Date());
		
		String image3="C:\\Users\\lenovo\\OneDrive\\文档\\Photos";
		student.setImage(image3.getBytes());
		
		Student student4 = new Student();
		student4.setName("Srk Khan");
		student4.setAddress("Rasni Rasna");
		student4.setCity(StudentCity.KHALILABAD);
		student4.setAddDate(new Date());
		
		String image4="C:\\Users\\lenovo\\OneDrive\\文档\\Photos";
		student.setImage(image4.getBytes());
		
		session.persist(student);
		session.persist(student1);
		session.persist(student2);
		session.persist(student3);
		session.persist(student4);
		
		tx.commit();
		
		System.out.println("Inserted Successfully.......!");
		
		session.close();
		factory.close();
		
	}
}
