package com.vignesh.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vignesh.factory.ConnectionFactory;
import com.vignesh.model.Customer;

public class CustomerDAOImpl implements ICustomerDAO {
	private static final String INSERT_CUSTOMER_QUERY = "INSERT INTO DAO_CUSTOMER VALUES(CID_SEQ.NEXTVAL,?,?,?) ";
	

	@Override
	public int insertCustomer(Customer customer) throws SQLException {
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		int result = 0;

		try {
			connection = ConnectionFactory.getInstance();
			preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_QUERY);
			preparedStatement.setString(1, customer.getcName());
			preparedStatement.setString(2, customer.getcAddress());
			preparedStatement.setFloat(3, customer.getBillAmount());
			result = preparedStatement.executeUpdate();
		}
		finally {
			if(connection != null) {
				connection.close();
			}
			if(preparedStatement != null) preparedStatement.close();
		}
		
		return result;
	}

}
