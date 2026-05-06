package com.arrays;

//WAP to print a number in reverse..?
public class ReverseNumber {

	public static void main(String[] args) {
	int arr[] = { 1, 0, 3, 4, 6, 5, 6 };
//
//		for (int i = arr.length - 1; i >= 0; i--) {
//
//			System.out.print(arr[i] + " ");
//		}

//If just reading values → use for-each
//		For-each loop doesn’t support reverse traversal because 
//		it doesn’t provide index control
		int rev[] = new int[arr.length];
		int i = arr.length - 1;
		for (int x : arr) {
			rev[i--] = x;

		}
		for (int x : rev) {
			System.out.println(x);
		}
	}
}
