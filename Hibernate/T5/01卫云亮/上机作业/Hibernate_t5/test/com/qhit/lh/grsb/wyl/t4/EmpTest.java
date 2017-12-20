package com.qhit.lh.grsb.wyl.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.grsb.wyl.t4.bean.Dept;
import com.qhit.lh.grsb.wyl.t4.bean.Emp;
import com.qhit.lh.grsb.wyl.t4.bean.User;
import com.qhit.lh.grsb.wyl.t4.service.BaseService;
import com.qhit.lh.grsb.wyl.t4.service.impl.BaseServiceImpl;

public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		Emp emp = new Emp();
		emp.setEname("卫云亮");
		User user = new User();
		user.setUname("admin");
		user.setUpwd("123456");
		//部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		baseService.add(emp);
		
	}
}
