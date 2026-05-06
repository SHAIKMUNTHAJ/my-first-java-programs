package com.javaConditionalStatements;

import java.util.Scanner;

//Check if a number is divisible by 5.
public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number:");
		int num = sc.nextInt();
if(num%5==0) {
	int quotient=num/5;
	System.out.println("Given number is divisible by 5");
	System.out.println("quotient nubmer:" +quotient);
}else {
	System.out.println(" not divisible by 5");
}

	}

}
