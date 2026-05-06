package com.javaWhileloops;

import java.util.Scanner;

public class StrongNumber {
//	static int findfact(int n) {
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;                             
//		}
//		System.out.println(fact);
//
//		return fact;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n = sc.nextInt();
//      int sum = 0;
//      int r=0;
//      int temp=n;
//
//
//while(n>0) {
//
//
//   r=n%10;
//  n=n/10;
//    sum=sum+findfact(r);
//	 
// }
//if(sum==temp) {
//	System.out.println("strong number");
//}else {
//	System.out.println("not a strong");
//}
//
//
//	}
//}
//**********************************************
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	int n = sc.nextInt();
	int temp=n;
	int sum=0;
	int r=0;
	while(n>0) {
		int fact=1;
		r=n%10;
		n=n/10;


		while(r>0) {
fact*=r--;
	}
		sum=sum+fact;
	System.out.println(fact);
	}
	if(sum==temp) {
		System.out.println("strong number");
	}else {
		System.out.println("not a strong number");
	}
}	
}

