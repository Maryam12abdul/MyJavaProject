package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {
		// byte < short < int < long < float < double
		int intNumber = 39; 
		
		// widening/ implicit casting/ automatic
		double doubleNumber = intNumber;
		
		System.out.println("intNumber-->" +  intNumber);
		System.out.println("doubleNumber-->" + doubleNumber);
		
		// narrowing/explicit casting/ manual
		byte byteNumber = (byte) intNumber;   // it is risky, we may lose data
		System.out.println("byteNumber--> " + byteNumber);
		
		intNumber = 200;
		
		// in this case we will lose data
		byte b2 = (byte) intNumber;
		System.out.println("b2--> " + b2);
		
		// widening
		byte b3 = 80;
		int i3 = b3;
		System.out.println("i3--> " + i3);
		
		double d1 = 7.9999;
		int i4 = (int) d1;
		System.out.println("i4--> " + i4);
		
		
		
	}

}
