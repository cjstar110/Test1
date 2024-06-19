package com.gniot.client;

import java.util.Scanner;

import com.gniot.business.BasicCalculator;
import com.gniot.business.SciCAL;

/* @author  Chirag
 * @Date 09/05/2024 07:30:00
*
*/
public class ClientCalAPP {
	/**
	 * @paramp
	 */

	public static void main(String[] args) {
// TODO Auto-generated method stub
		
// Object of the Business Class
		BasicCalculator cal = new BasicCalculator();
		Scanner in = new Scanner(System.in);
		System.out.print("Addition values");
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println("Addtion of number-->" + cal.addtion(a, b));
		System.out.print("Substarction values");
		int c = in.nextInt();
		int d = in.nextInt();
		System.out.println("Substarction of Number-->" + cal.substraction(c, d));
		System.out.print("Multiply values");
		int e = in.nextInt();
		int f = in.nextInt();
		System.out.println("Multiply of the Numebr-->" + cal.multiply(e, f));
		System.out.print("Divide values");
		int g = in.nextInt();
		int h = in.nextInt();
		System.out.println("Divide of the Number-->" + cal.devide(g, h));

		SciCAL calculator = new SciCAL();

		System.out.print("Sin values");
		double x = in.nextDouble();

		double resultSin = calculator.sin(x);
		System.out.println("Sin(x): " + resultSin);
		System.out.print("Sqrt values");
		double y = in.nextDouble();
		double resultSqrt = calculator.sqrt(y);
		System.out.println("Sqrt(y): " + resultSqrt);
		System.out.print("Cos values");
		double z = in.nextDouble();
		double resultCos = calculator.cos(z);
		System.out.println("Cos(z): " + resultCos);
		System.out.print("Tan values");
		double i = in.nextDouble();
		double resultTan = calculator.tan(i);
		System.out.println("Tan(i): " + resultTan);
		System.out.print("Log values");
		double j = in.nextDouble();
		double resultLog = calculator.log(j);
		System.out.println("Log(j): " + resultLog);
		System.out.print("Factorial values");
		double k = in.nextDouble();
		double resultfactorial = calculator.factorial(k);
		System.out.println("Factorial(k): " + resultfactorial);
		System.out.print("Fibonacci values");
		double l = in.nextDouble();
		double resultfibonacci = calculator.fibonacci(l);
		System.out.println("Fibonacci(l): " + resultfibonacci);
		in.close();
		
	}
}