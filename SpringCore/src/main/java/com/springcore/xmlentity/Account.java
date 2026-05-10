package com.springcore.xmlentity;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Account {

	private int accNo;
	private String accType;
	private String userName;
	private CheckBook checkBook;
}
