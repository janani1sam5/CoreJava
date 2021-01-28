package org.comparator.com;

//
public class Client {
	int id;
	String name, address;
	
	//Constructor
	public Client(int id,String name, String address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	//TO Print Client detail in main()
	public String toString() {
		return this.id+" "+this.name+" "+this.address;
	}
	
}
