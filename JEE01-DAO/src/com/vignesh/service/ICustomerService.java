package com.vignesh.service;

import java.sql.SQLException;

import com.vignesh.model.Customer;

public interface ICustomerService {
	
	public String registerCustomer(Customer customer)  throws SQLException;

}
