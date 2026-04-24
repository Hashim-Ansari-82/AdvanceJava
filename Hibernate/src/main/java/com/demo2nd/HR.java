package com.demo2nd;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HR {

	@Id
	@Column(name="HR_Id")
	private int id;
	@Column(name="HR_name")
	private String name;
	@Column(name="HR_Department")
	private String Department;
	@Column(name="HR_Address")
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public HR(int id, String name, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		Department = department;
		Address = address;
	}
	@Override
	public String toString() {
		return "HR [id=" + id + ", name=" + name + ", Department=" + Department + ", Address=" + Address + "]";
	}
	public HR() {
		super();
	}
	
	
}
