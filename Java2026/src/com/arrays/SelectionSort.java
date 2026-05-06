package com.arrays;
//input=24,53,5,4,8,4;
//output=4,4,5,8,24,53;
//take the smallest element and swap the number

public class SelectionSort {

	public static void main(String[] args) {

int arr []= {24,53,5,4,8,4};
int temp=0;
for(int i=0;i<arr.length;i++) {
	int minIndex=i;
	for(int j=i+1;j<arr.length;j++) {
		if(arr[j]<arr[minIndex]) {
			minIndex=j;
			
		}
	}
	temp=arr[minIndex];
	arr[minIndex]=arr[i];
	arr[i]=temp;
	
}
System.out.println("after sorting:");
for (int n:arr) {
	System.out.println(n);
}

	}

}
