package com.javaConditionalStatements;

import java.util.Scanner;

public class CheckEvenOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("Given number is Even");
		}


	}

}
