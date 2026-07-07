package com.tasks;
//1. Given an unsorted array of integers, sort the array in ascending order using the Selection Sort algorithm.
//Example:
//Input:
//arr = [64, 25, 12, 22, 11]
//Output:
//[11, 12, 22, 25, 64]
//Constraint:
//Use Selection Sort
//Do not use Collections.sort() or Arrays.sort()
public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {64, 25, 12, 22, 11};
	int temp=0;
		for(int i=0;i<arr.length;i++) {
			int minindex=i;
			for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[minindex] ){
				minindex=j;
			}
			
		}
			temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
			
		}
		for(int n:arr) {
		System.out.println("sorted array:"+n);
		}
	}

}
