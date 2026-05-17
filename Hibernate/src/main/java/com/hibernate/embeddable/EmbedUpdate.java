package com.hibernate.embeddable;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbedUpdate {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("embaded.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("Enter Company ID");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee ID");
			int empId = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Name");
			String name = br.readLine();
			System.out.println("Enter Employee Address");
			String address = br.readLine();
			System.out.println("Enter Employee Age");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Salary");
			int salary = Integer.parseInt(br.readLine());


			Employee employee =new Employee();
			employee.setEmpId(empId);
			employee.setEmpName(name);
			employee.setEmpAddress(address);
			employee.setEmpAge(age);
			employee.setEmpSalary(salary);
			
			Company company = session.get(Company.class, id);
			company.setEmployee(employee);
			
			session.update(company);
			tx.commit();
			System.out.println("Data Updated Successfully");

		} catch (Exception e) {
			tx.rollback();
			System.out.println("Exception Occure \n" + e);
		}

		factory.close();
		session.close();

	}
}
