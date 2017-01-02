package com.gavin.study.test.pojoSerivce;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;

import com.gavin.study.ApplicationMain;
import com.gavin.study.service.UserService;

@SuppressWarnings("deprecation")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ApplicationMain.class)
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testCreateAUser() {
		userService.create("test1", 1);
		userService.create("test2", 2);
		userService.create("test3", 3);
		
		Assert.assertEquals(4, userService.getAllUsers().intValue());
	}
}
