package com.springcore.standalon;

import java.util.List;
import java.util.Map;
import java.util.Properties;

import lombok.Data;

@Data
public class Friends {

	private List<String> friends;
	private Map<String,Integer> fees;
	private Properties props;
}
