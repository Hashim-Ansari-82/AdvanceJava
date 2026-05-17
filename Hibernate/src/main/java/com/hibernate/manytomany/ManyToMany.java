
package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();

		SessionFactory factory = cfg.configure("manytomany.cfg.xml").buildSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();
		Employee employee5 = new Employee();

		Project project1 = new Project();
		Project project2 = new Project();
		Project project3 = new Project();
		Project project4 = new Project();
		Project project5 = new Project();

		// ================= Employees =================

		employee1.setEmpID(4325);
		employee1.setEmpName("Hashim Ansari");
		employee1.setAge(19);
		employee1.setSalary(80000);

		employee2.setEmpID(4565);
		employee2.setEmpName("Sharukh Khan");
		employee2.setAge(22);
		employee2.setSalary(70000);

		employee3.setEmpID(4871);
		employee3.setEmpName("Altmash Khan");
		employee3.setAge(20);
		employee3.setSalary(76768);

		employee4.setEmpID(4987);
		employee4.setEmpName("Moiez Khan");
		employee4.setAge(21);
		employee4.setSalary(60000);

		employee5.setEmpID(4386);
		employee5.setEmpName("Arsalan Khan");
		employee5.setAge(22);
		employee5.setSalary(75000);

		// ================= Projects =================

		project1.setProNo(5332);
		project1.setProName("Android Application");
		project1.setCost(5000);

		project2.setProNo(5768);
		project2.setProName("OTP Generator");
		project2.setCost(2500);

		project3.setProNo(7657);
		project3.setProName("Note Taker");
		project3.setCost(1000);

		project4.setProNo(5898);
		project4.setProName("Todo");
		project4.setCost(500);

		project5.setProNo(6455);
		project5.setProName("Customer Handling");
		project5.setCost(4000);

		// employee1 and employee2 work on project1

		List<Project> proList1 = new ArrayList<Project>();
		
		proList1.add(project1);
		proList1.add(project4);

		employee1.setProject(proList1);

		List<Employee> empList1 = new ArrayList<Employee>();
		
		empList1.add(employee1);

		project1.setEmployee(empList1); 
		
		/* Employee 3 and 4 work on project 4 */
		
		List<Project> proList4 = new ArrayList<Project>();
		proList4.add(project4);
		
		employee3.setProject(proList4);
		employee4.setProject(proList4);
		
		List<Employee> empList4 = new ArrayList<Employee>();
		
		empList4.add(employee3);
		empList4.add(employee4);
		
		project4.setEmployee(empList4);
		
		/* Employee 2 and 5 work on project 5 */
		
		ArrayList<Project> pro5 = new ArrayList<Project>();
		pro5.add(project5);
		pro5.add(project1);
		
		employee1.setProject(pro5);
		//employee5.setProject(pro5);
		
		ArrayList<Employee> emp5 = new ArrayList<Employee>();
		emp5.add(employee1);
		emp5.add(employee5);
		
		project5.setEmployee(emp5);
		
		/* Single employee 2 project */
		
		ArrayList<Project> srk = new ArrayList<Project>();
		srk.add(project2);
		srk.add(project3);
		
		employee2.setProject(srk);

		ArrayList<Employee> srkp = new ArrayList<Employee>();
		srkp.add(employee2);
		
		project2.setEmployee(srkp);
		
		/* Single employee All project */
		
		ArrayList<Project> ars = new ArrayList<Project>();
		ars.add(project1);
		ars.add(project2);
		ars.add(project3);
		ars.add(project4);
		ars.add(project5);
		
		employee5.setProject(ars);

		// ================= Persist =================

		session.persist(project1);
		session.persist(project2);
		session.persist(project3);
		session.persist(project4);
		session.persist(project5);

		tx.commit();

		session.close();
		factory.close();
	}
}