package com.qhit.lh.grsb.wyl.t8.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.qhit.lh.grsb.wyl.t8.user.bean.User;
import com.qhit.lh.grsb.wyl.t8.user.dao.UserDao;
import com.qhit.lh.grsb.wyl.t8.utils.DBManager;

public class UserDaoImpl  implements UserDao {
	private Connection con = null;
	private PreparedStatement ps = null;
	
	@Override
	public User doLogin(String userName, String userPassword) throws Exception {
		con = DBManager.getConnection();
		User user = null;
		ResultSet rs = null;
		String sql = "select * from tb_user where userName = ? and userPassword = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, userName);
		ps.setString(2, userPassword);
		rs = ps.executeQuery();
		if(rs.next()) {
			user = new User(
					rs.getInt("userId"),
					userName,
					userPassword);
		}
		DBManager.close(con, ps);
		return user;
	}
	
	
	@Override
	public List<User> getAllUser() throws Exception {
			con = DBManager.getConnection();
			List<User> users = new ArrayList<>();
			User user = null;
			ResultSet rs = null;
			String sql = "select * from tb_user";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				user = new User(
						rs.getInt("userId"),
						rs.getString("userName"), 
						rs.getString("userPassword") 
						);
				users.add(user);
			}
			DBManager.close(con, ps);
			return users;
		}
	@Override
	
	
	public int addUser(User user) throws Exception {
			con = DBManager.getConnection();
			int row = 0;
			String sql = "insert into tb_user values (?,?,?,?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getUserPassword());
			row =  ps.executeUpdate();
			DBManager.close(con, ps);
			return row;
	}
	@Override
	public int deleteUser(User user) throws Exception {
		con = DBManager.getConnection();
		String sql = "delete from tb_user where userId = ?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, user.getUserId());
		int row = ps.executeUpdate();
		DBManager.close(con, ps);
		return row;
	}
	@Override
	public User toUpdateUser(User user) throws Exception {
			con = DBManager.getConnection();
			String sql = "select * from tb_user where userId = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, user.getUserId());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				user = new User(
						rs.getInt("userId"),
						rs.getString("userName"), 
						rs.getString("userPassword")
						);
			}
			DBManager.close(con, ps);
			return user;
	}
	@Override
	public int updateUser(User user) throws Exception {
		con = DBManager.getConnection();
		int row = 0;
		String sql = "update tb_user set userName = ?, userPassword = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, user.getUserName());
		ps.setString(2, user.getUserPassword());
		row =  ps.executeUpdate();
		DBManager.close(con, ps);
		return row;	
	}
	
	@Override
	public List<User> getUser(User user) throws Exception {
			con = DBManager.getConnection();
			List<User> users = new ArrayList<>();
			String sql = "select * from tb_user where userName = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, user.getUserName());
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				user = new User(
						rs.getInt("userId"),
						rs.getString("userName"), 
						rs.getString("userPassword") 
						);
				users.add(user);
			}
			DBManager.close(con, ps);
			return users;
}
}