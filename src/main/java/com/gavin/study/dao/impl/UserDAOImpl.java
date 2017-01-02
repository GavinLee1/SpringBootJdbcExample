package com.gavin.study.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gavin.study.dao.UserDAO;

public class UserDAOImpl implements UserDAO{

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		jdbcTemplate.update("insert into USER(NAME, AGE) values(?, ?)", name, age);
		System.out.println("------------------------------");
		System.out.println(name);
		System.out.println("------------------------------");
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getAllUsers() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject("select count(1) from USER", Integer.class);
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

}
