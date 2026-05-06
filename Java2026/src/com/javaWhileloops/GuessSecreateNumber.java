package com.javaWhileloops;

import java.util.Scanner;

public class GuessSecreateNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int guessNumber=sc.nextInt();
 int screateNumber=10;
 
 while(true) {
	 if(guessNumber==screateNumber) {
		 System.out.println("greatt!!!and wowwww u find  screate number");
		 break;
	 }else {
		 System.out.println("uffff?? try to use ur brain plss......");
		 break;
	 }
 }


	}

}
