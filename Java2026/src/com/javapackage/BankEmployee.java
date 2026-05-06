package com.javapackage;

import java.util.Scanner;

public class BankEmployee {

	int accNo;
	String name;
	int pin;
	double balance;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------------Welecome mini atm----------------");
		System.out.println("========== Create Account ============");
		System.out.println("Enter the Account number : ");
		int accNo = sc.nextInt();
		System.out.println("Enter the Account Holder Name : ");
		String name = sc.next();
		System.out.println("Enter the Pin : ");
		int pin = sc.nextInt();
		System.out.println("Enter the Account Balance : ");
		double balance = sc.nextDouble();
	
		BankEmployee s1 = new BankEmployee();
		s1.accNo=accNo;
		s1.balance=balance;

		System.out.println("--------------------------------");
		System.out.println("Enter your Account number :");
		
		System.out.println("Enter the Ammount for Depoist : ");
		int money = sc.nextInt();
		System.out.println("Success fully ammount added : "+money);
		System.out.println("Your balance : "+s1.getDeposit(money));

		
//		int totalmoney = s1.getMyMoney(money);
//		System.out.println("total money:" + totalmoney);
//		System.out.println("Enter your amount:");
//		double deposit = sc.nextDouble();
//		double amount = s1.getDeposit(deposit);
//		System.out.println("add your amount:" + amount);
//
//		double total = totalmoney + amount;
//		System.out.println("after deposit:" + total);
//		System.out.println("Enter your money:");
//		double withdraw = sc.nextDouble();
//		double debit = s1.getWithdraw(withdraw);
//		System.out.println("Your withdraw money:" + debit);
//		double total1 = total - debit;
//
//		System.out.println("my checking  balance:" + total1);

	}

	int getMyMoney(int money) {

		return money;
	}

	double getDeposit(double deposit) {
		balance=balance+deposit;

		return balance;
	}

	double getWithdraw(double withdraw) {
		return withdraw;
	}

	double getCheckBalce(double check) {
		return check;
	}
}
