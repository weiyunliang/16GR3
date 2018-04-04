/**
 * 
 */
package com.qhit.lh.g3.wyl.exam;

import org.junit.Test;

import com.qhit.lh.g3.wyl.exam.common.action.UserAction;
import com.qhit.lh.g3.wyl.exam.common.bean.User;

/**
 * @author admin
 */
public class UserTest {

	@Test
	public void login(){
		UserAction userAction = new UserAction();
		
		User user = new User();
		user.setName("admin");
		user.setPwd("123456");
		user.setRole(4);
		
		userAction.setUser(user);
		
		System.out.println(userAction.login());;
		
	}
}
