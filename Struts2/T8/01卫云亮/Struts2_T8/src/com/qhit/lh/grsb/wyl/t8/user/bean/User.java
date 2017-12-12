package com.qhit.lh.grsb.wyl.t8.user.bean;

public class User {
	private int Id;
	private String userName;
	private String userPassword;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	
	public User(int id, String userName, String userPassword) {
		super();
		Id = id;
		this.userName = userName;
		this.userPassword = userPassword;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
