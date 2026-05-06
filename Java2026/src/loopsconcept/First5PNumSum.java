package loopsconcept;

import java.util.Scanner;

public class First5PNumSum {
	static boolean isprime(int n) {

		if (n <= 0 && n == 1) {
			return false;
		}

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int a = sc.nextInt();
		System.out.println("enter b  number:");
		int b = sc.nextInt();

//		int evenSum = 0;
//		int oddSum = 0;
		int sum=0;
		int count=0;
		for (int i = a; i <= b && count<5; i++) {
			if (isprime(i)) {
				sum=sum+i;
				count++;
//				if (i % 2 == 0) {
//					System.out.println("even numbers:" + i);
//					evenSum = evenSum + i;
//				} else {
//					System.out.println("odd numbers" + i);
//					oddSum = oddSum + i;
//				}

			}
		}

//		System.out.println(evenSum);
//		System.out.println(oddSum);
		System.out.println(sum);
		
		if(sum%2==0) {
			System.out.println("sumof even"+sum);
		}

	}

}
