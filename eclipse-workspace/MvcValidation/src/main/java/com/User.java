package com;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {

	private String username;
	@Size(min = 1, message = "Password is required")
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "password length must be 5")
	private String password;
	@Min(value = 10, message = "must be equal or greater than 10")
	@Max(value = 25, message = "must be equal or less than 25")
	private int userid;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

}
