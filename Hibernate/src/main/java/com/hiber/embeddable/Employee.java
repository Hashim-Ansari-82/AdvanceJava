package com.hiber.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Emp_Detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int empId;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_Age")
	private double age;
	@Column(name="Student_Address")
	private Address address;
}
