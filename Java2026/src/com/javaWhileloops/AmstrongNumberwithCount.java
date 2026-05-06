package com.javaWhileloops;

import java.util.Scanner;
//input=153;
//1^3+5^3+3^3=
//1+125+27=153
//output=153;
public class AmstrongNumberwithCount {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
        int n1=n;
        int temp=n;
        int r=0;
        int count=0;
        int sum=0;
//        System.out.println(Math.pow(3, 2));
        while(n>0) {
        	r=n%10;
        	n=n/10;
        	count++;
        	
        }
        while(n1>0) {
        	r=n1%10;
        	n1=n1/10;
        	sum=(int)(sum+Math.pow(r, count));
        	
        }
        if(sum==temp) {
        	System.out.println("the given number is a Amstrong");
        }else {
        	System.out.println("the given number is not a amstrongs");
        }
	}

}
