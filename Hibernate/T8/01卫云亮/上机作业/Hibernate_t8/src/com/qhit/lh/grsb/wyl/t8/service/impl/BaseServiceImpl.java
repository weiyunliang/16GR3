package com.qhit.lh.grsb.wyl.t8.service.impl;

import java.util.List;

import com.qhit.lh.grsb.wyl.t8.dao.BaseDao;
import com.qhit.lh.grsb.wyl.t8.dao.impl.BaseDaoImpl;

public class BaseServiceImpl {
	private BaseDao baseDao = new BaseDaoImpl();
	public void add(Object obj) {
		baseDao.add(obj);
	}

	public void delete(Object obj) {
		baseDao.delete(obj);
	}

	public void update(Object obj) {
		baseDao.update(obj);
	}

	public List<Object> queryAll(String tableName) {
		return baseDao.queryAll(tableName);
	}

	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
