package com.qhit.lh.grsb.wyl.t8.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.qhit.lh.grsb.wyl.t8.dao.BaseDao;
import com.qhit.lh.grsb.wyl.t8.utils.HibernateSessionFactory;


public class BaseDaoImpl implements BaseDao {
	
private  Session session =HibernateSessionFactory.getSession();
private  Transaction tx=session.beginTransaction();

public void add(Object obj) {
	session.save(obj);
	tx.commit();
	HibernateSessionFactory.closeSession();
}

public void delete(Object obj) {
	session.delete(obj);
	tx.commit();
	HibernateSessionFactory.closeSession();
}

public void update(Object obj) {
	session.update(obj);
	tx.commit();
	HibernateSessionFactory.closeSession();
}

public List<Object> queryAll(String  tableName) {
	List<Object> list = new ArrayList<Object>();
	list = session.createQuery(tableName).list();
	tx.commit();
	HibernateSessionFactory.closeSession();
	return list;
}


public Object getObjectById(Class clazz, int id) {
	// TODO Auto-generated method stub
	Object obj = session.get(clazz, id);
	tx.commit();
	HibernateSessionFactory.closeSession();
	return obj;
}
}