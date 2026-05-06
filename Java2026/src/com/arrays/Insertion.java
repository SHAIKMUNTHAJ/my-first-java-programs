package com.arrays;

public class Insertion {
	public static void main(String[] args) {
		int arr[]= {23,4,1,6};
		int temp,j;
		for(int i=0;i<arr.length;i++) {
			temp=arr[i];
			j=i;
			while(j>0 && arr[j-1]>temp) {
				arr[j]=arr[j-1];
				j=j-1;
			}
			arr[j]=temp;
		}
		for(int n:arr) {
			System.out.println(n);
		}
	}

}
