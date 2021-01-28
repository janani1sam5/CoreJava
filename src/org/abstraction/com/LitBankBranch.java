package org.abstraction.com;

//Partial Abstraction
//Main Class
public class LitBankBranch extends IitBank{
	public void fixed() {
		System.out.println("Fixed : 5%");
	}

	@Override
	public void savings() {
		System.out.println("Saving : 6%");
	}
	public static void main(String[] args) {
		LitBankBranch l = new LitBankBranch();
		l.fixed();
		l.savings();
		l.deposit();
	}

}
