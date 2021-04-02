package com.sherry.meelo.users.model;

import org.springframework.data.annotation.Id;


public class User {
	  @Id
	  public String userName;

	  public String name, password, address;

	  public User() {}

	public User(String userName,String password, String name,  String address) {
		super();
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", name=" + name + ", password=" + password + ", address=" + address
				+ "]";
	}
	
	
}