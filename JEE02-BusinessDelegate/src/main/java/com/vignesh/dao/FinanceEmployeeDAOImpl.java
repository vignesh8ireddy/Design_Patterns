package com.vignesh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vignesh.bo.FinanceEmployeeBO;

public class FinanceEmployeeDAOImpl implements IFinanceEmployeeDAO {
	
	private static final String INSERT_QUERY = "INSERT INTO FINANCE_EMPLOYEE VALUES(CID_SEQ.CURRVAL,?,?,?,?)";

	@Override
	public boolean insertEmployee(Connection con, FinanceEmployeeBO employeeBO) throws SQLException {
		PreparedStatement preparedStatement = null;
		int result = 0;
		try {
			preparedStatement = con.prepareStatement(INSERT_QUERY);
			preparedStatement.setString(1, employeeBO.getName());
			preparedStatement.setString(2, employeeBO.getAddress());
			preparedStatement.setString(3, employeeBO.getDesignation());
			preparedStatement.setDouble(4, employeeBO.getSalary());
			result = preparedStatement.executeUpdate();
		}
		
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
				
		if(result == 0) return false;
		else return true;
	}

}
