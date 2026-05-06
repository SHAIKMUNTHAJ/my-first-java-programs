package com.javapackage;

public class MiddleNumber {
	static int a = 786;
	int d;
	int d1;
	int d2;
	int p;

	public static void main(String[] args) {
		MiddleNumber s = new MiddleNumber();

//	 a=786
//	
//			 100)786(7 -> /
//				 700
//				-------
//				  86 -> %
//	 10)86(8 -> /
//	    80
//	  -------
//	     6 -> %

		s.d1 = a % 100;
		s.d2 = s.d1 / 10;

		System.out.println(s.d1);
		System.out.println(s.d2);
	}
}
