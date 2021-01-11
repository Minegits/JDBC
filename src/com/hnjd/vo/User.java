package com.hnjd.vo;

public class User {

	private int userno ;
	private String username ;
	private String password ;
	private String telephone ;
	private String email ;
	
	
	public User() {
		super();
	}

	public User(String username, String password, String telephone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
	}


	public User(int userno, String username, String password, String telephone, String email) {
		super();
		this.userno = userno;
		this.username = username;
		this.password = password;
		this.telephone = telephone;
		this.email = email;
	}


	public int getUserno() {
		return userno;
	}


	public void setUserno(int userno) {
		this.userno = userno;
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


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "User [userno=" + userno + ", username=" + username + ", password=" + password + ", telephone="
				+ telephone + ", email=" + email + "]";
	}
	
	
	
}
