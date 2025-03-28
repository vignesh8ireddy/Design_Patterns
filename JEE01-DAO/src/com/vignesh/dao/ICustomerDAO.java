package com.vignesh.dao;

import java.sql.SQLException;

import com.vignesh.model.Customer;

public interface ICustomerDAO {
	
	public int insertCustomer(Customer customer) throws SQLException;

}
