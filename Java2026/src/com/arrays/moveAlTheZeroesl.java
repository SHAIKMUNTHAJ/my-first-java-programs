package com.arrays;

public class moveAlTheZeroesl {

	public static void main(String[] args) {

int arr[]= {10,0,2,0,7};
int count=0;
for(int i=0;i<arr.length;i++) {
	if(arr[i]!=0) {
		arr[count]=arr[i];
		count++;
	}
}

while(count<arr.length) {
	arr[count]=0;
	count++;
}

for(int num:arr) {
	System.out.println(num+" ");
}
}



	}


