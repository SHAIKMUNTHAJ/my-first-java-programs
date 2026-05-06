package com.javapackage;

//byte-->short-->int-->float-->long-->double
public class Datatypes1 {
	public static void main(String[] args) {
		float a = 02345f;

		// Type mismatch: cannot convert from double to float
		// float b=0123.5;
		float c = 123.5F;
		float d = 123F;
		float e = 0x123;
		// Invalid hex literal number
		// doesn't take two values hex and decimal
		// float f=0x123.5;
		// float g=0x123.5f;
		float h = 0x123f;
		float i = 012345.6F;

		System.out.println(a);
		// System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		// System.out.println(f);
		// System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		int a1 = 0123;
		System.out.println(a1);
		int a2 = 0674;
		System.out.println(a2);
		// we are giving value to binary must starts with 0b
		int a3 = 0b0011;
		System.out.println(a3);
		int a4 = 0Xabc;
		System.out.println(a4);
		char s = 'A';
		System.out.println(s);
		// boolean
		boolean bo = true;
		System.out.println(bo);
		double m = 0234;
		System.out.println(m);
		long p = 0b0101;
		System.out.println(p);
		String s1 = "munthaj";
		System.out.println(s1);
		String s2 = new String("its my dream");
		System.out.println(s2);
	}
}
