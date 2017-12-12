package com.qhit.lh.grsb.wyl.t8.user.dao;

import java.util.List;

public interface UserDao {
		
		/**
		 * @param userName
		 * @param userPassword
		 * @return
		 * 登录业务的实现
		 * @throws Exception 
		 */
		public UserDao doLogin(String userName,String userPassword) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 获取所有用户对象
		 */
		public List<UserDao> getAllUser() throws Exception;
		/**
		 * @param user
		 * @return
		 * @throws Exception
		 * 添加用户
		 */
		public int addUser(UserDao user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 删除
		 */
		public int deleteUser(UserDao user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 准备更新
		 */
		public UserDao toUpdateUser(UserDao user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 更新业务
		 */
		public int updateUser(UserDao user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 根据名字业务
		 */s
		public List<UserDao> getUser(UserDao user) throws Exception;
}
