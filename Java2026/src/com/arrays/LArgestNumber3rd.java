package com.arrays;

public class LArgestNumber3rd {

	public static void main(String[] args) {

int arr[]= {2,43,45,76,71,47,90,65};
int max=arr[0];
int second=arr[0];
int third=arr[0];
for(int i=0;i<arr.length;i++) {
if(arr[i]>max) {
	third=second;
	second=max;
	max=arr[i];
	
}else if(arr[i]>second && second!=0) {
	third=second;
	second=arr[i];
	
	
}else if(second>third && third!=0) {
	third=arr[i];
}
}
System.out.println(third);
System.out.println(second);
System.out.println(max);

	}

}
