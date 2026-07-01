package com.hibernate.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String address;
	private String gender;
	private int age;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob  
	private byte[] img;
	
}
