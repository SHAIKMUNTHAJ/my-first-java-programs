package com.arrays;

import java.util.Scanner;

public class DuplicateAndMisssing {

	public static void main(String[] args) {

Scanner sc =new Scanner (System.in);
System.out.println("enter the size");
int size=sc.nextInt();
int arr[]=new int[size];
 System.out.println("enter the elements:");
 for(int i=0;i<size;i++) {
	  arr [i]=sc.nextInt();
	 
 }
 System.out.println("enter the max value:");
 int max=sc.nextInt();
 
 int count[]=new int[max+1];
//  for(int i=0;i<arr.length;i++) {
//	  if(arr[i]<max) {
//		  count[arr[i]]++;
//	  }
//  }
 for(int num:arr) {
	 if(num<max) {
		 count[num]++;
	 }
 }
 System.out.println("missing the values are:");
 for(int i=0;i<=max;i++) {
	 if(count[i]==0) {
		 System.out.println(i+" ");
	 }
 }
 System.out.println("duplicate values are: ");
 for(int i=0;i<max;i++) {
	 if(count[i]>0) {
		 System.out.println(i+" ");
	 }
 }
   
	}

}
