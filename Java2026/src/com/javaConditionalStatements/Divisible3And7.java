package com.javaConditionalStatements;
//Check if a number is divisible by both 3 and 7
import java.util.Scanner;

public class Divisible3And7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number:");
		int n = sc.nextInt();
		if(n%3==0 && n%7==0) {
			System.out.println("Given number is divisible by both 3,7");
		}else {
			System.out.println("not divisible both 3 and 7" );
		}
	}

}
