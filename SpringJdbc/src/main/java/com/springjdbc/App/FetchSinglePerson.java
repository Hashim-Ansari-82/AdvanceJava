package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.JdbcConfig;
import com.springjdbc.dao.PersonDao;
import com.springjdbc.entity.Person;

public class FetchSinglePerson {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NumberFormatException, IOException {
		
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   System.out.println("Enter Your id");
   int id = Integer.parseInt(br.readLine());
		
    ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    PersonDao bean = context.getBean("person",PersonDao.class);
    Person person = bean.getPerson(id);
    System.out.println(person);
	}
}
