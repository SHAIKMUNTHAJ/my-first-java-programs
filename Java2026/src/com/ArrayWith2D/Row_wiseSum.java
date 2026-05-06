package com.ArrayWith2D;
//Row-wise sum
public class Row_wiseSum {
	public static void main(String[] args) {
		int [][] arr= {{1,22,3},{4,5,6},{7,8,9}
		};
		for(int []row:arr) {
			int sum=0;
			for(int value:row) {
				
				sum=sum+value;


			}
		System.out.println(sum);
		}


	}

}
