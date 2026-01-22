package com.onetomany;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
 
@Entity
public class Employee {

	@Id 
	private int empId;
	private String empName;
	private String empAddr;
	@Temporal(TemporalType.DATE)
	private Date hiredate;
	@ManyToOne
	@JoinColumn(name = "DepartmentId")
	private Department depart;

	public Employee(int empId, String empName, String empAddr, Date hiredate, Department depart) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.hiredate = hiredate;
		this.depart = depart;
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

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public Department getDepart() {
		return depart;
	}

	public void setDepart(Department depart) {
		this.depart = depart;
	}

	public Date getHireDate() {
		return hiredate;
	}

	public void setHireDate(Date date) {
		this.hiredate = date;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", hiredate=" + hiredate
				+ ", depart=" + depart + "]";
	}
	
}
