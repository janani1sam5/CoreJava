package org.staticexample.com;

//Static
public class TaskStatic {
	
	//Static Variable
	static int var1 = 450;
	static String var2 = "Task for Static Variable";
	int v = 20;
	
	
	
	//This is a Static Method
	static void display() {
		System.out.println("Var1 is: "+var1);
		System.out.println("Var2 is: "+var2);
	}	  

	public static void main(String[] args) {
		
		TaskStatic ts = new TaskStatic();
		ts.display();
		
		
	}

}
