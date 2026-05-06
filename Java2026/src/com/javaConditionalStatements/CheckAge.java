package com.javaConditionalStatements;

import java.util.Scanner;

//Check if a person is eligible to vote (age ≥ 18)
public class CheckAge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age number:");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("your eligible for voting");
		}else {
			System.out.println("chorry!! try after getting above 18 years");
		}

	}

}
