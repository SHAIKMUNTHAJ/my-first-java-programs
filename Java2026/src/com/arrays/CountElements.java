package com.arrays;

import java.util.Scanner;

public class CountElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
//		int count=0;
		int elements[]=new int[n];
		for(int i=0;i<n;i++) {
        elements[i]=sc.nextInt();

		}
System.out.println("count of the elements:"+elements.length);
	}

}
