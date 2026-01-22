package com.manytomany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure("com/manytomany/manytomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Project p1=new Project();
		p1.setProName("Hostel Management System");
		
		Project p2=new Project();
		p2.setProName("Bank Management System");
		
		Employee e1=new Employee();
		e1.setEmpName("Hashim Ansari");
		
		Employee e2=new Employee();
		e2.setEmpName("Arsalan Khan");
		
		List<Employee> emp1=new ArrayList<Employee>();
		emp1.add(e2);
		emp1.add(e1);
		
		List<Project> pro1=new ArrayList<Project>();
		pro1.add(p1);
		pro1.add(p2);
		
		e1.setPro(pro1);
		e2.setPro(pro1);
		
		p1.setEmp(emp1);
		p2.setEmp(emp1);
		
		session.persist(e1);
		session.persist(e2);
		session.persist(p1);
		session.persist(p2);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Done ☑️✅☑️✅");
	}		
}
