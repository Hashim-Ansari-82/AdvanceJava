package com.hibernate.manytomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Project {

	private int proNo;
	@Id
	private String proName;
	private double cost;
	@ManyToMany(mappedBy = "project",cascade = CascadeType.ALL)
	private List<Employee> employee;
}
