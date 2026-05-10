package com.springcore.configclass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springcore.configentity.Employee;

@Configuration
@ComponentScan(basePackages = "com.springcore.configentity")
@PropertySource("classpath:application.properties")
public class JavaConfig {
	
	@Bean({"emp"})
	  public Employee emp() {
		  Employee employee = new Employee();
		  return employee;
	  }
}
