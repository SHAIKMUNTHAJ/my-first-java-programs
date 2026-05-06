package com.ArrayWith2D;

public class SumOfTheElemts {
//	Find total sum of all elements in matrix
	public static void main(String[] args) {
int arr[][]= {{10,23,45},{34,56,74},{68,78}};
int sum=0;
for(int [] number :arr) {
	for(int valuse:number) {
		sum=sum+valuse;
		System.out.println(valuse); 
	
	}
}
System.out.println(sum);

	}

}
