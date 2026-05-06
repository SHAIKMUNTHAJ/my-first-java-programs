package loopsconcept;

import java.util.Scanner;

public class Count1tonNumbers {

	public static void main(String[] args) {

		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		int num=sc.nextInt();
		for (int i = 1; i < num; i++) {
			System.out.println(i);
			count++;
		}
		System.out.println("total number of count is:" + count);
	}

}
