package com.form.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {

	private String fullName;
	private String email;
	private Integer password;
	private String check;
	private String image;
}
