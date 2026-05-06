package loopsconcept;

import java.util.Scanner;

public class EvenOddnUMBERS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your value:");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println("even number are:");
				System.out.println(i + " ");
			}

		}

		System.out.println("********************");

		// -------------------------------------------------
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1) {
				System.out.println("odd number are:");
				System.out.println(i + " ");
			}
		}
		sc.close();
	}

}
