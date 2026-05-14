package com.springjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private int perId;
	private String perName;
	private int Age;
	private String Address;
	private String Country;
	
}
