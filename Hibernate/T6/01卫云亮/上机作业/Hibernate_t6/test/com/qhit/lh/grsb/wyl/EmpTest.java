package com.qhit.lh.grsb.wyl;

import java.util.List;

import org.junit.Test

import com.qhit.lh.grsb.wyl.t6.bean.Dept;
import com.qhit.lh.grsb.wyl.t6.bean.Emp;
import com.qhit.lh.grsb.wyl.t6.bean.User;
import com.qhit.lh.grsb.wyl.t6.service.BaseService;
import com.qhit.lh.grsb.wyl.t6.service.impl.BaseServiceImpl;

public class EmpTest {
	
	private BaseService baseService = new BaseServiceImpl();
	/**
	 * 添加员工，并分配一个账户
	 */
	@Test
	public void add() {
		//声明员工对象
		Emp emp = new Emp();
		emp.setEmpName("wyl");
		emp.setEmpSex("M");
		emp.setBirthday("2017-07-05");
		//分配一个账户
		User user = new User();
		user.setUserName("wyl");
		user.setPassword("123456");
		//建立一对一关系
		emp.setUser(user);//指定当前员工的账户
		user.setEmp(emp);//指定当前账户所属的员工
		//分配所属的部门
		Dept dept =	(Dept) baseService.getObjectById(Dept.class, 2);
		//建立多对一的关联
		emp.setDept(dept);
		//级联操作
		baseService.add(emp);

	}

	@Test
	public void delete() {
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 10);
		baseService.delete(emp);
	}

	@Test
	public void update() {
		//声明员工对象
		Emp emp = (Emp) baseService.getObjectById(Emp.class, 9);
		emp.setEmpName("tomdog");
		User user = emp.getUser();
		user.setUserName("tomdog");
		//建立一对一关系
		emp.setUser(user);//指定当前员工的账户
		user.setEmp(emp);//指定当前账户所属的员工
		//修改所属的部门：并不是修改部门本身的信息
		Dept dept =	(Dept) baseService.getObjectById(Dept.class, 2);
		//建立多对一关联
		emp.setDept(dept);
		//级联操作
		baseService.update(emp);
	}

	@Test
	public void query() {
		List<Object> list = baseService.getAll("from Emp");
		
		for (Object object : list) {
			Emp emp = (Emp) object;
			System.out.println(emp.toString());
		}
	}

}
