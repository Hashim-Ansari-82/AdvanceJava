package com.springcore.configentity;

import org.springframework.beans.factory.annotation.Value;

public class Employee {

	@Value
	("543")
	private int id;
	@Value("Hashim Ansari")
	private String name;
	@Value("Sakinaka")
	private String address;
	@Value("20")
	private int age;
	@Value("Engineer")
	private String ability;

	public void emp() {
		System.out.println("Employee [id=" + id + ", name=" + name + ", address=" + address + ", age=" + age + ", ability="
				+ ability + "]");
	}
	
	
}
