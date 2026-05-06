package com.javaWhileloops;

import java.util.Scanner;

public class CountofNumbers {

	public static void main(String[] args) {

		System.out.println("main method start");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int r=0;
		int count=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			count++;
			
		}
System.out.println("Count of the Given number is:"+count);
	}

}
