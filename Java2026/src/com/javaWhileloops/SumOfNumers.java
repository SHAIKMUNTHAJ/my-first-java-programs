package com.javaWhileloops;

public class SumOfNumers {

	public static void main(String[] args) {
int sum=0;
int n=456;
int r=0;

while(n!=0) {
	r=n%10;
	n=n/10;
	sum=sum+r;
	
}
System.out.println(sum);
	}

}
