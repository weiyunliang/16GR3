/**
 * 
 */
package com.qhit.lh.grsb.wyl.t2;

import static org.junit.Assert.*;

import java.util.List;

import com.qhit.lh.grsb.wyl.t2.bean.Emp;
import com.qhit.lh.grsb.wyl.t2.bean.User;
import com.qhit.lh.grsb.wyl.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.grsb.wyl.t2.service.BaseService;
import com.qhit.lh.grsb.wyl.t2.service.impl.BaseServiceImpl;

/**
 * @author Administrator
 *TODO
2017-12-12下午8:22:00

 */
public class Test {

	@org.junit.Test
    public void add(){
		BaseService baseService = new BaseServiceImpl();
			
			
		//声明员工对象
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("M");
		emp.setBirthday("2017-12-12");
		emp.setDeptId(1);
		//分配账户
		User user = new  User();
		user.setUserName("tom");
		user.setPassword("123456");
		//建立一对一关系
		emp.setUser(user);
		user.setEmp(emp);
		//级联操作
		baseService.add(emp);
		
		
	 }
}
