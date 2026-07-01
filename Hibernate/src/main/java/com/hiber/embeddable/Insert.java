package com.hiber.embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hiber.demo.StudentCity;

public class Insert {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Employee.class);
		cfg.addAnnotatedClass(Address.class);
		SessionFactory factory= cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Address address = new Address();
		address.setRoomNo(32);
		address.setCity(StudentCity.BANGLORE);
		
		Employee employee = new Employee();
		employee.setName("H R Ansari");
		employee.setEmpId(23);
		employee.setAge(21);
		employee.setAddress(address);
		
		session.persist(employee);
		transaction.commit();
		
		System.out.println("Insert Successfully");
		
		session.close();
		factory.close();
		}
}
