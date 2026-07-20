package com.springjdbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.springjdbc.daoimpl")
public class JdbcConfig {
	 
	    @Bean("ds")
		 public DriverManagerDataSource getDataSource() {
			 DriverManagerDataSource source = new DriverManagerDataSource();
			 source.setDriverClassName("com.mysql.cj.jdbc.Driver");
			 source.setUrl("jdbc:mysql://localhost:3306/Springjdbc");
			 source.setPassword("root");
			 source.setUsername("root");
			 return source;
	}
	    @Bean("template")
		 public JdbcTemplate getTemplate() {
			 JdbcTemplate template = new JdbcTemplate();
			 template.setDataSource(getDataSource());
			 return template;
		 }
			/*
			 * @Bean("vehicle") public VehicleDao getVehicleDao() { VehicleDaoImpl
			 * vehicleDao = new VehicleDaoImpl(); vehicleDao.setTemplate(getTemplate());
			 * return vehicleDao; }
			 */
 }