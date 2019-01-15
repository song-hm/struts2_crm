package com.shm.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.shm.domain.Customer;
import com.shm.service.ICustomerService;
import com.shm.service.impl.CustomerServiceImpl;

/**
 * 测试客户的业务层和持久层
 * @author SHM
 *
 */
public class CustomerDaoTest {

	@Test
	public void testFindAllCustomer() {
		ICustomerService customerService = new CustomerServiceImpl();
		List<Customer> customers = customerService.findAllCustomer();
		for(Customer c :customers) {
			System.out.println(c);
		}
	}

}
