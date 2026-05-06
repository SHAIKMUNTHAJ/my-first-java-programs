package com.javaConditionalStatements;

import java.util.Scanner;

public class CheckOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
      if(n%2==1) {
    	  System.out.println("Given Number is Odd");
      }
	}

}
