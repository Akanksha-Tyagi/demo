package com.ymsli.secondmachinetest.question3.model.service;
import java.util.Optional;

import com.ymsli.secondmachinetest.question3.model.dto.Customer;
import com.ymsli.secondmachinetest.question3.model.exceptions.DataAccessException;

public interface CustomerService {
	
	public void addCustomer(Customer customer);
	public Optional<Customer> getCustomerById(int id) throws DataAccessException;
}
