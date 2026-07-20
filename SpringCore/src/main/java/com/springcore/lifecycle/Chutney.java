package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Chutney {
    
	  private int price;
	  private String test;
	  
	  @PostConstruct
	  public void start() {
		  System.out.println("This is Start Method");
	  }
	  @PreDestroy
	  public void end() {
		  System.out.println("This is End Method");
	  }
}
