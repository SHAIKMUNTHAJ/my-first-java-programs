package com.arrays;

import java.util.Scanner;

//left -->right:12345;
//output:45123
//right-->left:12345;
//output:34512

public class ArrayRotation {
	static void rotationarray( int arr [], int start,int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	static void arrayrotation(int arr[], int r) {
		int start=0;
		int end =arr.length-1;
		rotationarray(arr,start,end);
		rotationarray(arr,start,r-1);
		rotationarray(arr,r,end);
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rotation number:");
		int r=sc.nextInt();
		
		arrayrotation(arr,r);
		for(int n:arr) {
			System.out.println(n);
		}

System.out.println();



	}

}
