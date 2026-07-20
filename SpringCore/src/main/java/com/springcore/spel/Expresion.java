package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Expresion {

	@Value("#{543+754+356}")
	private int x;
	@Value("#{763-323}")
	private double y;
	@Value("#{43*2}")
	private long z;
	@Value("#{new java.lang.String('Hashim Ansari')}")
	private String name;
	@Value("#{5>3 && 18>6}")
	private boolean isActive;
	@Value("#{T(com.springcore.spel.Expresion).sum()}")
	private double sum;
	@Value("#{T(java.lang.Math).pow(5,2)}")
	private double pow;
	
	public static double sum() {
		return 54+64;
	}
}
