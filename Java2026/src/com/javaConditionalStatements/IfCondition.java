package com.javaConditionalStatements;

import java.util.Scanner;

//Take a number and check if it is positive.
public class IfCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		if (n >=0) {
			System.out.println("it is a positive");
		}else {
			System.out.println(" it is anagitive");
		}

	}

}
