package com.arrays;

public class BubbleSort {

	public static void main(String[] args) {

int arr[]= {23,4,6,1,7};
int temp=0;
for(int i=0;i<arr.length;i++) {
	for(int j=0;j<arr.length-i-1;j++) {
		if(arr[j]>arr[j+1]) {
			temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		
	}
}
	System.out.println("after sorting:");
	for(int n:arr) {
		System.out.println(n);
	
}

	}

}
