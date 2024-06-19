package com.gniot.exception;

public class DemoException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a, b, c;

			a = 20;
			b = 0;
			c = a / b;
			System.out.println("value of c:" + c);
		} catch (Exception ex) {
			System.out.println("Unappropriate Arthmetic Operation"+ ex.getMessage());
		}finally{
			System.out.println("End of the program");
		}

	}

}
