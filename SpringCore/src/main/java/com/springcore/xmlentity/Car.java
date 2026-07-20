package com.springcore.xmlentity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {

	private String number;
	private String name;
	private String price;
	private Engine engine;
}
