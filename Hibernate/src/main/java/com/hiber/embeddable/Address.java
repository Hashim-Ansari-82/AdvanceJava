package com.hiber.embeddable;

import com.hiber.demo.StudentCity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Data;

@Embeddable
@Data
public class Address {

	@Column(name ="Student_City")
	@Enumerated(EnumType.STRING)
	private StudentCity city;
	@Column(name="Room_No")
	private int roomNo;
	
}
