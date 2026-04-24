package com.demo2nd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new	BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Id You can Update ....");
	int id=Integer.parseInt(br.readLine());
	System.err.println("Project Started.....");
	SessionFactory factory = new Configuration().configure("com/demo2nd/hr.cfg.xml").buildSessionFactory();
     Session session = factory.openSession();
     Transaction tx = session.beginTransaction();
     
     HR hr = session.get(HR.class,id);
     
     System.out.println("Enter name");
     String name=br.readLine();
     hr.setName(name);
    System.out.println("Enter Department");
    String dp=br.readLine();
     hr.setDepartment(dp);
     System.out.println("Enter Address");
     String ad=br.readLine();
     hr.setAddress(ad);
    System.out.println("Updated Successfully....");
     tx.commit();
     session.close();
     factory.close();
	}
}
