/**
 * 
 */
package com.qhit.lh.g3.wyl.exam;

import org.hibernate.Transaction;
import org.junit.Test;

import com.qhit.lh.g3.wyl.exam.common.bean.User;
import com.qhit.lh.g3.wyl.exam.common.dao.BaseDao;
import com.qhit.lh.g3.wyl.exam.jsgl.bean.Teacher;

/**
 * @author admin
 */
public class TeacherTest extends BaseDao {
	
	@Test
	public void add(){
		Teacher teacher = new Teacher();
		teacher.setTname("刘倩");
		teacher.setSex("女");
		teacher.setPost("辅导员");
		
		User user = new User();
		user.setName("160301");
		user.setPwd("123456");
		user.setRole(2);
		
		teacher.setUser(user);
		
		Transaction ts = getSession().beginTransaction();
		getSession().save(teacher);
		ts.commit();
		
		
	}
}
