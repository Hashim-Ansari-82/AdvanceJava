package com.manytomany;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proId;
	private String proName;
	
	@ManyToMany
	@JoinTable(
			   name = "emp_project",
			   joinColumns = {@JoinColumn(name = "pro_id")},
			   inverseJoinColumns = {@JoinColumn(name = "employee_id")}
			)	
	private List<Employee> emp;

	public Project(int proId, String proName, List<Employee> emp) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.emp = emp;
	}

	public Project() {
		super();
	}

	public int getProId() {
		return proId;
	}

	public void setProId(int proId) {
		this.proId = proId;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
}
