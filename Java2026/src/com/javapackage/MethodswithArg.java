package com.javapackage;

// to print new and previous value also using without return type
public class MethodswithArg {

	public static void main(String[] args) {
		MethodswithArg s = new MethodswithArg();
		s.first(100, 200);

	}

	void first(int a, int b) {
		System.out.print("Addition of (" + a + ") (" + b + ") : ");
		int result = a + b;
		System.out.println(result);
		second(600, result);
	}

	void second(int c, int d) {
		System.out.print("subtraction of (" + c + ") (" + d + ") : ");
		int result = c - d;
		System.out.println(result);
		third(50, result);
	}

	static void third(int e, int f) {
		int result = e * f;
		System.out.println("value of third=" + result);
		fourth(40, result);
	}

	static void fourth(int m, int n) {
		int result = m % n;
		System.out.println("value of fourth=" + result);
		MethodswithArg s1 = new MethodswithArg();
		s1.seven(10, result);
	}

	void seven(int h, int k) {
		int result = h % k;
		System.out.println("value of seven=" + result);
	}
}