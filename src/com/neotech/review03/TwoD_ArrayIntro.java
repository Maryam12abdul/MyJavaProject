package com.neotech.review03;

public class TwoD_ArrayIntro {

	public static void main(String[] args) {
		
		
		
		int[][] numbers = new int[3][4]; // [rows][columns]

		numbers[1][2] = 5;
		numbers[2][0] = 6;
		numbers[0][0] = 9;

		// re-assign a value to one element
		numbers[1][2] += 2; // incrementing by 2

		// compile-time error -> Before running the code
		// numbers[0][3] = "cat";

		// run-time error -> After running the code
		// numbers[3][1] = 4;

		int rows = numbers.length;

		
		System.out.println("The number of rows is -> " + rows);

		// The length of the row with index 1
		int cols1 = numbers[1].length;
		System.out.println("The length of the row with index 1 is -> " + cols1);

		System.out.println("--------------------------------");

		int[][] numbers2 = { 
				{ 5, 8, 2 }, 
				{ 9, 0, 1 }, 
				{ 6, 1, 5 }, 
				{ 7, 4, 9 } 
		};
		
		
		// The index of 8 is -> 0,1
		// The index of 7 is -> 3,0
		// The index of 5 is -> 0,0
		// The index of 5 is -> 2,2

		

		
		
	}

}
