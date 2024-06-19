
/**
* 
*/
package com.gniot.client;

import com.gniot.service.CustomerOperations;

/**
 * @author Dell
 *
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// create the instance of CustomerOperation

		CustomerOperations customerOps = new CustomerOperations();
		customerOps.createCustomer();
		System.out.println(customerOps.deleteCustomer(101));
		System.out.println(customerOps.updateCustomer(101));
		customerOps.listCustomer();

	}

}
