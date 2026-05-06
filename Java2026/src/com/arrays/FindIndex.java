package com.arrays;

public class FindIndex {

	public static void main(String[] args) {

int arr[]= {10,20,3,45,56};
int key=3;
int index=-1;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==key) {
		index=i;
		break;
	}
}
System.out.println(" index of the element:"+index);
	}

}
