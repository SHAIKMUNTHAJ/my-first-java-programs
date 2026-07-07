package com.tasks;
//1. Given an array of integers, find the smallest element in the array.
//Example:
//Input:
//arr = [12, 45, 67, 23, 89, 34]
//Output:
//12
public class SmallestElement {

	public static void main(String[] args) {
		int arr[]= {12, 45, 67, 23, 89, 34};
		int min=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
			System.out.println(min);
		

	}

}
