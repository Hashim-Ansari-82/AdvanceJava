package com.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOne {
 
	public static void main(String[] args) {
		
	Configuration cfg = new Configuration();
	cfg.configure("com/onetoone/onetoone.cfg.xml");
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	Transaction tx = session.beginTransaction();
	
	/* Question Class Object */
	
	  QuestionSheet qs1=new QuestionSheet(); 
	  qs1.setQuesNo(132);
	  qs1.setQuestion("What is Java ? ");
	  
	  QuestionSheet qs2=new QuestionSheet(); 
	  qs2.setQuesNo(133);
	  qs2.setQuestion("What is Oops ? ");
	  
	  QuestionSheet qs3=new QuestionSheet();
	  qs3.setQuesNo(134);
	  qs3.setQuestion("What is Collection ? ");
	  
	  QuestionSheet qs4=new QuestionSheet(); 
	  qs4.setQuesNo(135);
	  qs4.setQuestion("What is Control Statement ? ");
	  
	  QuestionSheet qs5=new QuestionSheet(); 
	  qs5.setQuesNo(136);
	  qs5.setQuestion("What is Data types ? ");
	  
		/* Answer Class Object */
	  
	  AnswerSheet as1=new AnswerSheet(); 
	  as1.setAnsId(232);
	  as1.setAnswer("Java is a Programing language ! ");
	  
	  AnswerSheet as2=new AnswerSheet(); 
	  as2.setAnsId(233);
	  as2.setAnswer("Oops is a Programing paradigm language ! ");
	  
	  AnswerSheet as3=new AnswerSheet(); 
	  as3.setAnsId(234);
	  as3.setAnswer("Collect is a group of multiple Object into a single Entity ! "
	  );
	  
	  AnswerSheet as4=new AnswerSheet(); 
	  as4.setAnsId(235);
	  as4.setAnswer("Control out program Execution ! ");
	  
	  AnswerSheet as5=new AnswerSheet(); 
	  as5.setAnsId(236);
	  as5.setAnswer("Data is a type of which type data store in variable ! ");
	  
	  session.persist(qs1); 
	  session.persist(qs2); 
	  session.persist(qs3);
	  session.persist(qs4);
	  session.persist(qs5);
	  
	  session.persist(as1); 
	  session.persist(as2); 
	  session.persist(as3);
	  session.persist(as4); 
	  session.persist(as5);
	  
	  qs1.setAs(as1); 
	  qs2.setAs(as2); 
	  qs3.setAs(as3);
	  qs4.setAs(as4);
	  qs5.setAs(as5);
	  
	  as1.setQs(qs1);
	  as2.setQs(qs2);
	  as3.setQs(qs3); 
	  as4.setQs(qs4);
	  as5.setQs(qs5);
	 
	  tx.commit();
      factory.close();
	  session.close();

	  System.out.println("Done ☑️✅☑️✅");

	
	}
}
