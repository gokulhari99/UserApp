package com.example.model;

public class UserModel {

	
	   String Name;
	   String PhoneNumber;
	   String College;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getCollege() {
		return College;
	}
	public void setCollege(String college) {
		College = college;
	}
	@Override
	public String toString() {
		return "UserModel [Name=" + Name + ", PhoneNumber=" + PhoneNumber + ", College=" + College + "]";
	}
	
	
	   
	  
}
