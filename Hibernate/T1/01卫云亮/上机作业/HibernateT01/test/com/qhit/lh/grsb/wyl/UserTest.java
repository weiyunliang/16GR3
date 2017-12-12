package com.qhit.lh.grsb.wyl;

import com.qhit.lh.grsb.wyl.bean.User;
import com.qhit.lh.grsb.wyl.service.BaseService;
import com.qhit.lh.grsb.wyl.service.impl.BaseServiceImpl;



public class UserTest {
    private BaseService baseService = new BaseServiceImpl();
    
     public void addUser(){
    	 //声明并实例化对象
    	 User user = new User();
    	 user.setUname("wyl");
    	 user.setPwd("123456");
    	 user.setSex("m");
    	 //数据操作
    	 baseService.add(user);
    	 
     }
    
    
}
