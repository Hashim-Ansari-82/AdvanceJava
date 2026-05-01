package com.insert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Animal;

public class InsertHR 
{
    public static void main( String[] args )throws Exception {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	System.out.println("Enter Animal Name");
    	String name=br.readLine();
    	System.out.println("Enter Animal color");
    	String color=br.readLine();
    	System.out.println("Enter Animal leg");
    	String leg=br.readLine();
    	System.out.println("Project Started....!");
    	Configuration cfg=new Configuration().configure("com/xml/hiber.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction(); 
       
       Animal animal = new Animal();
       animal.setName(name);
       animal.setColor(color);
       animal.setLeg(leg);
       System.out.println(animal);
       
       session.persist(animal);
       try{
       tx.commit();
       System.out.println("Inserted Successfully....!");
       }
       catch(Exception e) {
    	   tx.rollback();
    	   System.out.println("Due to some error");
       }
       session.close();
       factory.close();
       
    }
}
