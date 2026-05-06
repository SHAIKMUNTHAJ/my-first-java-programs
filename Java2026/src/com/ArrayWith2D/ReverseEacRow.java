package com.ArrayWith2D;

public class ReverseEacRow {

	public static void main(String[] args) {

		int arr[][]= {{1,2,3},
			           {4,5,6},
			           {7,8,9}};
		int rev=0;
		for(int i = 0; i <arr.length; i++) {
		    for(int j =arr.length-1; j >=0; j--) {
		    System.out.print(arr[i][j]+" ");

	}
		    System.out.println();

}
	}
	}
