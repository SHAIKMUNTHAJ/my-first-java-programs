package loopsconcept;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
System.out.println("fact of a number:"+fact);
	}

}
