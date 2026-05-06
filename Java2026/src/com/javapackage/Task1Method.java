package com.javapackage;

import java.util.Scanner;

public class Task1Method {

	double getPrice(double price, double quntity) {
		double total = price * quntity;
		return total;
	}

	double getGst(double total) {

		double addgst = total + 5.0;
		return addgst;
	}

	double getCharges(double addgst) {
		double charges = addgst + 100;
		return charges;

	}

	static void printBill(double charges) {
		System.out.println("Final Bill:" + charges);
	}

	public static void main(String[] args) {
		Task1Method s1 = new Task1Method();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price:");
		double price = sc.nextDouble();
		System.out.println("Enter your quntity number:");
		int quntity = sc.nextInt();
		double p = s1.getPrice(price, quntity);
		double q = s1.getGst(p);
		double r = s1.getCharges(q);
		printBill(r);

		sc.close();
	}

}
