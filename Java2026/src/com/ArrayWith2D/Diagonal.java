package com.ArrayWith2D;

import java.util.Scanner;
//input:
//1 2 3
//4 5 6
//7 8 9
////Primary Diagonal → 1 5 9
////Secondary Diagonal → 3 5 7
public class Diagonal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows:");
	int row=sc.nextInt();
	System.out.println("enter a columns:");
	int col=sc.nextInt();
	int [][]arr=new int [row][col];
	for(int i=0;i<row;i++) {
		for(int j=0;j<col;j++) {
			arr[i][j]=sc.nextInt();
		}
		
	}
	System.out.println(" enter the Matrix:");
	for(int i = 0; i < row; i++) {
	    for(int j = 0; j < col; j++) {
	        System.out.print(arr[i][j] + " ");
	    }
	    System.out.println(); // next line after each row
	}

	System.out.print("Primary Diagonal: ");
	for(int i = 0; i < row; i++) {
	    System.out.print(arr[i][i] + " ");//i==j
	}



	System.out.print("Secondary Diagonal: ");
	for(int i = 0; i < row; i++) {
	    System.out.print(arr[i][row - i - 1] + " ");//i+j==row-1;
	}
}
}

