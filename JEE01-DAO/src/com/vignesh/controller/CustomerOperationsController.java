package com.vignesh.controller;

import java.sql.SQLException;

import com.vignesh.model.Customer;
import com.vignesh.service.CustomerServiceImpl;
import com.vignesh.service.ICustomerService;

public class CustomerOperationsController {
	ICustomerService customerService;
	
	public CustomerOperationsController() {
		customerService = new CustomerServiceImpl();
	}
	
	public String registerCustomer(Customer customer) throws SQLException {
		return customerService.registerCustomer(customer);
	}

}
