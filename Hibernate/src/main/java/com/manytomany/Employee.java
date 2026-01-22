package com.manytomany;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table; 

@Entity
@Table(name = "Emp_Id")
public class Employee {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empId;
	private String empName;
	
	@ManyToMany
	private List<Project> pro;

	public Employee(int empId, String empName, List<Project> pro) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.pro = pro;
	}

	public Employee() {
		super();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getPro() {
		return pro;
	}

	public void setPro(List<Project> pro) {
		this.pro = pro;
	}
	
}
