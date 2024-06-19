package com.gniot.input;

import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = 0, num2 = 0, result;
        int choice;

        do {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Power (^)");
            System.out.println("7. Sin (sin)");
            System.out.println("8. Cos (cos)");
            System.out.println("9. Tan (tan)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 6:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    break;
                case 0:
                    System.out.println("Exiting calculator...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue; 
            }

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                case 5:
                    result = Math.sqrt(num1);
                    break;
                case 6:
                    result = Math.pow(num1, num2);
                    break;
                case 7:
                    result = Math.sin(Math.toRadians(num1));
                    break;
                case 8:
                    result = Math.cos(Math.toRadians(num1));
                    break;
                case 9:
                    result = Math.tan(Math.toRadians(num1));
                    break;
                default:
                    continue; 
            }

            if (choice != 0) { 
                System.out.println("Result: " + result);
            }
        } while (choice != 0);

        scanner.close();
    }
}
