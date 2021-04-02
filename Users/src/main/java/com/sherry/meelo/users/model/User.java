package com.sherry.meelo.users.model;

import org.springframework.data.annotation.Id;


public class User {
	  @Id
	  private String userName;

	  private String name, password, address, token;

	  public User() {}

	public User(String userName,String password, String name,  String address) {
		super();
		this.userName = userName;
		this.name = name;
		this.password = password;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", name=" + name + ", password=" + password + ", address=" + address
				+ ", token=" + token + "]";
	}

}