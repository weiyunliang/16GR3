package com.qhit.lh.grsb.wyl.t2.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.grsb.wyl.t2.dao.BaseDao;
import com.qhit.lh.grsb.wyl.t2.utils.HibernateSessionFactory;

public class BaseDaoImpl implements BaseDao {

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������
		Transaction ts = session.beginTransaction();
		//ִ��
		session.save(obj);
		//�ύ����
		ts.commit();
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();
	}

	@Override
	public void delect(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
				Session session = HibernateSessionFactory.getSession();
				//��������
				Transaction ts = session.beginTransaction();
				//ִ��
				session.delete(obj);
				//�ύ����
				ts.commit();
				//�ͷ���Դ
				HibernateSessionFactory.closeSession();
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//��������
		Transaction ts = session.beginTransaction();
		//ִ��
		session.update(obj);
		//�ύ����
		ts.commit();
		//�ͷ���Դ
		HibernateSessionFactory.closeSession();
	}

	@Override
	public List<Object> getAll(String fromObject) {
		//��ȡsession����
				Session session = HibernateSessionFactory.getSession();
				//��������
				Transaction ts = session.beginTransaction();
				//ִ��
				Query query = session.createQuery(fromObject);
				List<Object> list = query.list();
				//�ύ����
				ts.commit();
				//�ͷ���Դ
				HibernateSessionFactory.closeSession();
		return list;
	}

}
