package com.springcore.lifecycle;

import lombok.Data;

@Data
public class Samosa {

	private int price;
	private String test;

	public void init() {
		System.out.println("Inside init method");
	}
	public void destroy() {
		System.out.println("Inside Destroy Method");
	}
}
