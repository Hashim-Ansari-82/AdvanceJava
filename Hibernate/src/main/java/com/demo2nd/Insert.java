package com.demo2nd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Insert {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter HR Id");
		int id=Integer.parseInt(br.readLine());
		System.out.println("Enter HR Name");
		String name=br.readLine();
		System.out.println("Enter HR Department");
		String Department=br.readLine();
		System.out.println("Enter HR address");
		String address=br.readLine();
		
      SessionFactory factory = new Configuration().configure("com/demo2nd/hr.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		HR hr = new HR();
		hr.setId(id);
		hr.setName(name);
		hr.setDepartment(Department);
		hr.setAddress(address);
		
		session.persist(hr);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Insertd successfully");
	}
}
