package com.hiber.oneto1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Peon_Detail")
@Data
public class Peon {

	@Id
	@Column(name = "Peon_Id")
	private int id;
	@Column(name = "Peon_Name")
	private String name;
	@Column(name = "Peon_Salary")
	private double salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Address_Id")
    private Address address;
}
