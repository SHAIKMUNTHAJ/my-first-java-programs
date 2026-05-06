package com.arrays;

public class DecimalToBinary {

	public static void main(String[] args) {

int []n= {10,30,20,45};
String rev="";
int r=0;
for(int arr:n) {
	int temp=arr;

while(temp!=0) {
	r=temp%2;
	temp=temp/2;
	
	rev=r+rev;
}

System.out.print(" "+rev);

	}
	System.out.println();
	}





}

