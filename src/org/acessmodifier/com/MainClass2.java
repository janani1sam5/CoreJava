package org.acessmodifier.com;

//Access Modifier : Public
//Main Program
public class MainClass2 {
 public static void main(String[] args) {
	 //Accessing the public class
	 TaskPublicClass tp = new TaskPublicClass();
	 
	 //Accessing the public variable
	 tp.count = 4;
	 //Accessing the public method
	 tp.display();
 }
	
}
