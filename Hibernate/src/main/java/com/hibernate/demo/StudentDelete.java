package com.hibernate.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDelete {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
        System.out.println("<-------- Program Started Successfully ------->");
		
		Configuration cfg = new Configuration();
		SessionFactory factory = cfg.configure().buildSessionFactory();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student Roll No You can delete");
		int id = Integer.parseInt(br.readLine());
		
		
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = session.get(Student.class,id);
		
		if(student != null) {
			session.delete(student);
			System.out.println("Deleted Successfully.....!");
		}
		else {
			System.out.println("Deleted failed....!");
		}
		
		tx.commit();
		factory.close();
		session.close();
	}
}
