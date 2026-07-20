package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.ParrotDao;
import com.springjdbc.entity.Parrot;

public class GetSingleId {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your id you can change");
		int id = Integer.parseInt(br.readLine());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ParrotDao dao = context.getBean("parrot",ParrotDao.class);
		
		try {
	    Parrot parrot = dao.getParrot(id);
	    System.out.println(parrot);
		System.out.println("\nFetch Successfully....!");
		}
		catch(Exception e)
		{
		  System.out.println("Entry Not found ...!");
		}
	}
}
