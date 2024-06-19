
/**
 * 
 */
package com.gniot.bean;

/**
 * @author Dell // bean class
 *
 */
public class Customer {
	
	// Declare all the properties of Customers 
	
	 private int customerId;
	 private String customerName;
	 private String customerAddress;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
}