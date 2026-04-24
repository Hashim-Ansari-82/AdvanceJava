package com.demo2nd;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id");
		int id=Integer.parseInt(br.readLine());
		System.out.println(" Project Started......");
		
		SessionFactory factory = new Configuration().configure("com/demo2nd/hr.cfg.xml").buildSessionFactory();
	   Session session = factory.openSession();	
	   Transaction tx = session.beginTransaction();
	   HR hr = session.get(HR.class,id);
	   if(hr !=null) {
		   session.delete(hr);
	    System.out.println("Deleted Successfully....."); 
	   }
	   else {
		   System.out.println("Deleted Failed ...........");
	   }
	   tx.commit();
	   session.close();
	   factory.close();
	}
}
