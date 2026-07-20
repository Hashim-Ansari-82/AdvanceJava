package com.springcore.configentity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@NoArgsConstructor
public class Engine {

	@Value("Turbocharge Engine")
	private String engName;
	@Value("Branded Quality")
	private String quality;
	
}
