package com.hibernate.insert;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.map.College;
import com.hibernate.map.Father;
import com.hibernate.map.Son;
import com.hibernate.map.Student;

public class Map1ToMany {

	public static void main(String[] args) {

		System.out.println("Project Started .... !");
		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(Father.class);
		cfg.addAnnotatedClass(College.class);
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Son.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		Father father = new Father();
		father.setFather_Id(143);
		father.setFather_Name("Sageer Ahmad");

		Son son1 = new Son();
		son1.setSon_Id(1432);
		son1.setSon_Name("Suhaib Ansari");
		son1.setFather(father);

		Son son2 = new Son();
		son2.setSon_Id(1433);
		son2.setSon_Name("Tahir Ansari");
		son2.setFather(father);

		Son son3 = new Son();
		son3.setSon_Id(1434);
		son3.setSon_Name("Qasim Ansari");
		son3.setFather(father);

		Son son4 = new Son();
		son4.setSon_Id(1435);
		son4.setSon_Name("Hashim Ansari");
		son4.setFather(father);

		Son son5 = new Son();
		son5.setSon_Id(1436);
		son5.setSon_Name("Salim Ansari");
		son5.setFather(father);

		Son son6 = new Son();
		son6.setSon_Id(1437);
		son6.setSon_Name("Aasim Ansari");
		son6.setFather(father);

		List<Son> list = new ArrayList<>();
		list.add(son1);
		list.add(son2);
		list.add(son3);
		list.add(son4);
		list.add(son5);
		list.add(son6);

		session.persist(father);

		for (Son son : list) {
			son.setFather(father);
		}
		father.setSon(list);

		College college = new College();
		college.setId(82);
		college.setName("Kisan Inter College");
		college.setAddress("Rasoolpur Basti");

		Student student1 = new Student();
		student1.setName("Hahsim Ansari");
		student1.setAddress("Koilsa");
		student1.setStandard("BSC IT");

		Student student2 = new Student();
		student2.setName("Arsalan Khan");
		student2.setAddress("Sakinaka");
		student2.setStandard("BCA");

		Student student3 = new Student();
		student3.setName("Moiez Khan");
		student3.setAddress("Balaipur");
		student3.setStandard("BCA");

		Student student4 = new Student();
		student4.setName("Adnan Khan");
		student4.setAddress("Powai");
		student4.setStandard("BCA");

		Student student5 = new Student();
		student5.setName("Zuhaib Ansari");
		student5.setAddress("Mumbra");
		student5.setStandard("BSC IT");

		List<Student> list1 = new ArrayList<Student>();
		list1.add(student1);
		list1.add(student2);
		list1.add(student3);
		list1.add(student4);
		list1.add(student5);

		session.persist(college);

		for (Student s : list1) {
			s.setCollege(college);
		}
		college.setStudent(list1);

		tx.commit();

		System.out.println("Insert Successfully....!");

		session.close();
		factory.close();
	}
}
