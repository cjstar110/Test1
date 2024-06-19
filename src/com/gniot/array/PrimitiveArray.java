/**
 * 
 */
package com.gniot.array;

/**
 * 
 */
public class PrimitiveArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i =0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
//		wrapper class array
		// old for loop method  
		String[] strAr = {"Ani","Sam", "Joe"};
		for(int i=0;i<strAr.length; i++) {
			System.out.println(strAr[i]);
		}
		// new for loop method
		for(String str: strAr) {
			System.out.println(str);
		}

	}

}
