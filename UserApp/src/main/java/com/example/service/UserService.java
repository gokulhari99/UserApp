package com.example.service;

import org.springframework.stereotype.Component;

import com.example.model.UserModel;

@Component
public class UserService {

	public UserModel getUsers(String name) {
		
		var userModel=new UserModel();
		System.out.println("name -->"+name);
		switch(name) {
		case "gokul@gmail.com":
			userModel.setName("Gokul Chakkarvarthi");
			userModel.setPhoneNumber("9842862783");
			userModel.setCollege("Sri krishna ");
			break;
		case "sushman@gmail.com":
			userModel.setName("Sushman");
			userModel.setPhoneNumber("9842231783");
			userModel.setCollege("VIT");
			break;
		case "mozhi@gmail.com":
			userModel.setName("Mozhi");
			userModel.setPhoneNumber("9842221783");
			userModel.setCollege("IIT");
			break;
		case "festus@gmail.com":
			userModel.setName("Festus");
			userModel.setPhoneNumber("9842222783");
			userModel.setCollege("IIM");
			break;	
			
		default :
			userModel.setName("Sam");
			userModel.setPhoneNumber("9842222283");
			userModel.setCollege("IIT");
	
		}
		System.out.println("user model -->"+userModel);
		return userModel;
		
	}
	
	
}
