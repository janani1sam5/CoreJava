package org.polymorphism.com;

//Overloading

public class Employee {
	private void findUser(String name) {
		System.out.println(name);		
	}
	private void findUser(String name,long phno) {
		
		System.out.println("Name and Phone no :"+name+phno);
	}
	private void findUser(long phno,String name) {
		
		System.out.println("Phone No and Name: "+phno+name);
	}
	private void findUser(String name,boolean status,double sal) {
		System.out.println("Name , Status and Salary : "+name+status+sal);
		
	}
	public static void main(String[] args) {
		Employee u = new Employee();
		u.findUser("Janani",34534539923l);
		u.findUser("Varun");
		u.findUser(94350345230l, "Sridhar");
		u.findUser("Anu",true,10000);		
	}

}
