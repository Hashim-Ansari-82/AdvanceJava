package com.hiber.onetomany;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Bank {

	@Id
	private Integer bank_Id;
	private String bank_Name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<User> user;
}
