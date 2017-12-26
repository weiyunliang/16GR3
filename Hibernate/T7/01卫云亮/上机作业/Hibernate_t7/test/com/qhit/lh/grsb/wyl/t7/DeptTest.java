package com.qhit.lh.grsb.wyl.t7;
import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.grsb.wyl.t7.bean.Dept;
import com.qhit.lh.grsb.wyl.t7.bean.User;
import com.qhit.lh.grsb.wyl.t7.service.BaseService;
import com.qhit.lh.grsb.wyl.t7.service.impl.BaseServiceImpl;


public class DeptTest {
	private BaseService baseser = new BaseServiceImpl();
	@Test
	public void delete() {
		Dept dept = new Dept();
		dept	= (Dept) baseser.getObjectById(dept, 2);
		baseser.delete(dept);
	}
	@Test
	public void deleteuser(){
		User user = new User();
		user = (User) baseser.getObjectById(user,1010);
		baseser.delete(user);
	}

}