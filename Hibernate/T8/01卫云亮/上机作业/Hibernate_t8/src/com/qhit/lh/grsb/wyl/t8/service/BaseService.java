package com.qhit.lh.grsb.wyl.t8.service;

import java.util.List;

public interface BaseService {
	/*
	 * 
	 * 增
	 * */
	public void add(Object obj);
	/*
	 * 
	 * 删
	 * */
	public void delete(Object obj);
	/*
	 * 
	 * 改
	 * */
	public void update(Object obj);
	
	public Object getObjectById(Class clazz,int id);
	
	public List<Object> queryAll(String tableName);
}
