package com.springmvc.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler {
 
	@ExceptionHandler(NullPointerException.class)
	public String nullException() {
		return "error";
	}
	@ExceptionHandler(NumberFormatException.class)
	public String numberException() {
		return "error";
	} 
	@ExceptionHandler(Exception.class)
	public String allException() {
		return "error";
	} 
}
