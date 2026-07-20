package com.springjdbc.App;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springjdbc.dao.ParrotDao;
import com.springjdbc.entity.Parrot;

public class ParrotFetch {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		ParrotDao parrotDao = context.getBean("parrot",ParrotDao.class);
		List<Parrot> fetch = parrotDao.fetch();
		
		fetch.forEach(value ->{
			System.out.println(value);
		});
		
	}
}
 