package com.gniot.business;

public class SciCAL {

	public double sin(double a) {
		System.out.println("");
		return Math.sin(a);
	}

	public double sqrt(double a) {
		System.out.println("");
		return Math.sqrt(a);
	}

	public double cos(double a) {
		System.out.println("");
		return Math.cos(a);
	}

	public double tan(double a) {
		System.out.println("");
		return Math.tan(a);
	}

	public double log(double a) {
		System.out.println("");
		return Math.log(a);
	}

	public double factorial(double a) {
		double fact = 1;
		for (int i = 2; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public double fibonacci(double a) {
		int num1 = 0, num2 = 1;

		for (int i = 0; i < a; i++) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;
			num1 = num2;
			num2 = num3;
		}
		return num1;
	}

}
