package com.tasks;

//1. Given an array of integers, sort the array using Insertion Sort.
//Example:
//Input:
//arr = [12, 11, 13, 5, 6]
//Output:
//[5, 6, 11, 12, 13]
public class InsertionSort {

	public static void main(String[] args) {
		int arr[] = { 12, 11, 13, 5, 6 };
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];// 4(assuming the value)
			int j = i - 1;// 1-1=0->5

			while (j >=0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		for (int num : arr) {
			System.out.print(" "+num);
		}
	}

}
