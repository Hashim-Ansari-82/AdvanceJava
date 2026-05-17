package com.hibernate.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentUpdate {
	
	static Session session;
	static Transaction tx;
	
	public static void main(String[] args){
		
		System.out.println("<-------- Program Started Successfully ------->");
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Roll No You can Change detail");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Address");
		String address = br.readLine();
		System.out.println("Enter Student City");
		String city = br.readLine();
		
		session = factory.openSession();
		tx = session.beginTransaction();
		
		Student student = session.get(Student.class, id);
		student.setAddress(address);
		student.setCity(city);
		student.setDate(new Date());
		
		session.update(student);
		tx.commit();
 		System.out.println("Studant Detail Updated Successfully");
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Student Updated Failed\n"+e);
		}

		factory.close();
		session.close();
	}
}
