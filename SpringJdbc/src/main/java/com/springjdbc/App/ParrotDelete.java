package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.daoimpl.ParrotDaoImpl;

public class ParrotDelete {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter id You Can delete");
		int id = Integer.parseInt(br.readLine());
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ParrotDaoImpl bean = context.getBean("parrot",ParrotDaoImpl.class);
		int delete = bean.delete(id);
		if(delete>0){
			System.out.println("Delete successfully...!");
		}	
		else {
			System.out.println("Deleted failed....!");
		}
    }
}
