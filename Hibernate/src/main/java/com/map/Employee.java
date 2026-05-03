package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {

	@Id
	@Column(name="Employee_Id")
	private int eId;
	@Column(name="Employee_Name")
	private String name;
	@Column(name="Employee_Age")
	private int age;
	@ManyToMany
	@JoinTable(name="Combine")
	private List<Project> project;
	
}
