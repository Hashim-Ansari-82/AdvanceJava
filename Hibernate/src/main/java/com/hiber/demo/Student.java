package com.hiber.demo;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_Detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student{ 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Roll_No")
	private int rollNo;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_Address")
	private String address;
	@Lob
	private byte[] image;
	@Enumerated(EnumType.STRING)
	private StudentCity city;
	@Temporal(TemporalType.DATE)
	@Column(name = "Admission_Date")
	private Date addDate;

}
