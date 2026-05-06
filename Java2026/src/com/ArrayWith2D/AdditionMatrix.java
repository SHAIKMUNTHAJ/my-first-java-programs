package com.ArrayWith2D;
//addition matrix
public class AdditionMatrix {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},
	           {4,5,6},
	           {7,8,9}};
	int result[][]=new int[arr.length][arr[0].length];

for(int i = 0; i <arr.length; i++) {
 for(int j =0; j<arr[i].length; j++) {
 result[i][j]=arr[i][j]*arr[i][j];


 System.out.print(result[i][j]+" ");
 }
 System.out.println();
}
}
}