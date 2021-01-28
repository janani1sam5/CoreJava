package org.core.java;

public class TaskString {

	public static void main(String[] args) {
		String string1="Veronika";
		String string2="VERONIKA";
		
		//String Comparison
		System.out.println("String 1 and String 2 are equal :"+string1.equals(string2));
		System.out.println("String 1 and String 2 are equal : "+string1.equalsIgnoreCase(string2)); 
		
		//Creating integer  value
		Integer number = 10;
		
		//Calling the toString() method
		System.out.println("Interger converted to String: "+number.toString());
		
		
	}
}
