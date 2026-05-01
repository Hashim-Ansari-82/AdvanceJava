package com.insert;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Answer;
import com.entity.Question;

public class Map1to1 {

	public static void main(String[] args) {
		
		System.out.println("Project Started .... !");
		Configuration cfg=new Configuration().configure("com/xml/map1To1.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
       Session session = factory.openSession();
       Transaction tx = session.beginTransaction(); 
       
       Answer a1=new Answer();
       a1.setAnsId(1432);
       a1.setAnswer("My Name is Hashim Ansari");
       
       Question q1 = new Question();
       q1.setQuesId(143);
       q1.setQuestion("What is Your Name");
       q1.setAnswer(a1);
       a1.setQues(q1);
       
       Answer a2=new Answer();
       a2.setAnsId(1433);
       a2.setAnswer("I Am From Koilsa");
       
       Question q2 = new Question();
       q2.setQuesId(144);
       q2.setQuestion("Where Are you live");
       q2.setAnswer(a2);
       a2.setQues(q2);
       
       Answer a3=new Answer();
       a3.setAnsId(1434);
       a3.setAnswer("I Am Styding");
       
       Question q3 = new Question();
       q3.setQuesId(145);
       q3.setQuestion("What to do");
       q3.setAnswer(a3);
       a3.setQues(q3);
       
       Answer a4=new Answer();
       a4.setAnsId(1435);
       a4.setAnswer("My Dream Become Software Engineer");
       
       Question q4 = new Question();
       q4.setQuesId(146);
       q4.setQuestion("What your Dream");
       q4.setAnswer(a4);
       a4.setQues(q4);
       
       session.persist(q1);
       session.persist(q2);
       session.persist(q3);
       session.persist(q4);
       
       session.persist(a1);
       session.persist(a2);
       session.persist(a3);
       session.persist(a4);
       
       
       System.out.println("Insert Successfull ... !");
       tx.commit();
       
       session.close();
       factory.close();
       
	}
}
