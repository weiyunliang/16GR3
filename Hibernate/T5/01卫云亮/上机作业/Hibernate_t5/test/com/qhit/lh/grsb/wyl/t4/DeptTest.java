package com.qhit.lh.grsb.wyl.t4;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qhit.lh.grsb.wyl.t4.bean.Dept;
import com.qhit.lh.grsb.wyl.t4.bean.Emp;
import com.qhit.lh.grsb.wyl.t4.service.BaseService;
import com.qhit.lh.grsb.wyl.t4.service.impl.BaseServiceImpl;

public class DeptTest {

	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add(){
		Dept dept = new Dept();
		dept.setDname("宣传部");

		Emp dwj = new Emp();
		dwj.setEname("卫云亮");

		dept.getEmps().add(dwj);
		baseService.add(dept);
	}
	
	@Test
	public void delete(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		baseService.delete(dept);
	}
	
	@Test
	public void update(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		dept.setDname("文化宣传馆");
		
		baseService.update(dept);
	}
	
	@Test
	public void query(){
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		for(Emp emp:dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
}
