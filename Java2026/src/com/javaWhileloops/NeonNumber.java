package com.javaWhileloops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
         System.out.println("enter a number:");
         int n=sc.nextInt();
         int temp=n;
         int r=0;
         int sum=0;
         int square=n*n;
         

         
 
while(square!=0) {
	r=square%10;
	square=square/10;
	
	sum=sum+r;

}
System.out.println(sum);
 if(sum==temp) {
	 System.out.println(" The given is neon number");
 }else {
	 System.out.println("the given number is not a neon number");
 }
	}

}
