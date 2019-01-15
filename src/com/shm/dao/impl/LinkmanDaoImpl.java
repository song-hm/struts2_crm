package com.shm.dao.impl;

import java.util.List;

import com.shm.dao.ILinkmanDao;
import com.shm.domain.Linkman;
import com.shm.utils.HibernateUtil;

/**
 * 联系人的持久层实现类
 * @author SHM
 *
 */
public class LinkmanDaoImpl implements ILinkmanDao {

	@Override
	public List<Linkman> listLinkman() {
		
		return HibernateUtil.getCurrentSession().createQuery("from Linkman").list();
	}

}
