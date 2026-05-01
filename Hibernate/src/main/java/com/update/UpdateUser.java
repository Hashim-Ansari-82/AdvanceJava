package com.update;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class UpdateUser {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Id You Can change Detail");
		int id=Integer.parseInt(br.readLine());
		
		System.out.println("Project Started .... !");
		Thread.sleep(2500);
		
		Configuration configure = new Configuration().configure("com/xml/user.cfg.xml");
		SessionFactory factory = configure.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		System.out.println("Enter User Name");
		String name = br.readLine();
		System.out.println("Enter User Address");
		String address = br.readLine();
		System.out.println("Enter User Gender");
		String gender = br.readLine();
		System.out.println("Enter User Age");
		int age = Integer.parseInt(br.readLine());
		
		User user = session.get(User.class, id);
		user.setName(name);
		user.setAddress(address);
		user.setGender(gender);
		user.setAge(age);
		user.setDate(new Date());
		FileInputStream fis=new FileInputStream("src/main/java/h.jpg");
    	byte[] img=new byte[fis.available()];
    	fis.read();
    	user.setImg(img);
		if(user !=null) {
			session.update(user);
			System.out.println("Updated Successfully...!");
		}
		tx.commit();
		session.close();
		factory.close();
	}
}
