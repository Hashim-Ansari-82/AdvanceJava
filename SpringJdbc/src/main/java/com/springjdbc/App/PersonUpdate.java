package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.JdbcConfig;
import com.springjdbc.dao.PersonDao;
import com.springjdbc.entity.Person;

public class PersonUpdate {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your ID");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Your Address");
		String address = br.readLine();
		System.out.println("Enter Your Country");
		String country = br.readLine();
      
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		PersonDao bean = context.getBean("person",PersonDao.class);
		Person person = new Person();
		person.setPerId(id);
		person.setAddress(address);
		person.setCountry(country);
		int update = bean.update(person);
		if(update > 0){
			System.out.println("Updated Successfully...!");
		}
		else
		{
			System.out.println("Updated Failed .....! ");
		}
		
	}
}
