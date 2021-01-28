package org.core.java;

public class TaskStringBuilder1 {
	public static void main(String[] args) {
		
		//Literal String
		System.out.println("Literal Sting");
		String a = "Task for String";
		String a1 = "Task for String";
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(a1));
		
		//Non-Literal String
		System.out.println("Non-Literal Sting");
		String b = new String("Java");
		String b1 = new String("Java");
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(b1));
		
		//Immutable String : After Concat 
		// It store in new Memory
		System.out.println("Immutable String ");
		String s1 = "Selenium";
		String s2 = "Selenium";
		
		String conc=s1.concat(s2);
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(conc));
		
		//Mutable String Buffer : After Append
		//It Stores in First Memory Address
		System.out.println("Mutable String Buffer");
		StringBuffer sb1 = new StringBuffer("Cucumber");
		StringBuffer sb2 = new StringBuffer("Cucumber");
		StringBuffer app = sb2.append(sb1);
		System.out.println(System.identityHashCode(sb1));
		System.out.println(System.identityHashCode(sb2));
		System.out.println(System.identityHashCode(app));
		
		//Mutable String Builder : After Append
		//It Stores in First Memory Address
		System.out.println("Mutable String Builder");
		StringBuilder sb3 = new StringBuilder("TestNG");
		StringBuilder sb4 = new StringBuilder("TestNG");
		StringBuilder app1 = sb4.append(sb3);
		System.out.println(System.identityHashCode(sb3));
		System.out.println(System.identityHashCode(sb4));
		System.out.println(System.identityHashCode(app1));
		
	}

}
