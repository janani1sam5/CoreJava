package org.core.java;

public class TaskStringBuilder {

	public static void main(String args[]){  
		
		//Append
		StringBuilder sb=new StringBuilder("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		
		//Capacity
		//System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2 
		
		//Insert
		StringBuilder sb1=new StringBuilder("Hello ");  
		sb1.insert(1,"Java");//now original string is changed  
		System.out.println(sb1);//prints HJavaello 
		
		//Replace
		StringBuilder sb3=new StringBuilder("Hello");  
		sb3.replace(1,3,"Java");  
		System.out.println(sb3);//prints HJavalo
		
		//Delete
		StringBuilder s4=new StringBuilder("Hello");  
		s4.delete(1,3);  
		System.out.println(s4);//prints Hlo 
		
		//Reverse
		StringBuilder sb5=new StringBuilder("Hello");  
		sb5.reverse();  
		System.out.println(sb5);
		
		
		}  
	
	
}
