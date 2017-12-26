package com.qhit.lh.grsb.wyl.t8;
import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.junit.Test;




import com.qhit.lh.grsb.wyl.t8.bean.Dept;
import com.qhit.lh.grsb.wyl.t8.bean.Emp;
import com.qhit.lh.grsb.wyl.t8.bean.Userinfo;
import com.qhit.lh.grsb.wyl.t8.service.BaseService;
import com.qhit.lh.grsb.wyl.t8.service.impl.BaseServiceImpl;
import com.qhit.lh.grsb.wyl.t8.utils.HibernateSessionFactory;




public class DeptTest {
	private BaseService baseService = (BaseService) new BaseServiceImpl();
	@Test
	public void add() {
		//添加部门
		Dept dept = new Dept();
		dept.setDname("教育部");
		dept.setDaddress("图书馆");
		//调员工去新部门
		Emp emp1 = (Emp) baseService.getObjectById(Emp.class, 1);
		dept.getEmps().add(emp1);
		//添加新员工到新部门
		Emp emp2 = new Emp();
		emp2.setEname("卫云亮");
		emp2.setSex("男");
		emp2.setBirth("1997-07-05");
		//为新员工分配账户
		Userinfo userinfo = new Userinfo();
		userinfo.setUname("weiyunliang");
		userinfo.setUpswd("123456789");
		//添加关联
		emp2.setUserinfo(userinfo);
		userinfo.setEmp(emp2);
		
		emp1.setDept(dept);
		emp2.setDept(dept);
		
		dept.getEmps().add(emp2);
		
		baseService.add(dept);
	}
	@Test
	public void delete() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		
		baseService.delete(dept);
	}
	@Test
	public void update() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 1);
		
		dept.setDaddress("中南海");
		baseService.update(dept);
	}
	@Test
	public void query() {
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 2);
		for(Emp emp : dept.getEmps()){
			System.out.println(dept.getDname()+":"+emp.getEname());
		}
	}
  @Test
     public void getEmpLikeName(){
	  //1.获取Session对象
	  Session session = HibernateSessionFactory.getSession();
	  //2.通过session 对象创建criteria条件查询器
	  Criteria criteria = session.createCriteria(Emp.class)
	                           .add(Restrictions.like("ename", "张%"));
	  //3.通过Criteria条件查询器查询
	  List<Emp> list = criteria.list();
	  //4.遍历输出
	  for (Emp emp : list) {
		  System.out.println(emp.getEid()+""+emp.getEname());
	}
  } 
	
	@Test
	
	public void getDeptCount(){
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//2.通过session 对象创建criteria条件查询器
		  Criteria criteria  = session.createCriteria(Dept.class)
				  .setFetchMode("emp", FetchMode.JOIN)
				  .createAlias("emp", "e");
		  //设置分组条件和查询结果
		  ProjectionList projectionList  = Projections.projectionList()
				  .add(Projections.groupProperty("deptid"))
				  .add(Projections.groupProperty("dname"))
				  .add(Projections.groupProperty("daddress"))
				  .add(Projections.count("e.eid"));
		  //3.通过criteria 条件查询器查询
		  List<Object []> list = criteria.list();
		  
		  //4.遍历输出
		  for (Object[] objects : list) {
			System.out.println(objects);
		}
	}

}
