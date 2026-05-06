package com.Patterns;

public class Hallo {
	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
//				if(i<=1 && j<=4 && i<=4 && j<=1) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}

				if (i == 0 || i == 5 || j == 0 || j == 5) {
					System.out.print(" *");

				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}
	}

}
