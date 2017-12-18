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
		//����Ա������
		Emp emp = new Emp();
		emp.setEmpName("tom");
		emp.setEmpSex("f");
		emp.setDeptid(1);
		//����һ���˻�
		User user = new User();
		user.setUserName("tom");
		user.setPassword("123456");
		//����һ��һ��ϵ
		emp.setUser(user);
		user.setEmp(emp);
		//��������
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
		//����Ա������
		Emp emp = new Emp();
		emp.setEid(1001);
		emp.setEmpName("tpm");
		emp.setEmpSex("��");
		emp.setDeptid(1);
		//����һ���˻�
		User user = new User();
		user.setUserId(7);
		user.setUserName("tomcat");
		user.setPassword("123456");
		//����һ��һ��ϵ
		emp.setUser(user);//ָ����ǰԱ�����˻�
		user.setEmp(emp);//ָ����ǰ�˻�������Ա��
		
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
