package com.hiber.onetomany;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	private Integer accNo;
	private String userName;
	private String address;
	private Integer age;
	
}
