package com.embadable;

import jakarta.persistence.*;
@Entity
@Table(name="Student_Detail")
public class Student {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private int studentId;
	private int studentAge;
	private String studentName;
	private String studentAddress;
	@Embedded
	private Certificate certi;
	
	public Student(int serialNo, int studentId, int studentAge, String studentName, String studentAddress,
			Certificate certi) {
		super();
		this.serialNo = serialNo;
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.certi = certi;
	}
	public Student() {
		super();
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public Certificate getCerti() {
		return certi;
	}
	public void setCerti(Certificate certi) {
		this.certi = certi;
	}
	
}
