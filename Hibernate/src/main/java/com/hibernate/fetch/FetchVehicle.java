package com.hibernate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Vehicle;


public class FetchVehicle {


	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(com.hibernate.entity.Vehicle.class).configure();
		SessionFactory factory= cfg.buildSessionFactory();
		Session session= factory.openSession();

		List<Vehicle> list = session.createQuery("from Vehicle",Vehicle.class).getResultList();
		
		System.out.println("---------------------------------------------------------------------------");
		for(Vehicle vehicle:list) {
			System.out.println(vehicle);
			System.out.println("---------------------------------------------------------------------------");
		}

				factory.close();
	}
}
