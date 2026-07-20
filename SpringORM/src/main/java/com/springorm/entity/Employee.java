package com.springorm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int employeeId;
	private double employeeSalary;
	private String employeeName;
	private String employeeAddress;
	private int employeeAge;
}
