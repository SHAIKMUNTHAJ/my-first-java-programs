package com.Patterns;
//inpiut : 4
//ouput:
//     1 
//    1  1 
//  1  2  1 
// 1  3  3  1 
//1  4  6  4 1

public class additionOfMiddle {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			int num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(num +" ");
				num=num*(i-k)/(k+1);
			}

			System.out.println();

		}
	}
}
