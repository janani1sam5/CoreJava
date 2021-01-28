package org.staticexample.com;

public class TaskStaticClass {
	
	private static String str = "Static Nested Class";

	//Static Class
	static class NestedClass{
		//non-static method
		public void disp() {
			String s = "Inside Nested Class";
			//Nested static class cannot access non-static members of outside
			System.out.println(str);
			System.out.println(s);
			
			
		}
		public static void main(String args[]) {
			/* To create instance of nested class we didn't need the outer
			* class instance but for a regular nested class you would need 
			* to create an instance of outer class first
		        */
			TaskStaticClass.NestedClass obj = new TaskStaticClass.NestedClass();
			obj.disp();
			
		}
		
	}
}
