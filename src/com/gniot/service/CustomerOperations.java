/**
 * 
 */
package com.gniot.service;

import com.gniot.bean.Customer;

/**
 * @author Dell
 *
 */
public class CustomerOperations {

	// all business methods define here

	// Create Customer

	// Array of customer

	// Declaring the Array for Customer Operation with 3 Record
	// Custome Array

	Customer myCustomers[] = new Customer[] { new Customer(), new Customer(), new Customer() };

	public void createCustomer() {

		System.out.println("<----Customer  Created---->");

		// Record 1
		myCustomers[0].setCustomerId(101);
		myCustomers[0].setCustomerName("Yogesh");
		myCustomers[0].setCustomerAddress("Blore");

		// Record 2
		myCustomers[1].setCustomerId(102);
		myCustomers[1].setCustomerName("Amit");
		myCustomers[1].setCustomerAddress("DElhi");
		

		// Record 3
		myCustomers[2].setCustomerId(103);
		myCustomers[2].setCustomerName("Vinay");
		myCustomers[2].setCustomerAddress("Reference");

	}

	public boolean deleteCustomer(int customerId) {

		System.out.println("<------Custoemr deleted----->");
		return true;
		
	}

	public boolean updateCustomer(int customerId) {

		System.out.println("<------Custoemr updated----->");
		return true;
	}

	public void listCustomer() {

		System.out.println("<----List Customer----->");
		

		 // New way to define the loop in java 
			for(Customer customer : myCustomers) {
				
				System.out.println("details list of Customer is -->" +customer.getCustomerId() +"-" +customer.getCustomerName() + "-" +customer.getCustomerAddress());
			}
		
	}

}
