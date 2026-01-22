package com.onetomany;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CascadingTest {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("com/onetomany/onetomany.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Department d1 = new Department();
		d1.setDepartment("Network Marketing");
		
		Employee emp = new Employee();
		emp.setEmpName("irfan");
		emp.setEmpAddr("abs");
		emp.setEmpId(2132);
		emp.setHireDate(new Date());
		
		Employee emp2 = new Employee();
		emp2.setEmpName("ishaq Ansari");
		emp2.setEmpAddr("xyz");
		emp2.setEmpId(2136);
		emp2.setHireDate(new Date()); 
		
		List<Employee> list=new ArrayList<Employee>();
		list.add(emp);
		list.add(emp2);
		session.persist(d1);
		
		list.forEach(element ->{
			element.setDepart(d1);
		});
		d1.setEmp(list);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
