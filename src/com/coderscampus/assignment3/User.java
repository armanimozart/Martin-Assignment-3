package com.coderscampus.assignment3;

public class User {
	private String username;
	private String password;
	private String name;
	
	public User(String username, String password, String name) {
		this.username = username;
		this.password = password;
		this.name = name;
	}
	public String getUsername() {
		return username;
	}	
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getName()=" + getName() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
