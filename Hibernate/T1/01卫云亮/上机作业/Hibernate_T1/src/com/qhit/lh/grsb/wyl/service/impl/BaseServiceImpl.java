package com.qhit.lh.grsb.wyl.service.impl;

import java.util.List;

import com.qhit.lh.grsb.wyl.dao.BaseDao;
import com.qhit.lh.grsb.wyl.dao.impl.BaseDaoImpl;
import com.qhit.lh.grsb.wyl.service.BaseService;

public class BaseServiceImpl implements BaseService {
  private BaseDao basedao = new BaseDaoImpl();
	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		basedao.add(obj);
	}

	@Override
	public void del(Object obj) {
		// TODO Auto-generated method stub
		basedao.del(obj);
	}

	@Override
	public void upd(Object obj) {
		// TODO Auto-generated method stub
		basedao.upd(obj);
	}

	@Override
	public List<Object> getALl(String fromObject) {
		// TODO Auto-generated method stub
		 
		return basedao.getALl(fromObject);
	
	}

}
