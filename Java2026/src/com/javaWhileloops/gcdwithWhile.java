package com.javaWhileloops;

import java.util.Scanner;

public class gcdwithWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		System.out.println("enter b number");
		int b=sc.nextInt();
		int temp=0;
		while(b!=0) {
			 temp=b;
			b=a%b;
			a=temp;
		}
		
System.out.println(a);
	}

}
