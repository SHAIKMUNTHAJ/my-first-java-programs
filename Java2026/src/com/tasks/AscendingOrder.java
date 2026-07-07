package com.tasks;
//2. Given an array of integers, determine whether the array is sorted in ascending order.
//Example:
//Input:
//arr = [10, 20, 30, 40, 50]
//Output:
//true
public class AscendingOrder {

	public static void main(String[] args) {
	int arr[]= {10, 20, 30, 40, 50};
	boolean status=true;

	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			status=false;
			break;
		}
	}
	System.out.println(status);

	}

}
