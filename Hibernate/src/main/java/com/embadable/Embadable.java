package com.embadable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embadable {
	
    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("com/embadable/embaded.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

		/* Student Class Object */
        
        Student st1=new Student();
        st1.setStudentId(1244);
        st1.setStudentAge(23);
        st1.setStudentName("Mohsin khan");
        st1.setStudentAddress("Mumbai Sakinaka Kaju pada");
        
        Student st2=new Student();
        st2.setStudentId(1245);
        st2.setStudentAge(22);
        st2.setStudentName("Raiyyan khan");
        st2.setStudentAddress("Uttar Pradesh Semariyawan");
        
        Student st3=new Student();
        st3.setStudentId(1246);
        st3.setStudentAge(25);
        st3.setStudentName("Zuhaib khan");
        st3.setStudentAddress("Mumbai Sakinaka Wajid Ali compound");
        
        Student st4=new Student();
        st4.setStudentId(1247);
        st4.setStudentAge(19);
        st4.setStudentName("Faheem khan");
        st4.setStudentAddress("Uttar pradesh Mahuari sant kabir nagar");
        
        Student st5=new Student();
        st5.setStudentId(1248);
        st5.setStudentAge(20);
        st5.setStudentName("Hashim Ansari");
        st5.setStudentAddress("Mumbai sakinaka Wajid Ali compound ");
        
        Student st6=new Student();
        st6.setStudentId(1249);
        st6.setStudentAge(17);
        st6.setStudentName("Rani Ansari");
        st6.setStudentAddress("Nallasopara east Maharastra");

		/* Certificate Class Object */
        
        Certificate c1=new Certificate();
        c1.setCertiNo(987655);
        c1.setCertiName("Software Developer");
        c1.setCourse("Full Stack Java Developer");
        
        Certificate c2=new Certificate();
        c2.setCertiNo(987656);
        c2.setCertiName("Software Developer");
        c2.setCourse("Full Stack Java Developer");
        
        Certificate c3=new Certificate();
        c3.setCertiNo(987657);
        c3.setCertiName("Software Developer");
        c3.setCourse("Full Stack Java Developer");
        
        Certificate c4=new Certificate();
        c4.setCertiNo(987658);
        c4.setCertiName("Software Developer");
        c4.setCourse("Full Stack Java Developer");
        
        Certificate c5=new Certificate();
        c5.setCertiNo(987659);
        c5.setCertiName("Software Developer");
        c5.setCourse("Full Stack Java Developer");
        
        Certificate c6=new Certificate();
        c6.setCertiNo(987660);
        c6.setCertiName("Software Developer");
        c6.setCourse("Full Stack Java Developer");
        
        Company cm1=new Company();
        cm1.setCompId(2341);
        cm1.setCompNo(9876);
        cm1.setCompName("Oracle");
        cm1.setCompFacelity("Everyday Cool and Fresh Water For Employee");
        
        Company cm2=new Company();
        cm2.setCompId(2342);
        cm2.setCompNo(9877);
        cm2.setCompName("Sunmicrosystem");
        cm2.setCompFacelity("Every Week 2 days Holiday");
        
        Company cm3=new Company();
        cm3.setCompId(2343);
        cm3.setCompNo(9878); 
        cm3.setCompName("Oracle");
        cm3.setCompFacelity("Everyday Cool and Fresh Water For Employee");
         
        Company cm4=new Company();
        cm4.setCompId(2344);
        cm4.setCompNo(9879);
        cm4.setCompName("Oracle");
        cm4.setCompFacelity("Everyday Cool and Fresh Water For Employee");
        
        Company cm5=new Company();
        cm5.setCompId(2345);
        cm5.setCompNo(98780);
        cm5.setCompName("Oracle");
        cm5.setCompFacelity("Everyday Cool and Fresh Water For Employee");
        
        Company cm6=new Company();
        cm6.setCompId(2346);
        cm6.setCompNo(9881);
        cm6.setCompName("Oracle");
        cm6.setCompFacelity("Everyday Cool and Fresh Water For Employee");
        
        Employee e1=new Employee();
        e1.setEmpId(766587);
        e1.setEmpAge(20);
        e1.setEmpName("Hashim Ansari");
        e1.setEmpAddress("Mumbai Sakinaka 90ft Road ");
        e1.setEmpGender("Male");
        
        Employee e2=new Employee();
        e2.setEmpId(766588);
        e2.setEmpAge(25);
        e2.setEmpName("Arsalan Khan");
        e2.setEmpAddress("Mumbai Sakinaka 90ft Road ");
        e2.setEmpGender("Male");
        
        Employee e3=new Employee();
        e3.setEmpId(766589);
        e3.setEmpAge(23);
        e3.setEmpName("Mohd Mohsin");
        e3.setEmpAddress("Mumbai Sakinaka 90ft Road ");
        e3.setEmpGender("Male");
        
        Employee e4=new Employee();
        e4.setEmpId(766590);
        e4.setEmpAge(21);
        e4.setEmpName("Faheem Khan");
        e4.setEmpAddress("Mumbai Kaju pada  ");
        e4.setEmpGender("Male");
        
        Employee e5=new Employee();
        e5.setEmpId(766591);
        e5.setEmpAge(25);
        e5.setEmpName("Raiyyan Khan");
        e5.setEmpAddress("Mumbai Sakinaka 90ft Road ");
        e5.setEmpGender("Male");
        
        Employee e6=new Employee();
        e6.setEmpId(766592);
        e6.setEmpAge(23);
        e6.setEmpName("Altmash Khan");
        e6.setEmpAddress("Mumbai Sakinaka 90ft Road ");
        e6.setEmpGender("Male");
        
        cm1.setEmp(e1);
        cm2.setEmp(e2);
        cm3.setEmp(e3);
        cm4.setEmp(e4);
        cm5.setEmp(e5);
        cm6.setEmp(e6);
        
        session.persist(cm1);
        session.persist(cm2);
        session.persist(cm3);
        session.persist(cm4);
        session.persist(cm5);
        session.persist(cm6);
        
        st1.setCerti(c1);
        st2.setCerti(c2);
        st3.setCerti(c3);
        st4.setCerti(c4);
        st5.setCerti(c5);
        st6.setCerti(c6);
         
        session.persist(st1);
        session.persist(st2);
        session.persist(st3);
        session.persist(st4);
        session.persist(st5);
        session.persist(st6);
        
        tx.commit();
        session.close();
        factory.close();

        System.out.println("Data inserted successfully ✅✅");
    }
}
