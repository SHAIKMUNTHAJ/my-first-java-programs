package com.oops;

//B70 java - Build a banking system using Inheritance & Method Overriding
//Classes: Account, SavingsAccount, CurrentAccount
//Account → calculateInterest()
//Override in child classes
//Savings → 6%, Current → 2%
//Print interest    
class Account {
	int id;
	double balace;

	public Account(int id, double balace) {

		this.id = id;
		this.balace = balace;
	}

	void calculateInterest() {

	}
}

class SavingsAccount extends Account {
	public SavingsAccount(int id, double balace) {
		super(id, balace);
	}

	void calculateInterest() {
		double interest = balace * 0.06;
		System.out.println("Interest calculation in savings class : " + interest);

	}

}

class CurrentAccount extends Account {
	public CurrentAccount(int id, double balace) {
		super(id, balace);
	}

	void calculateInterest() {
		double interest = balace * 0.02;
		System.out.println("Interest calculation in current class : " + interest);

	}

}

public class BankingSystemApplication {
	public static void main(String[] args) {
		SavingsAccount S1 = new SavingsAccount(11, 1000000);
		S1.calculateInterest();
		CurrentAccount c1=new CurrentAccount(12,12000000);
		c1.calculateInterest();
	}

}
