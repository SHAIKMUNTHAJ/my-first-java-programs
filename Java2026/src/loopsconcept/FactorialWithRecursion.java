package loopsconcept;

import java.util.Scanner;
//Range of int: -2,147,483,648 to 2,147,483,647
//after cross this range we will get int overflow error that means it returns
//0 or negative values
public class FactorialWithRecursion {
static int findfact(int n) {
	int fact=1;
	if(n==1) {
		return 1;
	}

	return n* findfact(n-1);
}



public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
	int fact=findfact( n);
	System.out.println(fact);
	sc.close();
}
}
