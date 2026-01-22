package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLQuery {
      public static void main(String[] args) {
		
    	  SessionFactory factory = new Configuration().configure("com/test/test.cfg.xml").buildSessionFactory();
    	  Session session = factory.openSession();
    	  
    	  String query="select * from student";
    	   
    	  NativeQuery nq = session.createNativeQuery(query);
    	  List<Object[] > list=nq.list(); 
    	  
    	  list.forEach(element ->{
    		 System.out.println(element[4]+" : "+element[2]); 
    	  });
    	  
    	  session.close();
    	  factory.close();
	}
}
