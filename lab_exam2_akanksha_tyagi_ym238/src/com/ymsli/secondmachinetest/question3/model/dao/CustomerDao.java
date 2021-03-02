package com.ymsli.secondmachinetest.question3.model.dao;
import java.util.Optional;

import com.ymsli.secondmachinetest.question3.model.dto.Customer;
import com.ymsli.secondmachinetest.question3.model.exceptions.DataAccessException;


public interface CustomerDao {
	public void addCustomer(Customer customer);;
	public Optional<Customer> getCustomerById(int id)throws DataAccessException;
}
