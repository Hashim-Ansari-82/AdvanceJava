package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.criteria.Join;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

	@Id
	@Column(name="Student_RollNO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNo;
	@Column(name="Student_Name")
	private String name;
	@Column(name="Student_Address")
	private String address;
	@Column(name="Student_Standard")
	private String standard;
	@ManyToOne
	@JoinColumn(name="College_ID")
	private College college;
}
