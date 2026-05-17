package com.hibernate.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Column(name ="Employee_Id")
	private int empId;
	@Column(name ="Employee_Name")
	private String empName;
	@Column(name ="Employee_Age")
	private int empAge;
	@Column(name ="Employee_Salary")
	private double empSalary;
	@Column(name ="Employee_Address")
	private String empAddress;
}
