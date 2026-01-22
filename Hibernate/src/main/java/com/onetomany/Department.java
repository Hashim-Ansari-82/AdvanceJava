package com.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
 
@Entity
public class Department { 
    
	@Id
	private String department;
	@OneToMany(mappedBy = "depart",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Employee> emp;

	public Department(String department, List<Employee> emp) {
		super();
		this.department = department;
		this.emp = emp;
	}

	public Department() {
		super();
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
}
