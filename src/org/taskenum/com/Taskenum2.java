package org.taskenum.com;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}
public class Taskenum2 {
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM;
	
		
		switch(myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
		
		for (Level myVar11 : Level.values()) {
			  System.out.println(myVar11);
			}
	}
	
	
}
