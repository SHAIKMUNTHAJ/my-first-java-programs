package com.arrays;

public class EvenOddCount {

	public static void main(String[] args) {

		int[] numbers = new int[9];

		numbers[0] = 10;
		numbers[1] = 26;
		numbers[2] = 15;
		numbers[3] = 27;
		numbers[4] = 5;
		numbers[5] = 10;
		numbers[6] = 17;
		numbers[7] = 67;
		numbers[8] = 90;
		int evencount = 0;
		int oddcount=0;
		System.out.println("even numbers");
		for (int A : numbers) {

			if (A % 2 == 0 && A != 0) {
				evencount++;
				System.out.println(A);
			
			}
		}
			System.out.println("odd numbers");
			for(int A:numbers) {
			if(A%2!=0) {
				oddcount++;
				System.out.println(A);
			}
			

		}
		System.out.println("count of the even numbers:"+evencount);
		System.out.println(" count of the odd numbers:"+oddcount);



	}

}
