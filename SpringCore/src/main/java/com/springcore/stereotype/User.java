package com.springcore.stereotype;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component("us")
@Scope("prototype") 
@Getter
@Setter
public class User {

	@Value("Zuhaib")
	private String name;
	@Value("Lucknow")
	private String address;
    @Value("#{prop}")
	private Properties props;
    
}
