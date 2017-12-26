package com.qhit.lh.grsb.wyl.t6.dao;
import java.util.List;
public interface BaseDao {
	/**
	 * @param obj
	 * 增
	 */
	public void add(Object obj);
	
	/**
	 * @param obj
	 * 删
	 */
	public void delete(Object obj);
	
	/**
	 * @param obj
	 * 改
	 */
	public void update(Object obj);
	
	/**
	 * 查
	 */
	public List<Object> getAll(String fromObject);
	
	/**
	 * 根据id去查
	 */
	public Object getObjectById(Class clazz, int id);
}
