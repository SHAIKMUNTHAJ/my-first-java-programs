package com.javaWhileloops;

//WAP to the given is  palindrom or not?
import java.util.Scanner;

public class Palindrom {
	static boolean ispalindrom(int n) {
		int r = 0;
		int rev = 0;
		int temp = n;
		while (n != 0) {
			r = n % 10;
			n = n / 10;
			rev = rev * 10 + r;
		}
		System.out.println(" the reverse number is:" + rev);
		if (temp == rev) {

			return true;
		} else {

			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println("main method start");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = sc.nextInt();

		boolean palindrom = ispalindrom(n);
		if (palindrom) {
			System.out.println("the given number is a palindromuuuu");
		} else {

			System.out.println("the given number is not a palindromuuu");

		}
	}
}
