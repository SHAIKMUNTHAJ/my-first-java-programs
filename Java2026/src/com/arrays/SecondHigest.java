package com.arrays;

public class SecondHigest {

	public static void main(String[] args) {

int [] arr= {10,45,36,72,78};
int max=arr[0];
int second=arr[0];
for(int i=0;i<arr.length;i++) {
	if(arr[i]>max) {
		second=max;
		max=arr[i];
	}


}
System.out.println("maximum of thr number:"+max);
System.out.println(" second higest of the number :"+second);

	}

}
