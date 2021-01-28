package org.polymorphism.com;

//Overriding
public class Bank extends TatBank {
	private void CheckingAccount() {
		System.out.println("Checking Account 6%");
	}
	private void bankLocation() {
		System.out.println("Chennai");
	}
	public void SavingAccount() 
	{
		System.out.println("Saving Account 8%");
	}
	public void JointAccount() {
		System.out.println("Joint Account 6%");
	}
	public static void main(String[] args) 
	{
		Bank b=new Bank();
		b.CheckingAccount();
		b.bankLocation();
		
		b.JointAccount();
		b.SavingAccount();
		b.mmsAccount();
	
		
	}

}
