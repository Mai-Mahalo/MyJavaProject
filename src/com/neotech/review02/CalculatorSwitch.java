package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {
	// Ask the user to enter 2 numbers
	// Ask the user for the operator (+,-,*,/)
	// Calculate the result using switch-case

	public static void main(String[] args) {

		Scanner sofia = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = sofia.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = sofia.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String op = sofia.next();

		double result = 0;

		switch (op) {
		case "+":
			result = d1 + d2;
			break;
		case "-":
			result = d1 - d2;
			break;
		case "*":
			result = d1 * d2;
			break;
		case "/":
			result = d1 / d2;
			break;
		default:
			System.out.println("Invalid Operator");
		}

		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			System.out.println("The result is -> " + result);
	
		
		}

		sofia.close();

	}

}
