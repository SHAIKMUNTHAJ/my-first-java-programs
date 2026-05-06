package loopsconcept;

import java.util.Scanner;

public class PrimeOrNot {
	static void findfact(int n){
		boolean status = true;
		if(n==0 || n==1) {
			return ;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				status = false;
				break;
			}
		}
		if(status) {
			System.out.println("it is a prime number");
			
		}else {
			System.out.println("it is not a prime number");
		}		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		System.out.println(findfact( n));


	}
}
