package com.springjdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

	private int id;
	private int noOfWheel;
	private String brand;
	private String name;
	private String fuel;
}
