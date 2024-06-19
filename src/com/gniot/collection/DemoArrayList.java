/**
 * 
 */
package com.gniot.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class DemoArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();

		// check the size of collection object

		System.out.println("Size of collection -->" + list.size());

		// insert the Data
		list.add("monika"); // student/ professor// admin
		list.add("tanaya");
		list.add("neha");
		list.add("adbul");
		list.add("vinay");

		System.out.println("size of Collection-->" + list.size());
		// remove
		// we can remove the value in collection by 2 ways by index by value

		System.out.println("remove the choice data from the collection-->");
		list.remove(1);
		list.remove("vinay");

		System.out.println("print collection-->" + list);

		// list of the collection
		for (String str : list) {

			System.out.println("data-->" + str);
		}
	}

}
