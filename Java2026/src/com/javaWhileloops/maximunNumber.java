package com.javaWhileloops;

import java.util.Scanner;

public class maximunNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();
		int max=0;
		int r=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
		
//	if(r<max)-->it gives min number in the input(smallest number)	
      if(r>max) {
    	  max=r;
    	  
      }
		}
      System.out.println(max);
	}

}
