package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
@NoArgsConstructor
public class Pepsi implements InitializingBean, DisposableBean {

	private int price;
	private String test;

	@Override
	public void destroy() throws Exception {
		System.out.println("Pepsi are empty so bottle throw the dustbin");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
      System.out.println("Start drinking pepsi");
	}

}
