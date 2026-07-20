package com.springjdbc.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springjdbc.JdbcConfig;
import com.springjdbc.dao.PersonDao;
import com.springjdbc.entity.Person;

public class PersonFetch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		PersonDao bean = context.getBean("person",PersonDao.class);
		List<Person> fetch = bean.fetch();
		fetch.forEach(value ->{
			System.out.println(value);
		});
	}
}
