package com.javapackage;
import java.util.Scanner;
public class MethodSum {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a and b values:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("enter c and d values:");
	int c=sc.nextInt();
	int d=sc.nextInt();
	int sum1=method1(a,b);
	int sum2=method1(c,d);
	System.out.println("sum of two methods are:"+(sum1+sum2));

	}
 static int method1(int a,int b) {
	 return a+b;
 }
 static int method2(int c,int d) {
	 return c+d;
 }
}
