package com.javapackage;

public class Positions {
	static int a=6657;
	int t;
 public static void main(String[] args) {
	 Positions s=new Positions();
	 int c=a/1000;
	 s.t=a%1000;
	 int p=a/2000;
     int h=a%2000;
     int k=h/500;
     int l=h%500;
     int o=l/10;
     int n=l%10;
     System.out.println("thousands="+c);
	 System.out.println(s.t);
	 System.out.println("2000notes="+p);
	 System.out.println("500 Notes="+h);
	 System.out.println(k);
	 System.out.println(l);
	 System.out.println(o);
	 System.out.println(n);
	 int d=s.t/100;
	 s.t=s.t%100;
	 System.out.println("thousands="+d);
	 System.out.println(s.t);
	 int m=s.t/10;
	 s.t=s.t%10;
	 System.out.println("tens="+m);
	 System.out.println(s.t);
 }
 }
