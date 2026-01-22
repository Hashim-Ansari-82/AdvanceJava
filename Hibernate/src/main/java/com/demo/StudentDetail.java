package com.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_Detail")
public class StudentDetail {

    @Id
    @Column(name = "Student_Id")
	private int stuId;
    @Column(name = "Student_name")
	private String stuName;
    @Column(name = "Student_Address")
	private String stuAddress;
    @Column(name = "Student_Age")
	private int stuAge;
    @Column(name = "Student_Gender")
	private String stuGender;
    @Column(name = "Student_Department")
	private String stuDepartment;
	public StudentDetail(int stuId, String stuName, String stuAddress, int stuAge, String stuGender,
			String stuDepartment) {
		super();
		this.stuId = stuId;
		this.stuName = stuName;
		this.stuAddress = stuAddress;
		this.stuAge = stuAge;
		this.stuGender = stuGender;
		this.stuDepartment = stuDepartment;
	}
	public StudentDetail() {
		super();
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public String getStuGender() {
		return stuGender;
	}
	public void setStuGender(String stuGender) {
		this.stuGender = stuGender;
	}
	public String getStuDepartment() {
		return stuDepartment;
	}
	public void setStuDepartment(String stuDepartment) {
		this.stuDepartment = stuDepartment;
	}
	@Override
	public String toString() {
		return "StudentDetail [stuId=" + stuId + ", stuName=" + stuName + ", stuAddress=" + stuAddress + ", stuAge="
				+ stuAge + ", stuGender=" + stuGender + ", stuDepartment=" + stuDepartment + "]";
	}
	
}
