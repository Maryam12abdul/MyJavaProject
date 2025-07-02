package com.neotech.review02;

import java.util.Scanner;

public class CalculatorSwitch {

	public static void main(String[] args) {
		
		// ask the user to enter 2 numbers
		// ask the user to operate (+, -, *, /)
		//calculate the result using switch-case
		
		
		Scanner sofia = new Scanner(System.in);

		System.out.println("Please enter the first number:");
		double d1 = sofia.nextDouble();

		System.out.println("Please enter the second number:");
		double d2 = sofia.nextDouble();

		System.out.println("Please enter the operator (+,-,*,/)");
		String op = sofia.next();
		
		double result = 0;
		
		switch (op) {
		case"+":
			result = d1 + d2;
			break;
		case "-":
			result = d1-d2;
			break;
		case "*" :
			result = d1*d2;
			break;
		case"/" :
			
			result = d1/d2;

;
			default:
				System.out.println("Invalid operator");		
			
		}
		
		if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
			
		
		System.out.println("The result is -->" + result);
		
		} 
		
		
		
	}

}
