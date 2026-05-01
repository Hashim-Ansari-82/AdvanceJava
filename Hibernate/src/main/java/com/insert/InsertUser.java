package com.insert;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class InsertUser {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter User Name");
		String name = br.readLine();
		System.out.println("Enter User Address");
		String address = br.readLine();
		System.out.println("Enter User Gender");
		String gender = br.readLine();
		System.out.println("Enter User Age");
		int age = Integer.parseInt(br.readLine());
		
		System.out.println("Project Started....!");
		Configuration cfg=new Configuration().configure("com/xml/user.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		User user = new User();
		user.setName(name);
		user.setAddress(address);
		user.setGender(gender);
		user.setAge(age);
		user.setDate(new Date());
		FileInputStream fis=new FileInputStream("src/main/java/h.jpg");
    	byte[] img=new byte[fis.available()];
    	fis.read();
    	user.setImg(img);
		session.persist(user);
		tx.commit();
		factory.close();
		session.close();
		
		System.out.println("Added Successfully....!");
		
	}
}
