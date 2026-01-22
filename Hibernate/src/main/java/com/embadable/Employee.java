package com.embadable;

import jakarta.persistence.Embeddable;

@Embeddable
public class Employee {
      
	private int empId;
	private int empAge;
	private String empName;
	private String empAddress;
	private String empGender;
	public Employee(int empId, int empAge, String empName, String empAddress, String empGender) {
		super();
		this.empId = empId;
		this.empAge = empAge;
		this.empName = empName;
		this.empAddress = empAddress;
		this.empGender = empGender;
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
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpGender() {
		return empGender;
	}
	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}
	
}
