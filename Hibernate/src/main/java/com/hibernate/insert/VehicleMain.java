package com.hibernate.insert;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Vehicle;

public class VehicleMain {
 
	
	public static void main(String[] args)throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Bike Number");
		String number=br.readLine();
		System.out.println("Enter Owner Name");
		String name=br.readLine();
		System.out.println("Enter wheeler Type");
		String wheeler = br.readLine();
		System.out.println("Enter Bike Name");
		String bikeName = br.readLine();
		System.out.println("Enter Bike color");
		String color = br.readLine();
		
    	System.out.println("Project Started....!");
		
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Vehicle.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Vehicle vehicle = new Vehicle();
		vehicle.setNumber(number);
		vehicle.setOwnerName(name);
		vehicle.setWheeler(wheeler);
		vehicle.setBikeName(bikeName);
		vehicle.setColor(color);
		
		session.persist(vehicle);
		
		tx.commit();
		factory.close();
		session.close();
		
	}
}
