package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Vehicle {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int SR_No;
	private String number;
	private String ownerName;
	private String wheeler;
	private String bikeName;
	private String color;
}
