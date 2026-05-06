package com.javaConditionalStatements;

import java.util.Scanner;

//Check if a number is zero.
public class CheckNumberZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
    if(n==0) {
    	System.out.println("Given number  is a zero ");
    }else {
    	System.out.println("Given number is not a zero");
    }

	}

}
