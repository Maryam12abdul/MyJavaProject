package com.neotech.review01;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// command + shift + 0 --> To import scanner class
		
		Scanner input = new Scanner (System.in);
		
		// .next() reads one word until space /enter
		System.out.println("Please enter a sentence");
		
		String word1= input.next();
		System.out.println(word1);
	

        String word2 = input.nextLine();
		System.out.println(word2);
        
		
		String word3 = input.nextLine();
		System.out.println(word3);
		
		
		System.out.println("Enter your age");
		int age = input.nextInt();
		System.out.println(age);
		
		System.out.println("Enter your salary");
		double salary = input.nextDouble();
		System.out.println(salary);
		
		System.out.println("Enter your current year");
		int year = input.nextInt();
		System.out.println(year);
		
		System.out.println("Is it snowing there");
		boolean snow = input.nextBoolean();
		System.out.println(snow);
		
		
		System.out.println("Enter your gender");
		char gender = input.next().charAt(0); // gets the first letter of the user line
	
		
		
		
		
		
		
		input.close();
		
		
		
		
		
	}

}
