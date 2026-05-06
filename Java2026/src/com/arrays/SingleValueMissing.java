package com.arrays;

public class SingleValueMissing {

	public static void main(String[] args) {

int arr[]= {1,2,4,5};
int n=5;
int expectedsum=n*(n+1)/2;
int actualsum=0;
for(int num:arr) {
	actualsum=actualsum+num;
}
System.out.println("misssing the number:"+ (expectedsum-actualsum));

	}

}
