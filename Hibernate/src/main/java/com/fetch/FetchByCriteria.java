package com.fetch;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.mapping.xml.Client;

public class FetchByCriteria {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Session session = new Configuration().configure("client.cfg.xml").buildSessionFactory().openSession();
		Criteria criteria = session.createCriteria(Client.class);
		
		criteria.add(Restrictions.between("id", 13,19));
		
		List<Client> list = criteria.list();
		
		list.forEach(Value ->{
			System.out.println(Value);
		});
		session.close();
	}
}
