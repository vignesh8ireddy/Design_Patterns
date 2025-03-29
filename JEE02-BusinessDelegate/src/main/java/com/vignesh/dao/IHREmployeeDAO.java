package com.vignesh.dao;

import java.sql.Connection;
import java.sql.SQLException;

import com.vignesh.bo.HREmployeeBO;

public interface IHREmployeeDAO extends IEmployeeDAO {
	
	public boolean insertEmployee(Connection con, HREmployeeBO employeeBO) throws SQLException;

}
