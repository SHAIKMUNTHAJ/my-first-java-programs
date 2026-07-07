package com.tasks;
//2. Given an array of integers, find the third largest distinct element.
//Example:
//Input:
//arr = [10, 20, 4, 45, 99]
//Output:
//20
//Constraint:
//Do not sort the array
//Time Complexity: O(n)
public class ThirdLargestElement {

	public static void main(String[] args) {
	int arr[]= {10, 20, 4, 45, 99};
	int largest=Integer.MIN_VALUE;
	int second=Integer.MIN_VALUE;
	int third=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		
if(arr[i]>largest) {
	third=second;
	second=largest;
	largest=arr[i];
}else if(arr[i]>second ) {
	second=largest;
	largest=arr[i];
}else if(arr[i]>third && arr[i]!=largest && arr[i]!=second) {
	third=arr[i];
}
	}
System.out.println(third);
}
}