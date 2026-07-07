package com.tasks;
//2. Given an array of integers, find the second largest element.
//Example:
//Input:
//arr = [12, 45, 67, 23, 89, 54]
//Output:
//67
public class SecondLargestElement {

	public static void main(String[] args) {
	int arr[]= {12, 45, 67, 23, 89, 54};
	int largest =arr[0];
	int secondlarge=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>largest) {
			secondlarge=largest;
			largest=arr[i];
		}
	}
		for( int i=0;i<arr.length;i++) {
			if(arr[i]>secondlarge && arr[i]!=largest) {
				secondlarge=arr[i];
			}
		}
	
	System.out.println("secondlaregst element:"+secondlarge);
	}
}
