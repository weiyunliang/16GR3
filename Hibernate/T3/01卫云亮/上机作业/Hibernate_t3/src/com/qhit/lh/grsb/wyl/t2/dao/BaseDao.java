package com.qhit.lh.grsb.wyl.t2.dao;

import java.util.List;

public interface BaseDao {
	/**
	 * ��
	 * @param obj
	 */
	public void add(Object obj);
	/**
	 * ɾ
	 * @param obj
	 */
	public void delect(Object obj);
	/**
	 * ��
	 * @param obj
	 */
	public void update(Object obj);
	/**
	 * ��
	 * @param obj
	 */
	public List<Object> getAll(String fromObject);

}
