/**
 * 
 */
package com.qhit.lh.grsb.wyl.t7;

import java.util.List;

import org.junit.Test;

import com.qhit.lh.grsb.wyl.t7.bean.User;
import com.qhit.lh.grsb.wyl.t7.service.BaseService;
import com.qhit.lh.grsb.wyl.t7.service.impl.BaseServiceImpl;

public class HqlTest {   
	
	private BaseService baseser = new BaseServiceImpl();
	@Test    
	public void hql(){
		List<User> list =  baseser.getEmpByName( "from User" );
			for (Object object : list) {
			User user = (User) object;
			System.out.println(user.toString());
	}

	}
}
