package com.insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Employee;
import com.map.Project;

public class ManyToMany {

	public static void main(String[] args) {
		
		System.out.println("Project Started .... !");
		Configuration cfg=new Configuration().configure("manyToMany.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        
        emp1.setEId(143);
        emp1.setName("Hashim Ansari");
        emp1.setAge(20);
        
        emp2.setEId(144);
        emp2.setName("Arsalan Khan");
        emp2.setAge(22);
        
        emp3.setEId(145);
        emp3.setName("Moiez Khan");
        emp3.setAge(20);
        
        Project project1 = new Project();
        Project project2 = new Project();
        Project project3 = new Project();
        
        project1.setPId(1432);
        project1.setName("Hospital Management System");
        
        project2.setPId(1433);
        project2.setName("Banking Application");
        
        project3.setPId(1435);
        project3.setName("Business Application");
        
        List<Employee> list1=new ArrayList<Employee>();
        list1.add(emp1);
        list1.add(emp2);
        list1.add(emp3);
        
       List<Project> list2 = new ArrayList<Project>();
       list2.add(project1);
       list2.add(project2);
       list2.add(project3);
        
       emp1.setProject(list2);
       project2.setEmp(list1);
       
       session.persist(project1);
       session.persist(project2);
       session.persist(project3);
       
       session.persist(emp1);
       session.persist(emp2);
       session.persist(emp3);
       
       tx.commit();
       session.close();
       factory.close();
       
	}
}