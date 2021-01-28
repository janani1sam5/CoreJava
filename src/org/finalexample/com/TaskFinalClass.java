package org.finalexample.com;

//Class Level
//When we declare Class as Final , then we can not extend the class
public final class TaskFinalClass {

	public void Add() {
		String s = "Declared Final in Class Level";
		System.out.println(s);
	}
	public static void main(String[] args) {
		TaskFinalClass tc = new TaskFinalClass();
		tc.Add();
	}
}
