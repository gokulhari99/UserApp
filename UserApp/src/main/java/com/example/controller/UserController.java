package com.example.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.UserModel;
import com.example.service.UserService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {
	 
	@RequestMapping(value="/getUser/{username}",method=RequestMethod.GET)
	public UserModel getUsers(@PathVariable(value="username") String name)
	{
		var userService = new UserService();
		return userService.getUsers(name);
	}
	
}