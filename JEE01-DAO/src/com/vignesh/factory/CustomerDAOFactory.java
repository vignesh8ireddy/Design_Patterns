package com.vignesh.factory;

import com.vignesh.dao.CustomerDAOImpl;
import com.vignesh.dao.ICustomerDAO;

public class CustomerDAOFactory {
	
	public static ICustomerDAO getInstance(String daoType) {
		if(daoType.equalsIgnoreCase("jdbc")) return new CustomerDAOImpl();
		else throw new IllegalArgumentException("Invalid DAO Type");
	}

}
