package com.ArrayWith2D;

public class leftRightDiagonalSum {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int lsum = 0;
		int rsum = 0;
		for (int i = 0; i < arr.length; i++) {

			lsum = lsum + arr[i][i];
//					System.out.print(arr[i][j]+" ");

		}

		System.out.println("left row sum:" + lsum);
		for (int i = 0; i < arr.length; i++) {

			rsum = rsum + arr[i][arr.length - 1 - i];

		}

		System.out.println("right row sum"+rsum);

	}

}
