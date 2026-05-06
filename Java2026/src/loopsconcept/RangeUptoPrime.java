package loopsconcept;

import java.util.Scanner;

public class RangeUptoPrime {
	static boolean isprime(int n) {

		if (n == 0 || n == 1) {
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
		System.out.println("enter a first number:");
		int a = sc.nextInt();
		
		int b;
		int sum = 0;

		while (a >= 0) {

			if (isprime(a)) {
				System.out.println(a + " ");
break;
			}else {
				System.out.println("not prime");
			}
			sum=sum+a;
		}
		System.out.println("sum of the peime numbers:" + sum);

	}
}
