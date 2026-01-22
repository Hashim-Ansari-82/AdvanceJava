package com.onetomany;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMany {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("com/onetomany/onetomany.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		/* Department Class Object */

		Department dp = new Department();
		dp.setDepartment("IT");

		/* Employee Class Object */

		Employee emp1 = new Employee();
		emp1.setEmpId(435);
		emp1.setEmpName("Hashim Ansari");
		emp1.setEmpAddr("Sakinaka 90 ft Road Mumbai ! ");
		emp1.setHireDate(new Date());
		emp1.setDepart(dp);

		Employee emp2 = new Employee();
		emp2.setEmpId(436);
		emp2.setEmpName("Saad Ansari");
		emp2.setEmpAddr("Mudadiha Sant kabir nagar ! ");
		emp2.setHireDate(new Date());
		emp2.setDepart(dp);

		Employee emp3 = new Employee();
		emp3.setEmpId(437);
		emp3.setEmpName("Hanzala Ansari");
		emp3.setEmpAddr("Koilsa sant Kabir nagar ! ");
		emp3.setHireDate(new Date());
		emp3.setDepart(dp);
		
		Employee emp4 = new Employee();
		emp4.setEmpId(438);
		emp4.setEmpName("Arsalan Khan");
		emp4.setEmpAddr("Sakinaka 90 ft Road Mumbai ! ");
		emp4.setHireDate(new Date());
		emp4.setDepart(dp);
		
		Employee emp5 = new Employee();
		emp5.setEmpId(439);
		emp5.setEmpName("Azan Ansari");
		emp5.setEmpAddr("Uttar pradesh Sant kabir nagar ! ");
		emp5.setHireDate(new Date());
		emp5.setDepart(dp);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);

		session.persist(dp);

		for (Employee emp : list) {
			emp.setDepart(dp);
		}

		dp.setEmp(list);

		tx.commit();
		factory.close();
		session.close();

		System.out.println("Done ☑️✅☑️✅");

	}
}
