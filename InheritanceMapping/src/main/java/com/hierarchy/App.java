package com.hierarchy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory = new Configuration().configure()
        .addAnnotatedClass(Worker.class) 
        .addAnnotatedClass(RegularWorker.class) 
        .addAnnotatedClass(ContractWorker.class) 
        .buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        Worker worker = new Worker();
        worker.setWorkerId(3423);
        worker.setWorkerName("Sultan Bhai");
        
        RegularWorker rgWorker = new RegularWorker();
        rgWorker.setWorkerId(8443);
        rgWorker.setWorkerName("Salman Khan");
        rgWorker.setSalary((double) 100000);
        rgWorker.setAddtionalBenefits(5000);
        
        
        ContractWorker ctWorker = new ContractWorker();
        ctWorker.setWorkerId(1234);
        ctWorker.setWorkerName("Mohd Hashim");
        ctWorker.setPricePerHour(2000);
        ctWorker.setContractPeriod("24 Hours");
        
        session.persist(worker);
        session.persist(rgWorker);
        session.persist(ctWorker);
        
        tx.commit();
        session.close();
        
        System.out.println("Data Inserted successfully");
        
    }
}
