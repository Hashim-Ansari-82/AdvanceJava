package com.springjdbc.dao;

import java.util.List;

import com.springjdbc.entity.Parrot;

public interface ParrotDao {

	public int insert(Parrot parrot);
	public int update(Parrot parrot);
	public int delete(int id);
	public List<Parrot> fetch();
	public Parrot getParrot(int id);
}
