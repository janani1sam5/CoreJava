package org.taskenum.com;

public class TaskEnum {
	enum Level{
		Low,
		Medium,
		High
	}
	public static void main(String[] args) {
		Level myVar = Level.Medium;
		System.out.println(myVar);
	}

}
