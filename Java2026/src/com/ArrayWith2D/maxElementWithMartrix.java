package com.ArrayWith2D;

public class maxElementWithMartrix {

	public static void main(String[] args) {

int arr[][]= {{34,45,64},{43,89,54},{34,9,80}};
int max=arr[0][0];
int min=arr[0][0];
for(int []row:arr) {
	for(int value:row) {

if(value>max) {
	max=value;
}else if(value<min) {
	min=value;
}
	}
}

//for(int i=0;i<arr.length;i++) {
//	for(int j=0;j<arr[i].length;j++) {
//		if(arr[i][j]>max) {
//			max=arr[i][ij];
//		}else if(arr[i][j]<min) {
//			min=arr[i][j];
//		}
//		
//	}
//	
//}
System.out.println(max);
System.out.println(min);

	}

}
