package com.test;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.*;

@Entity

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
 
public class Student {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serialNo;
	private int studentId;
	private int studentAge;
	private String studentName;
	private String studentAddress;
	
	public Student(int serialNo, int studentId, int studentAge, String studentName, String studentAddress) {
		super();
		this.serialNo = serialNo;
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public Student() {
		super();
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
	@Override
	public String toString() {
		return "Student [serialNo=" + serialNo + ", studentId=" + studentId + ", studentAge=" + studentAge
				+ ", studentName=" + studentName + ", studentAddress=" + studentAddress + "]";
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	 
}
