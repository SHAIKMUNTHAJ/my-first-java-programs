package com.arrays;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
//		int arr []= {1,4,2,5,7,9,15};
//		int max=15;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size:");
		int size=sc.nextInt();
		int arr[]=new int[5];
		System.out.println("enter the elements:");
		for(int i=0;i<size;i++) {
			arr [i]=sc.nextInt();
		}
		
		System.out.println("enter the max number: ");
		int max=sc.nextInt();
		boolean missing []= new boolean[max+1];
		 
		 for(int num:arr) {
			 missing[num]=true;
		 }
		 for(int i=0;i<=max;i++) {
			  if(!missing[i]) {
				  System.out.println(i);
			  }
		 }

		 

	}

}
