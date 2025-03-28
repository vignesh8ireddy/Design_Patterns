package com.vignesh.service;

import java.sql.SQLException;

import com.vignesh.dao.ICustomerDAO;
import com.vignesh.factory.CustomerDAOFactory;
import com.vignesh.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	ICustomerDAO customerDAO;
	
	public CustomerServiceImpl() {
		customerDAO = CustomerDAOFactory.getInstance("JDBC");
	}

	@Override
	public String registerCustomer(Customer customer) throws SQLException {
		
		int res = customerDAO.insertCustomer(customer);
		if(res == 0) return "Customer Not Registered";
		else return "Customer Registered";

	}

}
