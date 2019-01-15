package com.shm.service;

import java.util.List;

import com.shm.domain.Customer;

/**
 * 客户的业务层接口
 * @author SHM
 *
 */
public interface ICustomerService {

	/**
	 * 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();

	/**
	 * 添加客户
	 * @param customer
	 */
	void saveCustomer(Customer customer);

	/**
	 * 	删除客户
	 * @param customer
	 */
	void deleteCustomer(Customer customer);
}
