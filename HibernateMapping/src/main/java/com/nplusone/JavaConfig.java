package com.nplusone;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class JavaConfig {

	public static SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				Configuration cfg = new Configuration();
				
				Properties properties = new Properties();
				properties.put(Environment.DRIVER,"com.mysql.cj.jdbc.Driver");
				properties.put(Environment.URL, "jdbc:mysql://localhost:3306/mapping");
				properties.put(Environment.USER, "root");
				properties.put(Environment.PASS, "root");
				properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQl8Dialect");
				
				properties.put(Environment.SHOW_SQL,"true");
				properties.put(Environment.FORMAT_SQL,"true");
				properties.put(Environment.HBM2DDL_AUTO,"update");

				cfg.setProperties(properties);
				
				ServiceRegistry builder = new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties()).build();
				
				sessionFactory = cfg.buildSessionFactory(builder);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
