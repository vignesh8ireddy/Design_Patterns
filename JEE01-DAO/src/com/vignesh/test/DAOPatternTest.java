package com.vignesh.test;

import java.util.Scanner;

import com.vignesh.controller.CustomerOperationsController;
import com.vignesh.model.Customer;

public class DAOPatternTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the following details of the Customer:");
		System.out.print("Name:: ");
		customer.setcName(scanner.next());
		System.out.print("Address:: ");
		customer.setcAddress(scanner.next());
		System.out.print("Bill Amount:: ");
		customer.setBillAmount(scanner.nextFloat());
		
		CustomerOperationsController controller = new CustomerOperationsController();
		try {
			String res = controller.registerCustomer(customer);	
			System.out.println(res);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}

	}

}
