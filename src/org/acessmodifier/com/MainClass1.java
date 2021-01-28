package org.acessmodifier.com;

////Access Modifier : Private
public class MainClass1 {

	public static void main(String[] args) {
		//Create an object for TaskPrivate Class 
		TaskPrivate tp = new TaskPrivate();
		
		//Access private variable and field from another class
		tp.name = "Private Variable";
		
		
		/*Error: 
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	       name cannot be resolved or is not a field

	       at org.acessmodifier.com.MainClass1.main(MainClass1.java:10)
	       
	       (We can access the private class with help of Getter and setter )*/
		
	}
}
