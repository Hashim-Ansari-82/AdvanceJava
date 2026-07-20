package com.hibernate.fetch;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Student;

public class FetchEmbed {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Project Started ....!");
		Thread.sleep(2500);
		Configuration configure = new Configuration().addAnnotatedClass(com.hibernate.entity.Student.class);
		SessionFactory factory = configure.configure().buildSessionFactory();
		Session session = factory.openSession();

		List<Student> student = session.createQuery("from Student", Student.class).getResultList();

		student.forEach(value -> {
			System.out.println(value);
		});
		session.close();
		factory.close();
	}
}
