package com.gavin.study.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gavin.study.dao.UserDAO;
import com.gavin.study.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public void create(String name, Integer age) {
		// TODO Auto-generated method stub
		userDAO.create(name, age);
	}

	@Override
	public void deleteByName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getAllUsers() {
		// TODO Auto-generated method stub
		return userDAO.getAllUsers();
	}

	@Override
	public void deleteAllUsers() {
		// TODO Auto-generated method stub
		
	}

}
