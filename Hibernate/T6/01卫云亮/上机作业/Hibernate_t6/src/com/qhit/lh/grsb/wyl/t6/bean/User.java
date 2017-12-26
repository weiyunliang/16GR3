package com.qhit.lh.grsb.wyl.t6.bean;

import java.util.HashSet;
import java.util.Set;

public class User  implements java.io.Serializable  {
	private int userId;
	private String userName;
	private String password;
	
	private Emp emp;
	
	private Set<Role> roles = new HashSet<>();
	
	public Set<Role> getRoles() {
		return roles;
	}
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer userId, String userName, String password, Emp emp,
			Set<Role> roles) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.emp = emp;
		this.roles = roles;
	}
	
}
