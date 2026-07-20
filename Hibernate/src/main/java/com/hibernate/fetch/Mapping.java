package com.hibernate.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.map.Father;
import com.hibernate.map.Son;

public class Mapping {

	public static void main(String[] args) {
		System.out.println("Project Started .... !");
		Configuration cfg=new Configuration();
		cfg.addAnnotatedClass(Father.class);
		cfg.addAnnotatedClass(Son.class);
        SessionFactory factory = cfg.configure().buildSessionFactory();
        Session session = factory.openSession();
        
       Father a=session.get(Father.class,143);
       System.out.println(a.getFather_Id());
       System.out.println(a.getFather_Name());
        
       
       
       factory.close();
       session.close();
       
	}
}
