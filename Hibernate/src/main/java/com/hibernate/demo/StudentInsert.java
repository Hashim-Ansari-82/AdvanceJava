package com.hibernate.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentInsert {
	
	static Session session;
	static Transaction tx;
	
	public static void main(String[] args){
		
		System.out.println("<-------- Program Started Successfully ------->");
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Roll No");
		int rollNo = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name");
		String name = br.readLine();
		System.out.println("Enter Student ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Address");
		String address = br.readLine();
		System.out.println("Enter Student City");
		String city = br.readLine();
		System.out.println("Enter Student Class");
		String standard = br.readLine();
		
		Student student = new Student();
		student.setId(id);
		student.setName(name);
		student.setRollNo(rollNo);
		student.setAddress(address);
		student.setCity(city);
		student.setStandard(standard);
		student.setDate(new Date());
		
		session = factory.openSession();
		tx = session.beginTransaction();
		
		session.persist(student);
		tx.commit();
		System.out.println("Studant Detail Added Successfully");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Student Added Failed\n"+e);
		}

		factory.close();
		session.close();
	}
}
