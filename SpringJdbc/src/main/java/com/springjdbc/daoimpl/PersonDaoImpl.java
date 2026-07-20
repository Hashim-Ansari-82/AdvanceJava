package com.springjdbc.daoimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springjdbc.dao.PersonDao;
import com.springjdbc.entity.Person;

import lombok.Data;

@Component("person")
@Data
public class PersonDaoImpl implements PersonDao{

	@Autowired
	private JdbcTemplate template;
	
	@Override
	public int insert(Person person) {
		String query="insert into person values(?,?,?,?,?)";
		int insert = this.template.update(query,person.getPerId(),person.getPerName(),person.getAge(),person.getAddress(),person.getCountry());
		return insert;
	}

	@Override
	public int update(Person person) {
		String query="update person set Country=?, Address=? where perId=?";
		int update = this.template.update(query,person.getCountry(),person.getAddress(),person.getPerId());
		return update;
	}

	@Override
	public int delete(int perId) {
		String query="delete from person where perId=?";
		int delete = template.update(query,perId);
		return delete;
	}

	@Override
	public List<Person> fetch() {
		String query="select * from person"; 
	  List<Person> list = template.query(query, new PersonMapper());
	  return list;
	}

	@Override
	public Person getPerson(int perId) {
		String query="select * from person where perId=?";
		Person person = template.queryForObject(query, new PersonMapper(), perId);
		return person;
	}

}
