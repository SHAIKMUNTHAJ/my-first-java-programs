package com.tasks;

import java.util.Arrays;

//2. Given a sorted array, rearrange it in max-min form.
//Example:
//Input:
//arr = [1, 2, 3, 4, 5, 6]
//Output:
//[6, 1, 5, 2, 4, 3]
public class RearrangeMaxMin {

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, 4, 5, 6};
		int left=0;
		int right=arr.length-1;
		int temp[]=new int[arr.length];
		int index=0;
		while(left<=right) {
			temp[index]=arr[right];
			index++;
			right--;
			
				if(left<=right) {
			temp[index]=arr[left];
			index++;
			left++;
		
				}
		}
		 System.out.println(Arrays.toString(temp));
	}

}
