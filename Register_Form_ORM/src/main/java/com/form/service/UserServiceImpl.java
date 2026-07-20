package com.form.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.form.dao.UserDao;
import com.form.entity.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public int saveUser(User user) {
		int i = userDao.save(user);
		return i;
	}
	
	

}
