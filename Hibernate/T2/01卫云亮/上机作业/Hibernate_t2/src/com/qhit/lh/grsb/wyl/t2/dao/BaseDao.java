package com.qhit.lh.grsb.wyl.t2.dao;

import java.util.List;

/**
 * @author 卫云亮
 *TODO
 *2017年12月12日上午10:09:04
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
