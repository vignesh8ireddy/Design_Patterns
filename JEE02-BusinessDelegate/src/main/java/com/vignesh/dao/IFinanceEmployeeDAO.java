package com.vignesh.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.vignesh.bo.FinanceEmployeeBO;

public interface IFinanceEmployeeDAO extends IEmployeeDAO {
	
	public boolean insertEmployee(Connection con, FinanceEmployeeBO employeeBO) throws SQLException;

}
