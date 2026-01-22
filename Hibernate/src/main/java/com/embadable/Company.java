package com.embadable;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comp_Emp_Detail")
public class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private int compId;
	private int compNo;
	private String compName;
	private String compFacelity;
	@Embedded
	private Employee emp;
	
	public Company(int serialNo, int compId, int compNo, String compName, String compFacelity, Employee emp) {
		super();
		this.serialNo = serialNo;
		this.compId = compId;
		this.compNo = compNo;
		this.compName = compName;
		this.compFacelity = compFacelity;
		this.emp = emp;
	}
	public Company() {
		super();
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public int getCompNo() {
		return compNo;
	}
	public void setCompNo(int compNo) {
		this.compNo = compNo;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompFacelity() {
		return compFacelity;
	}
	
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public void setCompFacelity(String compFacelity) {
		this.compFacelity = compFacelity;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
}
