package org.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


public class User {
	private String name,email, username,password;
	

	public User() {
	}

	public User(String name, String email, String username, String password) {
		this.name = name;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}

		
}
