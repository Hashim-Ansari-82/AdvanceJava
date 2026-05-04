package com.map;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class College {

	@Id
	@Column(name="School_Id")
	private int id;
	@Column(name="School_Name")
	private String name; 
	@Column(name="School_Address")
	private String address;
	@OneToMany(mappedBy = "college",cascade = CascadeType.ALL)
	private List<Student> student;
}
