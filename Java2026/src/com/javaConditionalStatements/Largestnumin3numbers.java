package com.javaConditionalStatements;

import java.util.Scanner;

public class Largestnumin3numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number:");
		int a=sc.nextInt();
		System.out.println("Enter your  number:");
		int b=sc.nextInt();
		System.out.println("Enter your  number:");
		int c=sc.nextInt();
		if(a<=b && a>=b&& a>=c) {
		System.out.println("BIGGEST NUMBER");
		
		}else {
			System.out.println("lowest number");
		}

	}

}
