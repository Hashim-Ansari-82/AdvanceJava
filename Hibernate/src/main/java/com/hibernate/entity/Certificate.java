package com.hibernate.entity;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Embeddable
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Certificate {

	private int id;
	private String course;
	private String duration;
	
}
