package com.vignesh.delegate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.vignesh.bo.FinanceEmployeeBO;
import com.vignesh.bo.HREmployeeBO;
import com.vignesh.dao.FinanceEmployeeDAOImpl;
import com.vignesh.dao.HREmployeeDAOImpl;
import com.vignesh.dao.IFinanceEmployeeDAO;
import com.vignesh.dao.IHREmployeeDAO;
import com.vignesh.exception.EmployeeRegistrationProblemException;
import com.vignesh.factory.ConnectionFactory;
import com.vignesh.vo.EmployeeVO;

public class EmployeeManagementBusinessDelegate implements IEmployeeManagementBusinessDelegate {
	private IHREmployeeDAO hrDAO;
	private IFinanceEmployeeDAO financeDAO;
	
	public EmployeeManagementBusinessDelegate() {
		hrDAO = new HREmployeeDAOImpl();
		financeDAO = new FinanceEmployeeDAOImpl();
	}
	
	@Override
	public String registerEmployee(EmployeeVO employeeVO) throws SQLException, Exception {
	
		HREmployeeBO hrEmployeeBO = new HREmployeeBO();
		hrEmployeeBO.setName(employeeVO.getName());
		hrEmployeeBO.setAddress(employeeVO.getAddress());
		hrEmployeeBO.setDesignation(employeeVO.getDesignation());
		
		FinanceEmployeeBO financeEmployeeBO = new FinanceEmployeeBO();
		financeEmployeeBO.setName(employeeVO.getName());
		financeEmployeeBO.setAddress(employeeVO.getAddress());
		financeEmployeeBO.setDesignation(employeeVO.getDesignation());
		financeEmployeeBO.setSalary(Double.parseDouble(employeeVO.getSalary()));
		
		boolean hrFlag = false, financeFlag = false;
		Connection connection = null;
		String resultMsg;
		try {
			connection = ConnectionFactory.getPooledJdbcConnection();
			connection.setAutoCommit(false);
			hrFlag = hrDAO.insertEmployee(connection, hrEmployeeBO);
			financeFlag = financeDAO.insertEmployee(connection, financeEmployeeBO);
			
			if(hrFlag && financeFlag) {
				connection.commit(); // commit Tx  (case3)
            	resultMsg="Employee registration successfull";
			}
            else {
        	    connection.rollback();  //rollback Tx (case3)
        	    resultMsg="Employee registration failed";
            }
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			try {
				connection.rollback();  //rollback Tx case3
				resultMsg="Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
  			    //translating  DAO generated technology sepecific execeptions to  Project specific user-defined exception
				throw  new  EmployeeRegistrationProblemException(se1.getMessage());  //case2
			}
			throw  new  EmployeeRegistrationProblemException(se.getMessage());  //case2
		}//catch
		catch(Exception e) {
			e.printStackTrace();
			try {
				connection.rollback();  ////rollback Tx case3
				resultMsg="Employee registration failed";
			}
			catch(SQLException se1) {
				se1.printStackTrace();
					
				throw  new  EmployeeRegistrationProblemException(e.getMessage());  //case2
			}
				throw  new  EmployeeRegistrationProblemException(e.getMessage()); //case2
		}
		finally {
			try {
				if(connection!=null)
					connection.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
			
		return resultMsg;
	}
}