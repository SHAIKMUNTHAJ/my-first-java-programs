package com.arrays;

public class SumOfArray {

	public static void main(String[] args) {
// int sum=0;
// int avg=0;
//int numbers[]= {20,38,389,39};
//for(int i=0;i<numbers.length;i++) {
//	sum=sum+numbers[i];
// }
//avg=(sum/numbers.length);
//System.out.println(sum);
//System.out.println(avg);
//	}
	int arr[][] = {
		    {1,2,3},
		    {4,5,6},
		    {7,8,9}
		};

		int sum = 0;
		for(int i=0;i<arr.length;i++){
		    sum += arr[i][i];
		}
		System.out.println(sum);
}
}
