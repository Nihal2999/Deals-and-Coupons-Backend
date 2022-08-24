package com.cg.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="users")
public class Users {

	//Attributes
	@Id
	private String userName;
	private String passWord;
	//private String role;

	//Default Constructor
	public Users() {
		
	}
	
	//Parameterized Constructor
	public Users(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		//this.role = role;
	}

	//Setters and Getters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
//	public String getRole() {
//		return role;
//	}
//	public void setRole(String role) {
//		this.role = role;
//	}
	
}
