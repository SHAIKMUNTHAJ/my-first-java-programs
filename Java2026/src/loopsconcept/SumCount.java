package loopsconcept;

import java.util.Scanner;

public class SumCount {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter a number:");
//		int n = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
				evenCount = evenCount + 1;
			} else {
				oddSum = oddSum + i;
				oddCount = oddCount + 1;
			}

		}

		System.out.println("sum of the even numbers are:" + evenSum);
		System.out.println("count of the even numbers are:" + evenCount);
		System.out.println("**************************");
		System.out.println("sum of the given numers of odd:" + oddSum);
		System.out.println("count of the given numbers of odd:" + oddCount);
	}

}
