package com.arrays;

public class ReverseEachElement {

	public static void main(String[] args) {
int arr[]= {11,12,13,14,15,16};

for(int i=0;i<arr.length;i++) {
	int num=arr[i];
	int rev=0;
	int r=0;
	while(num>0) {
		 r=num%10;
		num=num/10;
		rev=rev*10+r;
	}
	System.out.print(rev+" ");
}
System.out.println();
	}

}
