package com.arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n = sc.nextInt();
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 15;
		arr[2] = 20;
		arr[3] = 25;
		arr[4] = 30;

		System.out.println("even number");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}

		}
		System.out.println("odd even ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				System.out.println(arr[i]);

			}

		}

	}

}
