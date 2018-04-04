/**
 * 
 */
package com.qhit.lh.g3.wyl.exam.common.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g3.wyl.exam.common.utils.HibernateSessionFactory;

/**
 * @author admin
 */
public class BaseDao {

	public Session getSession(){
		return HibernateSessionFactory.getSession();
	}
}
