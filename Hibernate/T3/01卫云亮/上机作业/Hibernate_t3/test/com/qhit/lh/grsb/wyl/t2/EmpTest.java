package com.qhit.lh.grsb.wyl.t2;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.grsb.wyl.t2.bean.Emp;
import com.qhit.lh.grsb.wyl.t2.bean.User;
import com.qhit.lh.grsb.wyl.t2.servcie.UserService;
import com.qhit.lh.grsb.wyl.t2.servcie.impl.UserServiceImpl;

public class EmpTest {
	private UserService userService = new UserServiceImpl();

	@Test
	public void add() {
		//声明员工对象
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("f");
		emp.setDeptid(1);
		//分配一个账户
		User user = new User();
		user.setUserName("tom");
		user.setPassword("123456");
		//建立一对一关系
		emp.setUser(user);
		user.setEmp(emp);
		//级联操作
		userService.add(emp);
	}
	
	@Test
	public void delect(){
		Emp emp = new Emp();
		emp.setEid(1002);
		userService.delect(emp);
	}
	@Test
	public void update(){
		//声明员工对象
		Emp emp = new Emp();
		emp.setEid(1001);
		emp.setEmpName("tpm");
		emp.setEmpSex("锟斤拷");
		emp.setDeptid(1);
		//分配一个账户
		User user = new User();
		user.setUserId(7);
		user.setUserName("tomcat");
		user.setPassword("123456");
		//建立一对一关系
		emp.setUser(user);//指定当前员工的账户
		user.setEmp(emp);//指定当前账户所属的员工
		
		userService.update(emp);
		
	}
	@Test
	public void query(){
		List<Object> List = userService.getAll("from Emp");
		for (Object object : List) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}
	
	

}
