package com.gavin.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gavin.study.pojo.User;
import com.gavin.study.service.UserService;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello()
	{
		return "Hello World!";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String createAUser(@RequestBody User user)
	{
		userService.create(user.getName(), user.getAge());
		return "Hello World!";
	}
}
