package com.arrays;

public class ArraySorted {

	public static void main(String[] args) {

int arr[]= {1,3,5,6,7};
boolean issorted=true;
for(int i=0;i<arr.length-1;i++) {
	if(arr[i]>arr[i+1]) {
 issorted=false;
 break;

	}
}
if(issorted) {
	System.out.println("sorted");
}else {
	System.out.println("not sorted");
}

	}

}
