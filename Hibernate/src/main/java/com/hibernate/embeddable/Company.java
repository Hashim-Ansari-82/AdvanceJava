package com.hibernate.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

	@Id
	@Column(name = "Company_Id")
	private int compId;
	@Column(name = "Owner_Name")
	private String ownerName;
	@Column(name = "Company_Address")
	private String address;
	private Employee employee;
}
