package com.neotech.review01;

public class VariableDemo {

 	  //Always format your code
	// command + shift + f
	
	public static void main(String[] args) {
		
	    // declare a variable
	   String firstName;
	   // System.out.println("My name is --> " + firstName);
		
		// assign a value (initialize)
	   firstName = "Maryam";
		
	   System.out.println("My name is --> " + firstName);
		
	   // declare a variable & assign a value
	   String lastName = "Abdul";
		
	   int age = 26;
	   System.out.println( firstName + " " + lastName + " " + age +1);	
	   System.out.println( firstName + " " + lastName + " " + (age +1));	
	   
	   System.out.println(age);
	   
	   // After 3years
	   // re-assign a new value to the age variable
	    age = age +3;
	   // we can also say age +=3;
	    
	    lastName = "Abdul";
	    System.out.println( firstName + " " + lastName + " " + age);	

		
	}

}
