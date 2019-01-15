package com.shm.dao.impl;

import java.util.List;

import com.shm.dao.ICustomerDao;
import com.shm.domain.Customer;
import com.shm.utils.HibernateUtil;

/**
 * 客户的持久层实现类
 * @author SHM
 *
 */
public class CustomerDaoImpl implements ICustomerDao {

	@Override
	public List<Customer> findAllCustomer() {
		return HibernateUtil.getCurrentSession().createQuery("from Customer").list();
	}

	@Override
	public void saveCustomer(Customer customer) {
		HibernateUtil.getCurrentSession().save(customer);		
	}

	@Override
	public void deleteCustomer(Customer customer) {
//		Customer c = findCustomerById(customer.getCustId());
		HibernateUtil.getCurrentSession().delete(findCustomerById(customer.getCustId()));
	}

	@Override
	public Customer findCustomerById(Long custID) {
		
		return HibernateUtil.getCurrentSession().get(Customer.class, custID);
	}

}
