package com.hibernate.manytomany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Employee_Detail")
public class Employee {

	private int empID;
	@Id
	private String empName;
	private double salary;
	private int age;
	@ManyToMany
	private List<Project> project;
}
