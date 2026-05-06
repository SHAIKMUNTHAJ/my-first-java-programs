package com.Patterns;

public class WithOutDaigonal {

	public static void main(String[] args) {
		char[] arr= {'M','U','N','T','H','A','J'};
		char al = 'A';
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j<arr.length ; j++) {
				if (i == j || i + j == arr.length - 1) {
					System.out.print(arr[i] + " ");
				} else {
					System.out.print(al+++" ");
				}
			}
			System.out.println();

		}

	}

}
