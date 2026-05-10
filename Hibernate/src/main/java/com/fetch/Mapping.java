package com.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.map.Father;

public class Mapping {

	public static void main(String[] args) {
		System.out.println("Project Started .... !");
		Configuration cfg=new Configuration().configure("map1ToMany.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        
       Father a=session.get(Father.class,143);
       System.out.println(a.getFather_Id());
       System.out.println(a.getFather_Name());
       
       
       factory.close();
       session.close();
       
	}
}
