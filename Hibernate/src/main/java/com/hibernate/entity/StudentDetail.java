package com.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Student_Detail")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
	
}