package com.javaWhileloops;
//WAP to check the given number is amstrong or not??
//input=153
//1^3+5^3+3^3
//=1+125+27=153
//output =153 this is amstrong number
import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int n=sc.nextInt();
        int temp=n;
        int r=0;
        int sum=0;
        String sm=Integer.toString(n);
        int countdigit=sm.length();
        while(n>0) {
        	r=n%10;
        	n=n/10;
        	sum=(int) (sum+Math.pow(r, countdigit));
        }
        
 if(sum==temp) {
	 System.out.println("the given number is amstrong");
 }else {
	 System.out.println("the given number not a amstrong");
 }
	}

}
