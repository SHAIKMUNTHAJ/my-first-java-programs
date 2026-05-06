package com.javaConditionalStatements;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		System.out.println("Enter b value:");
   int b=sc.nextInt();
   
  boolean result=a<b;
  if(result) {
	System.out.println(" b is greater number than a");  
  }else {
	  System.out.println(" a is greaterthan b");
  }

	}

}
