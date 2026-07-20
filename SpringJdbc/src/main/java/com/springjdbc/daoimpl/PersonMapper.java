package com.springjdbc.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springjdbc.entity.Person;

public class PersonMapper implements RowMapper<Person>{

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setPerId(rs.getInt(1));
		person.setPerName(rs.getString(2));
		person.setAge(rs.getInt(3));
		person.setAddress(rs.getString(4));
		person.setCountry(rs.getString(5));
		return person;
	}
}
