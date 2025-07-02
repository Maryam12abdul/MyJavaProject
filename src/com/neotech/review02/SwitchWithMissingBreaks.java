package com.neotech.review02;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		
		
		int number = 4;
		
		switch (number) {
		case 3:
			System.out.println("3");
			
		case 4:
			System.out.println("4");
			break;
		case 5:
			System.out.println("5");
			
		case 6:
			System.out.println("6");
			
		case 7:
			System.out.println("7");
			
		default:
			System.out.println("The number was not 3, 4, 5, 6, 7");
			
		}
		
		// limitations of switch-case
		// 1. you can't have duplicate cases
		// 2. you should be careful with breaks
		// 3. you can't use logical operators like in if-else
		
		if (number == 3 || number == 5 || number == 7) {
			
		}
		
		// 4. you can not use greater than
		if (number > 5) {
			
		}
	}

}
