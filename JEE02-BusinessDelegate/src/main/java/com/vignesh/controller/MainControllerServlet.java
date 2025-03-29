package com.vignesh.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.vignesh.delegate.EmployeeManagementBusinessDelegate;
import com.vignesh.delegate.IEmployeeManagementBusinessDelegate;
import com.vignesh.exception.EmployeeRegistrationProblemException;
import com.vignesh.vo.EmployeeVO;


@WebServlet("/controller")
public class MainControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IEmployeeManagementBusinessDelegate businessDelegate;
	
	@Override
	public void init() {
		businessDelegate = new EmployeeManagementBusinessDelegate();
	}

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeVO employeeVO = new EmployeeVO();
		employeeVO.setName(request.getParameter("ename"));
		employeeVO.setAddress(request.getParameter("eaddress"));
		employeeVO.setDesignation(request.getParameter("edesignation"));
		employeeVO.setSalary(request.getParameter("esalary"));
		
		try {
			String res = businessDelegate.registerEmployee(employeeVO);
			request.setAttribute("msg", res);
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("show_result.jsp");
			requestDispatcher.forward(request, response);
		}
		
		catch (EmployeeRegistrationProblemException e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp");
			requestDispatcher.forward(request, response);
		}
		
		catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("error.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
		
	}

}
