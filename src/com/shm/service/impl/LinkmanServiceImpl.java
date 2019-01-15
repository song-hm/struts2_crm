package com.shm.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.shm.dao.ILinkmanDao;
import com.shm.dao.impl.LinkmanDaoImpl;
import com.shm.domain.Linkman;
import com.shm.service.ILinkmanService;
import com.shm.utils.HibernateUtil;

/**
 * 联系人的业务层实现类
 * @author SHM
 *
 */
public class LinkmanServiceImpl implements ILinkmanService {

	private ILinkmanDao linkmanDao = new LinkmanDaoImpl();
	@Override
	public List<Linkman> listLinkman() {
		Session s = null;
		Transaction tx = null;
		try {
			//1.获取session
			s = HibernateUtil.getCurrentSession();
			//2.开启事务
			tx = s.beginTransaction();
			//3.执行操作
			List<Linkman> linkmans = linkmanDao.listLinkman();
			//4.提交事务、
			tx.commit();
			//5.返回结果
			return linkmans;
			}catch(Exception e) {
			//回滚事务
			tx.rollback();
			throw new RuntimeException(e);
		}
	}

}
