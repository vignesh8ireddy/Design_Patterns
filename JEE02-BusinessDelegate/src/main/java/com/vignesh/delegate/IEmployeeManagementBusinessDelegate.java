package com.vignesh.delegate;

import java.io.IOException;
import java.sql.SQLException;

import com.vignesh.vo.EmployeeVO;

public interface IEmployeeManagementBusinessDelegate {
	
	public String registerEmployee(EmployeeVO employeeVO) throws SQLException, Exception;

}
