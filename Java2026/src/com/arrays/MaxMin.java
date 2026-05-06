package com.arrays;

public class MaxMin {
	public static void main(String[] args) {
		int arr[] = new int[6];
		arr[0] = 10;
		arr[1] = 2;
		arr[2] = 34;
		arr[3] = 5;
		arr[4] = 9;
		arr[5] = 87;
		int min = arr[0];
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			} else if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println(" min of the number is:" + min);
		System.out.println(" min of the number is:" + max);
	}
}
