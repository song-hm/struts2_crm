package com.shm.dao;

import java.util.List;

import com.shm.domain.Customer;

/**
 * 客户的持久层接口
 * @author SHM
 *
 */
public interface ICustomerDao {

	/**
	 * 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();

	/**
	 *  添加客户
	 * @param customer
	 */
	void saveCustomer(Customer customer);

	/**
	 * 	删除客户
	 * @param customer
	 */
	void deleteCustomer(Customer customer);

	/**
	 * 	根据ID查询客户
	 * @param custID
	 * @return
	 */
	Customer findCustomerById(Long custID);
	
}
