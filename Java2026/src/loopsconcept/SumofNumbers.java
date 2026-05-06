package loopsconcept;

import java.util.Scanner;

public class SumofNumbers {

	static void printsum(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			System.out.println(i);

			sum = sum + i;
			System.out.println("sum of three numbers:" + sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number here!!:");
		int num = sc.nextInt();
		printsum(num);

		sc.close();
	}

}
