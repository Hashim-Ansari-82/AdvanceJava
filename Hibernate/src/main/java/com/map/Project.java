package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
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
public class Project {

	@Id
	@Column(name="Project_Id")
	private int pId;
	@Column(name="Project_Name")
	private String name;
	@ManyToMany(mappedBy = "project")
	private List<Employee> emp;
}
