package com.demo1st;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateCrudOperation {
	
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	static int choice=0;
	 static void insert() throws Exception {
		 
		System.out.println("Enter Student Id");
		int id=Integer.parseInt(br.readLine());
	    System.out.println("Enter Student name");
	    String name=br.readLine();
	    System.out.println("Enter Student age");
	    int age=Integer.parseInt(br.readLine());
	    System.out.println("Enter Student address");
	    String address=br.readLine();
	    System.out.println("Enter Student department");
	    String department=br.readLine();
	    System.out.println("Enter Student gender");
	    String gender=br.readLine();
	    System.out.println("\n<--------- Project Started ----------->\n");
		SessionFactory factory = new Configuration().configure("com/demo1st/hiber.cfg.xml").buildSessionFactory();
	   	Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		StudentDetail s=new StudentDetail();
		s.setStuId(id);
		s.setStuName(name);
		s.setStuAge(age);
		s.setStuAddress(address);
		s.setStuDepartment(department);
		s.setStuGender(gender);
		
		session.persist(s);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("\nInsert Successfully ......! ");
	 }
	 
	static void fetch() {
	    System.out.println("\n<--------- Project Started ----------->\n");
		SessionFactory factory = new Configuration().configure("com/demo1st/hiber.cfg.xml").buildSessionFactory();
	   	Session session = factory.openSession();
	   	System.out.println();
	   	
	   	List<StudentDetail> list=session.createQuery("from StudentDetail",StudentDetail.class).getResultList();
	   	
	   	list.forEach(value ->{
	   		System.out.println(value);
	   	});
	   	System.out.println("\nData Fetch Successfully ......! ");
	}
	
	static void update()throws Exception {
		System.out.println("Enter update id");
		 int id=Integer.parseInt(br.readLine());
		 
		 System.out.println("\n<--------- Project Started ----------->\n");
			Session session = new Configuration().configure("com/demo1st/hiber.cfg.xml").buildSessionFactory().openSession();
			Transaction tx = session.beginTransaction(); 
			
			StudentDetail s=session.get(StudentDetail.class,id);
			
			System.out.println("\n<--------------- Enter You can Update -------------->\n");
			System.out.println("1.Name           2.Address                  3.Age\n");
			System.out.println("4.Department     5.Name And Address         6.Address And Age\n");
			System.out.println("7.Name And Age   8.Address And Department   9.Department And Age\n");
			System.out.println("                 10.Exit Button                            ");
			
			do {
					choice =Integer.parseInt(br.readLine());
			
		 if(s != null) {
			switch(choice) {
			
			  case 1:					
				System.out.println("Enter New Name");
				String name=br.readLine();
				s.setStuName(name);
				System.out.println("Updated Successfully.....!");
				tx.commit();
				session.close();
				menu();
			break;
			case 2:					
			    	System.out.println("Enter new Address");
			    	String address=br.readLine();
			    	s.setStuAddress(address);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			   break;
			case 3:					
			    	System.out.println("Ente New Age");
			    	int age=Integer.parseInt(br.readLine());
			    	s.setStuAge(age);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			 case 4:					
			    	System.out.println("Ente New Department");
			    	String department=br.readLine();
			    	s.setStuDepartment(department);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			 case 5:
				    System.out.println("Enter New Name");
					String name1=br.readLine();
					s.setStuName(name1);
					System.out.println("Enter new Address");
			    	String address1=br.readLine();
			    	s.setStuAddress(address1);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			  break;
			 case 6 :
				   System.out.println("Enter new Address");
			    	String address2=br.readLine();
			    	s.setStuAddress(address2);
			    	System.out.println("Ente New Age");
			    	int age1=Integer.parseInt(br.readLine());
			    	s.setStuAge(age1);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			 case 7 :
				   System.out.println("Enter New Name");
					String name2=br.readLine();
					s.setStuName(name2);
					System.out.println("Ente New Age");
			    	int age2=Integer.parseInt(br.readLine());
			    	s.setStuAge(age2);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			 case 8 :
				   System.out.println("Enter new Address");
			    	String address3=br.readLine();
			    	s.setStuAddress(address3);
			    	System.out.println("Ente New Department");
			    	String department2=br.readLine();
			    	s.setStuDepartment(department2);
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			 case 9 :
				 System.out.println("Ente New Department");
			    	String department3=br.readLine(); 
			    	s.setStuDepartment(department3);
			    	System.out.println("Ente New Age");
			    	int age3=Integer.parseInt(br.readLine());
			    	s.setStuAge(age3); 
			    	System.out.println("Updated Successfully.....!");
			    	tx.commit();
					session.close();
			    	menu();
			    	break;
			  default : 
				  System.out.println("Please Enter Valid Option");
			}
		 }
			else {
				System.out.println("\"Updated failed....!");
			  }
			}while(choice != 10);
	}
       static void delete() throws Exception {
		
	   System.out.println("Enter Delete Id");
	   int id=Integer.parseInt(br.readLine());
	   
	    System.out.println("\n<--------- Project Started ----------->\n");
		Session session = new Configuration().configure("com/demo1st/hiber.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		
		StudentDetail s=session.get(StudentDetail.class,id);
		
		if(s != null) {
			session.delete(s);
			System.out.println("Deleted Successfully.....!");
		}
		else {
			System.out.println("Deleted failed....!");
		}
		
		tx.commit();
		session.close();
		
		System.out.println("\nData Deleted Successfully ......! ");
	}
	
	static void menu()throws Exception {
		do {
			System.out.println("\n <------------ Choose Any Operation ------------>\n");
			System.out.println("	1.Insert Data		2.Fetch Data \n");
			System.out.println("	3.Update Date		4.Delete Date \n");
			System.out.println("     		    5.Exit Button ");
			choice=Integer.parseInt(br.readLine());
			switch(choice) { 
			case 1:
				insert();
			  break;
			case 2:
				fetch();
			  break;
			case 3:
				update();
				break;
			case 4:
				delete();
			  break;
			}	
		}
		while(choice !=5);
		System.out.println("Transaction Successfully .... !");
	}
	public static void main(String[] args) throws Exception  {
	     menu();  
   } 
}
