package com.arrays;

import java.util.Scanner;

public class StartingEndingLetter {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in) ;
	System.out.println("enter a size :");
	int size=sc.nextInt();
	int [] arr=new int[size] ;
	System.out.println("enter the Names:");
	for(int i=0;i<size;i++) {
		arr[i]=sc.nextInt();
		
	}
	for(int str:arr) {
		if(int.toLowerCase().startsWith("s")||(int.endsWith("j"))) {
			System.out.println(str);
		}
		
	}


	}

}
