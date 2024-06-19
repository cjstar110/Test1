/**
 * 
 */
package com.gniot.inter;

/**
 * @author Dell
 *
 */
public class ClientCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//refernece object of Interface Indina 
		
		Calculator indian=new IndianCal();
		System.out.println("call to add-->" +indian.add(10, 10));
		System.out.println("call to sub--->" +indian.sub(20, 10));
		
		// Instance of chaina 
		
		Calculator china=new ChinaCal();
		System.out.println("call the add for China->" +china.add(10, 10));
		System.out.println("call the sub for China-->" +china.sub(20, 10));
		
		
	}

}