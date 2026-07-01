package com.hiber.oneto1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Address {

	@Id
	@Column(name = "Address_Id")
	private int id;
	@Enumerated(EnumType.STRING)
	private Peon_Address Address;
	@OneToOne
	@JoinColumn(name = "Peon_Id")
	private Peon peon;
}
