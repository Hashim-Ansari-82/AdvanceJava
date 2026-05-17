package com.hibernate.oneto1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneTo1 {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration().configure("1to1.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Question question1 = new Question();
		Question question2 = new Question();
		Question question3 = new Question();
		Question question4 = new Question();
		Question question5 = new Question();
		
		Answer answer1 = new Answer();
		Answer answer2 = new Answer();
		Answer answer3 = new Answer();
		Answer answer4 = new Answer();
		Answer answer5 = new Answer();
		
		question1.setQuesId(324);
		question1.setQuestion("What is Java");
		
		question2.setQuesId(354);
		question2.setQuestion("What is Oops");
		
		question3.setQuesId(365);
		question3.setQuestion("What is Collection");
		
		question4.setQuesId(375);
		question4.setQuestion("What is Hibernate");
		
		question5.setQuesId(367);
		question5.setQuestion("What is SessionFactory");
		
		answer1.setAnsId(453);
		answer1.setAnswer("Java is a high level object oriented Programing language.");
		answer1.setQuestion(question1);
		
		answer2.setAnsId(654);
		answer2.setAnswer("Oops is a programing paradiagm language.");
		answer2.setQuestion(question2);
		
		answer3.setAnsId(546);
		answer3.setAnswer("Collection is a group of individual object");
		answer3.setQuestion(question3);
		
		answer4.setAnsId(698);
		answer4.setAnswer("Hibernate is an orm framework that maps java object to database tables.");
		answer4.setQuestion(question4);
		
		answer5.setAnsId(896);
		answer5.setAnswer("SessionFactory is a Heavy wait obejct and its Create Session object.");
		answer5.setQuestion(question5);
		
		session.persist(answer1);
		session.persist(answer2);
		session.persist(answer3);
		session.persist(answer4);
		session.persist(answer5);
		
		tx.commit();
		
		factory.close();
		session.close();
		
	}
}
