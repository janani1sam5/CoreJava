package org.interface1.com;

// Interface 
public class Sample implements Inter1 , Inter2 {

	private void clientName() {
		System.out.println("Rantan");		
	}
	
	private void clientID() {
	 System.out.println("6445");	
	}
	public void empName() {
		System.out.println("Anu");
	}
	public void empID() {
		System.out.println("3245");
	}
	public void empLocation() {
		System.out.println("Chennai");
	}
	
	public static void main(String[] args) {
		Sample m= new Sample();
		m.clientID();
		m.clientName();
		m.empID();
		m.empName();
		m.empLocation();
	}
	
}
