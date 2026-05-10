package com.springcore.xmlentity;

import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Animal {

	private String  name;
	private int foot;
	private String color; 
	private List<String> list;
	private Set<Integer> set;
	private Properties  props;
	private Map<Integer,String> map;
	
}

