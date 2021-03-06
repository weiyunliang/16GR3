package com.qhit.lh.grsb.wyl.t8.user.service;

import java.util.List;

import com.qhit.lh.grsb.wyl.t8.user.bean.User;

public interface UserService {
		
		/**
		 * @param userName
		 * @param userPassword
		 * 登录业务
		 * @throws Exception
		 */
		public User doLogin(String userName,String userPassword) throws Exception;
		
		/**
		 * @return
		 * @throws Exception
		 * 获取所有用户对象
		 */
		public List<User> getAllUser() throws Exception;
		
		/**
		 * @param user
		 * @return
		 * @throws Exception
		 * 添加用户
		 */
		public int addUser(User user) throws Exception;
		/**
		 * @param user
		 * @return
		 * @throws Exception
		 * 删除
		 */
		public int deleteUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 准备更新业务
		 */
		public User toUpdateUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 更新业务
		 */
		public int updateUser(User user) throws Exception;
		/**
		 * @return
		 * @throws Exception
		 * 根据名字业务
		 */
		public List<User> getUser(User user) throws Exception;
		

}
