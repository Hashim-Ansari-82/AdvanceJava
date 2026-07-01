package com.hiber.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppClass {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.addAnnotatedClass(District.class);
		cfg.addAnnotatedClass(Village.class);
		SessionFactory factory = cfg.configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		District district1 = new District();
		district1.setDistrict_Code(272125);
		district1.setDistrict_Name("Sant Kabir Nagar");

		District district2 = new District();
		district2.setDistrict_Code(272002);
		district2.setDistrict_Name("Basti");

		District district3 = new District();
		district3.setDistrict_Code(272207);
		district3.setDistrict_Name("Siddarth Nagar");

		Village village1 = new Village();
		village1.setVillage_No(65);
		village1.setVillage_Name("Koilsa");

		Village village2 = new Village();
		village2.setVillage_No(76);
		village2.setVillage_Name("Paidi");

		Village village3 = new Village();
		village3.setVillage_No(87);
		village3.setVillage_Name("Sehuda");

		/* District 1 to set 1 and 3 village */
		
		List<District> distList1 = new ArrayList<District>();

		distList1.add(district1);
		distList1.add(district3);
		
		List<Village> villList1 = new ArrayList<Village>();
		villList1.add(village1);
		villList1.add(village3);
		
	    district1.setVillage(villList1);
		
		/* District 2 to set 2 village */
		
		List<District> distList2 = new ArrayList<District>();
		distList2.add(district2);
		
		List<Village> villList2 = new ArrayList<Village>();
		villList2.add(village2);

        district2.setVillage(villList2); 
        
        /* District 3 to set all village */
        
        List<District> distList3 = new ArrayList<District>();
        distList3.add(district1);
        distList3.add(district2);
        distList3.add(district3);
        
        List<Village> villList3 = new ArrayList<Village>();
        villList3.add(village1);
        villList3.add(village2);
        villList3.add(village3);
        
        district3.setVillage(villList3);
		
		session.save(district1); 
		session.save(district2);
		session.save(district3);

		transaction.commit();

		session.close();
		factory.close();

	}
}
