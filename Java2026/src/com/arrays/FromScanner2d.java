package com.arrays;

import java.util.Scanner;

public class FromScanner2d {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a rows:");
		int rows=sc.nextInt();
		System.out.println(" enter a col:");
		int col=sc.nextInt();
		int arr[][]=new int[rows][col];
		System.out.println("enter the elements"); 

 for(int i=0;i<rows;i++) {
	 for(int j=0;j<col;j++) {
	 arr[i][j]=sc.nextInt();
	 }
 }
 
for(int i=0;i<rows;i++) {
	for(int j=0;j<col;j++) {
		System.out.print(arr[i][j] +" ");
	}
	System.out.println();

}



	}


}
