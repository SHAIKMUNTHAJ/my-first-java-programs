package com.tasks;

//1. An element is called a leader if it is greater than all elements to its right.
//Example:
//Input:
//arr = [16, 17, 4, 3, 5, 2]
//Output:
//17 5 2
//Constraint:
//Time Complexity: O(n)
public class leaderElementsRight {

	public static void main(String[] args) {
		int arr[] = { 16, 17, 4, 3, 5, 2 };
		int lead = arr[arr.length - 1];
		int[] temp = new int[arr.length];
		int j = 0;
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] >= lead) {
             lead = arr[i];
				temp[j] = lead;
				j++;
			}
		}
		for (int i = temp.length-1; i >= 0; i--) {
//			System.out.println(temp[i]);
		
    if(temp[i]!=0) {
    	System.out.println(temp[i]);
    }	
    }
	}
}
