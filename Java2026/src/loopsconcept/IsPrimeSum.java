package loopsconcept;

import java.util.Scanner;

public class IsPrimeSum {

	static boolean isprime(int n) {

		if (n < 2) {
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
		int sum=0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter a prime number:");
		int a=sc.nextInt();
		System.out.println("enter b prime number: ");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++) {
			if(isprime(i)) {
				System.out.println(i+" ");
				sum = a+b;
			}
		}
		


		System.out.println("sum:"+sum);

	}

}
