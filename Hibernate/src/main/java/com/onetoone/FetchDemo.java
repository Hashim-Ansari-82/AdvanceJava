package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration(); 
		cfg.configure("com/onetoone/onetoone.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
       AnswerSheet ans=session.get(AnswerSheet.class,232);
		System.out.println(ans.getAnsId());
		System.out.println(ans.getAnswer());
		System.out.println(ans.getQs().getQuestion());
		System.out.println(ans.getClass());
		
		
		session.close();
		factory.close();
		
	}
}
