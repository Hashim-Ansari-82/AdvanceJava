package com.hibernate.embeddable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddable {
 
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("embaded.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		System.out.println("Enter Employee ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Name");
		String name = br.readLine();
		System.out.println("Enter Employee Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Address");
		String address = br.readLine();
		System.out.println("Enter Employee Salary");
		int salary = Integer.parseInt(br.readLine());
		
		System.out.println("\nEnter Company Detail\n");
		System.out.println("Enter Company ID");
		int compId = Integer.parseInt(br.readLine());
		System.out.println("Enter Company Address");
		String compAddr = br.readLine();
		System.out.println("Enter Company Owner Name");
		String ownerName = br.readLine();
		
		
		Employee employee = new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpAge(age);
		employee.setEmpAddress(address);
		employee.setEmpSalary(salary);
		
		Company company = new Company();
		company.setCompId(compId);
		company.setAddress(compAddr);
		company.setOwnerName(ownerName);
		company.setEmployee(employee);
		
		session.persist(company);
		tx.commit();
		System.out.println("Data Added Successfully");
		
		}
		catch(Exception e) {
			tx.rollback();
			System.out.println("Exception Occure \n"+e);
		}
		
		factory.close();
		session.close();
		
	}
}
