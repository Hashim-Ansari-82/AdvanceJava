package com.form.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.form.entity.User;

@Repository
public class UserDao {

	@Autowired
	private JdbcTemplate template;
	
	public int  saveUser(User user) {
		
		String query="insert into user(fullName,email,password,image) values(?,?,?,?)";
		int i = template.update(query, user.getFullName(),user.getEmail(),user.getPassword(),user.getImage());
		return i;
	}
}
