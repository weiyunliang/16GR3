package com.qhit.zdgl.user.bean;
/**
 * 用户实体类
 * @author 
 *
 */
public class User {
	private int userId;
	private String userName;
	private String userPassword;
	private String userSex;
	private int userAge;
	private String telephone;
	private String address;
	private String pic;
	private int type;
	public User(int userId, String userName, String userPassword,
			String userSex, int userAge, String telephone, String address,
			String pic, int type) {
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.telephone = telephone;
		this.address = address;
		this.pic = pic;
		this.type = type;
	}
	public User() {
	}
	public User(String userName, String userPassword, String userSex,
			int userAge, String telephone, String address, String pic, int type) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.telephone = telephone;
		this.address = address;
		this.pic = pic;
		this.type = type;
	}
	public User(String userName, String userPassword, String userSex,
			int userAge, String telephone, String address, int type) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userSex = userSex;
		this.userAge = userAge;
		this.telephone = telephone;
		this.address = address;
		this.type = type;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userPassword=" + userPassword + ", userSex=" + userSex
				+ ", userAge=" + userAge + ", telephone=" + telephone
				+ ", address=" + address + ", pic=" + pic + ", type=" + type
				+ "]";
	}
	
}
