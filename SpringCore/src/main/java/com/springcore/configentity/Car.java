package com.springcore.configentity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class Car {

	@Value("UP 58 HR 4432")
	private String number;
	@Value("Rolls Royce")
	private String name;
	@Value("12 Crore")
	private String price;
	@Autowired
	private Engine engine;

	public void car() {
		System.out.println("Car [number=" + number + ", name=" + name + "]");
		System.out.println("Car [price=" + price + ", engine=" + engine + "]");
	}
	
}
