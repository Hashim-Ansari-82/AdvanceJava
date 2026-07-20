package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entity.Person;

public interface PersonDao {

	public int insert(Person person);
	public int update(Person person);
	public int delete(int perId);
	public List<Person> fetch();
	public Person getPerson(int perId);
	
}
