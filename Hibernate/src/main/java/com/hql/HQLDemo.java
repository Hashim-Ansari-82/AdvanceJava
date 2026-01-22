package com.hql;

//import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import com.test.Student;


public class HQLDemo {
	public static void main(String[] args) {
		
    	Configuration cfg=new Configuration();
    	cfg.configure("com/test/test.cfg.xml");
		/* cfg.configure("com/onetomany/onetomany.cfg.xml"); */
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	
    	String query="from Student as s where s.studentName=:x and s.studentId =:y";
    	Query q = session.createQuery(query);
    	q.setParameter("x","Hashim Ansari");
    	q.setParameter("y",1248);
    	
    	List<Student> l=q.list();
    	
    	for (Student s : l) {
			System.out.println(s.getStudentName()+" "+s.getStudentAddress()+" "+s.getStudentAge()+" "+s.getStudentId());
		}
    	System.out.println("<------------------------------------------------------------->");
    	
    	String query1="delete from Student as s where s.studentName =:X";
    	Query q1 = session.createQuery(query1);
    	
    	q1.setParameter("X", "Raiyyan khan");
    	int i = q1.executeUpdate();
    	if(i>0) {
    	System.out.println("Deleted Successfully .....!");
    	System.out.println(i);
    	}
    	else {
    		System.out.println("Deleted failed or All ready deleted ....!");
    	}
     	System.out.println("<------------------------------------------------------------->");
    	
    	String query2="update Student set studentAge=:s where studentId=:i";
    	Query q3 = session.createQuery(query2);
    	q3.setParameter("s", 20);
    	q3.setParameter("i", 1247);
    	int j = q3.executeUpdate();
    	System.out.println("updated Successfully ... !");
    	System.out.println(j);
    	
		/*
		 * String
		 * query4="select e.empId,e,empName ,d.department from Employee as e INNER JOIN e.depart as d"
		 * ; Query<Object[]> q4 = session.createQuery(query4);
		 * 
		 * List<Object []> list = q4.getResultList();
		 * 
		 * for(Object [] o:list) { System.out.println(Arrays.toString(o)); }
		 */
    	
    	tx.commit();
    	factory.close();
    	session.close();
    			
    	
    	
	}
}
