/**
 * 
 */
package com.gniot.input;

import java.util.Scanner;

/**
 * @author Chirag
 * @Date 10/05/2024 20:03:00
 */
public class ScannerInput {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("----------Enter Your Details--------");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble();
		System.out.println("Salary: " + d);
		in.close();

	}
}
