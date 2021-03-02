package com.ymsli.secondmachinetest.question3.model.service;

import java.util.Optional;

import com.ymsli.secondmachinetest.question3.model.dao.CustomerDao;
import com.ymsli.secondmachinetest.question3.model.dao.CustomerDaoImpl;
import com.ymsli.secondmachinetest.question3.model.dto.Customer;
import com.ymsli.secondmachinetest.question3.model.exceptions.DataAccessException;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
	
	public CustomerServiceImpl() {
		customerDao=new CustomerDaoImpl();
	}

	
	public CustomerDao getCustomerDao() {
		return customerDao;
	}
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerDao.addCustomer(customer);
	}

	@Override
	public Optional<Customer> getCustomerById(int id) throws DataAccessException{
		return customerDao.getCustomerById(id);
	}

}
