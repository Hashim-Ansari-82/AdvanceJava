package com.hibernate.demo;

import java.util.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Cacheable
public class Student {

	@Id
	@Column(name = "Student_RollNo")
	private int rollNo;
	@Column(name = "Student_Id")
	private int id;
	@Column(name = "Student_Name")
	private String name;
	@Column(name = "Student_Address")
	private String address;
	@Column(name = "Student_City")
	private String city;
	@Column(name = "Student_Class")
	private String standard;
	@Temporal(TemporalType.DATE)
	private Date date;

	
}
