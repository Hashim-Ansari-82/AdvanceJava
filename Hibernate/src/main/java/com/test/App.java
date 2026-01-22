package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main(String[] args) throws IOException {
    	
        Configuration cfg = new Configuration();
        cfg.configure("com/test/test.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

		/* Student Class Object */
        
        Student s1=new Student();
        s1.setStudentId(1244);
        s1.setStudentAge(23);
        s1.setStudentName("Mohsin khan");
        s1.setStudentAddress("Mumbai Sakinaka Kaju pada");
        
        Student s2=new Student();
        s2.setStudentId(1245);
        s2.setStudentAge(22);
        s2.setStudentName("Raiyyan khan");
        s2.setStudentAddress("Uttar Pradesh Semariyawan");
        
        Student s3=new Student();
        s3.setStudentId(1246);
        s3.setStudentAge(25);
        s3.setStudentName("Zuhaib khan");
        s3.setStudentAddress("Mumbai Sakinaka Wajid Ali compound");
        
        Student s4=new Student();
        s4.setStudentId(1247);
        s4.setStudentAge(19);
        s4.setStudentName("Faheem khan");
        s4.setStudentAddress("Uttar pradesh Mahuari sant kabir nagar");
        
        Student s5=new Student();
        s5.setStudentId(1248);
        s5.setStudentAge(20);
        s5.setStudentName("Hashim Ansari");
        s5.setStudentAddress("Mumbai sakinaka Wajid Ali compound ");
        
        Student s6=new Student();
        s6.setStudentId(1249);
        s6.setStudentAge(23);
        s6.setStudentName("Sharukh Khan ");
        s6.setStudentAddress("Nallasopara east Maharastra");
        
        Student s7=new Student();
        s7.setStudentId(1250);
        s7.setStudentAge(22);
        s7.setStudentName("Arsalan Pathan");
        s7.setStudentAddress("Mumbai metro sakinaka 90ft");
        
        Student s8=new Student();
        s8.setStudentId(1251);
        s8.setStudentAge(19);
        s8.setStudentName("Hamza Khan");
        s8.setStudentAddress("Maharastra 90ft road saki naka ");
        
        Student s9=new Student();
        s9.setStudentId(1252);
        s9.setStudentAge(21);
        s9.setStudentName("Salim Ansari");
        s9.setStudentAddress("Maharastra mumbai Sakinaka");
        
        Student s10=new Student();
        s10.setStudentId(1253);
        s10.setStudentAge(25);
        s10.setStudentName("Moiz Khan");
        s10.setStudentAddress("Saki naka 90ft Road Mumbai");

		/* Certificate Class Object */
        
        Certificate c1=new Certificate();
        c1.setStudentName("Suhaib Ansari");
        c1.setCertiNo(7);
        c1.setDate(new Date());
        c1.setCertiName("Software Developer");
        c1.setCourse("Full Stack Java Developer");
        FileInputStream fis=new FileInputStream("src/main/java/su.jpeg");
        byte[] image=new byte[fis.available()];
        fis.read(image);
        c1.setImage(image);
        
        Certificate c2=new Certificate();
        c2.setStudentName("Hashim Ansari");
        c2.setCertiNo(8);
        c2.setDate(new Date());
        c2.setCertiName("Software Developer");
        c2.setCourse("Full Stack Java Developer");
        FileInputStream fis1=new FileInputStream("src/main/java/HR.jpeg");
        byte[] image1=new byte[fis1.available()];
        fis1.read(image1);
        c2.setImage(image1);
        
        Certificate c3=new Certificate();
        c3.setStudentName("Salim Ansari");
        c3.setCertiNo(9);
        c3.setDate(new Date());
        c3.setCertiName("Software Developer");
        c3.setCourse("Full Stack Java Developer");
        FileInputStream fis2=new FileInputStream("src/main/java/sa.jpeg");
        byte[] image2=new byte[fis2.available()];
        fis2.read(image2);
        c3.setImage(image2);
        
        Certificate c4=new Certificate();
        c4.setStudentName("Asim Ansari");
        c4.setCertiNo(10);
        c4.setDate(new Date());
        c4.setCertiName("Software Developer");
        c4.setCourse("Full Stack Java Developer");
        FileInputStream fis3=new FileInputStream("src/main/java/as.jpeg");
        byte[] image3=new byte[fis3.available()];
        fis3.read(image3);
        c4.setImage(image3);
        
        Certificate c5=new Certificate();
        c5.setStudentName("Qasim Ansari");
        c5.setCertiNo(11);
        c5.setDate(new Date());
        c5.setCertiName("Software Developer");
        c5.setCourse("Full Stack Java Developer");
        FileInputStream fis4=new FileInputStream("src/main/java/qa.jpeg");
        byte[] image4=new byte[fis4.available()];
        fis4.read(image4);
        c5.setImage(image4);
        
        Certificate c6=new Certificate();
        c6.setStudentName("Tahir Ansari");
        c6.setCertiNo(12);
        c6.setDate(new Date());
        c6.setCertiName("Software Developer");
        c6.setCourse("Full Stack Java Developer");
        FileInputStream fis5=new FileInputStream("src/main/java/ta.jpeg");
        byte[] image5=new byte[fis5.available()];
        fis5.read(image5);
        c6.setImage(image5);
        
      
        session.persist(c1);
        session.persist(c2);
        session.persist(c3);
        session.persist(c4);
        session.persist(c5);
        session.persist(c6);
        
        session.persist(s1);
        session.persist(s2);
        session.persist(s3);
        session.persist(s4);
        session.persist(s5);
        session.persist(s6);
        session.persist(s7);
        session.persist(s8);
        session.persist(s9);
        session.persist(s10);
        
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data inserted successfully ✅✅");
    }
}
