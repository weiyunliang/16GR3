package com.qhit.lh.grsb.wyl.dao;

import java.util.List;

/**
 * @authorw 卫云亮
 *TODO
 *2017年12月11日上午10:09:04
 */
public interface BaseDao {
	/**
	 * @param Obj 
	 * 增
	 * */
  public void add(Object obj);
  /**
	 * @param Obj 
	 * 删
	 * */
  public void del(Object obj);
  /**
	 * @param Obj 
	 * 改
	 * */
  public void upd(Object obj);
 
  /**
	 * @param Obj 
	 * 查
	 * */
  public List<Object> getALl(String fromObject);
  
}
