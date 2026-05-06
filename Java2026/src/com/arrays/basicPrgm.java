package com.arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class basicPrgm {

	public static void main(String[] args) {
// declaration:
//		int [] args;
//		creation:
//	BigInteger [] numbers=new BigInteger[3];//Array size → depends on memory, NOT data type
//		reprentation://Large arrays → cause OutOfMemoryError
//		  numbers[0]=BigInteger.valueOf(10);
//		  numbers[1]=BigInteger.valueOf(20);
//		  numbers[2]=BigInteger.valueOf(30);
//-----------------------------
		Scanner sc = new Scanner(System.in);




		float[] age = new float[4];
		for(int i=0;i<age.length;i++) {
			System.out.println("enter a value:");
			age[i]=sc.nextFloat();
		}



		for (int i = 0; i < age.length; i++) {
			System.out.println (age[i]);
		}

	}

}
