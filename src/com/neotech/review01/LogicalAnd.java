package com.neotech.review01;

public class LogicalAnd {
	
	// both conditions must be true

	public static void main(String[] args) {
		int temp = 30;
		
		if (temp > 30) {
			System.out.println("It is hot outside");

		}
		else if ( temp >=25 && temp <= 30) {
		System.out.println( "It is warm outside");
		
		}
		else {
			System.out.println("It is cold outside");
		}
	}

}
