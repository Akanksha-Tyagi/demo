package com.ymsli.secondmachinetest.question3.controller;

import java.sql.Date;
import java.util.Optional;

import com.ymsli.secondmachinetest.question3.model.dto.Customer;
import com.ymsli.secondmachinetest.question3.model.service.CustomerService;
import com.ymsli.secondmachinetest.question3.model.service.CustomerServiceImpl;

public class CustomerController {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();

		Customer customer = new Customer("akanksha tyagi", "muradnagar", "8650710164", new Date(201, 02, 13));
		customerService.addCustomer(customer);
//		Customer customer=new Customer("deepshikha", "chaudhary", "9012625496", new Date(1999,06,25));	
//		customerService.addCustomer(customer);

		/*
		 * //Optional<Customer> customerOptional = customerService.getCustomerById(4);
		 * try { String customerName = customerOptional.map(emp ->
		 * emp.getName()).orElse("name not found"); System.out.println(customerName); }
		 * catch (Exception e) { System.out.println(e.getMessage()); }
		 */
	}
}
