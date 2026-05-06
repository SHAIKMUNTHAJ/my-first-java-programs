package com.arrays;

public class AverageNumber {

	public static void main(String[] args) {

		int[] numbers = { 10, 45, 36, 75, 57 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println("sum of the numbers:" + sum);
		avg = sum / numbers.length;
		System.out.println("avg of the numbers:" + avg);
	}

}
