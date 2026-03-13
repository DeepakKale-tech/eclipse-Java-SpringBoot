package com.example.springboot_aop_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot_aop_demo.service.UserService;

@RestController
public class UserController {

	private final UserService userService;
	
	public UserController(UserService userService)
	{
		this.userService = userService;
	}
	
	@GetMapping("/userInfo")
	public String getUser()
	{
		return userService.getUserInfo();
	}
	
}
