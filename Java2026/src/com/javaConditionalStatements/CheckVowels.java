package com.javaConditionalStatements;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your  number:");
		String s=sc.next();
		if(s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u")) { 
			System.out.println(" Given letter vowel"); 
		}else {
			System.out.println("not vowel");
		}

	}

}
