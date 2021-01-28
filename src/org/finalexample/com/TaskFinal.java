package org.finalexample.com;

//Final 
public class TaskFinal {

	public void Add() {
		/* Variable Level
		When we declare Final at variable level 
		then we can not modify the value */
		final int id = 10;
		System.out.println("Declared as Final in variable Level : "+id);
	}
	
	//Method Level
	//When we declare a Method as Final , we can not override the method
	public final void AMethod(){
		final int id1 = 20;
		int id2 = 200;
		System.out.println("Declared Final in Method Level: "+id1);
		
	}
	public static void main(String[] args) {
		TaskFinal tf = new TaskFinal();
		tf.Add();
		tf.AMethod();
	}
	
	
}
