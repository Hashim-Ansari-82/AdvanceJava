package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.JdbcConfig;
import com.springjdbc.dao.PersonDao;

public class PersonDelete {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your ID You Can Delete");
		int id = Integer.parseInt(br.readLine());
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		 
		PersonDao bean = context.getBean("person",PersonDao.class);
		int delete = bean.delete(id);
		if(delete > 0) {
			System.out.println("Deleted Successfully");
		}
		else
		{
			System.out.println("Deleted Failed");
		}
	}
}
