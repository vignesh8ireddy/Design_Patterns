package com.vignesh.factory;

import com.vignesh.dao.FinanceEmployeeDAOImpl;
import com.vignesh.dao.HREmployeeDAOImpl;
import com.vignesh.dao.IEmployeeDAO;

public class EmployeeDAOFactory {
	
	public static IEmployeeDAO getEmployeeDAO(String employeeDAOType) {
		if(employeeDAOType.equalsIgnoreCase("hr")) return new HREmployeeDAOImpl();
		else if(employeeDAOType.equalsIgnoreCase("finance")) return new FinanceEmployeeDAOImpl();
		else throw new IllegalArgumentException("Invalid Employee DAO Type");
	}

}
