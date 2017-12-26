package com.qhit.lh.grsb.wyl.t8.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * 增
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * 删
	 * @param obj
	 */
	public void delete(Object obj);
	/**
	 * 改
	 * @param obj
	 */
	public void update(Object obj);
	
	public Object getObjectById(Class clazz,int id);
	
	public List<Object> queryAll(String tableName);
}
