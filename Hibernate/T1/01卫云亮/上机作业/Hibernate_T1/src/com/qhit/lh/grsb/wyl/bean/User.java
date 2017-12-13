package com.qhit.lh.grsb.wyl.bean;

public class User {
  private int id;
  private String uname;
  private String pwd;
  private String sex;
  
  
  
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String uname, String pwd, String sex) {
	super();
	this.id = id;
	this.uname = uname;
	this.pwd = pwd;
	this.sex = sex;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
  
}
