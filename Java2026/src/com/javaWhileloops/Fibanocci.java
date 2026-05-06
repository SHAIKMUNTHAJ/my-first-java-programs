package com.javaWhileloops;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {

		System.out.println("main method start");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter where you want to start:");
		int n = sc.nextInt();
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.println(n1 +" "+n2);
        for(int i=1;i<n;i++) {
           n3=n1+n2;
        	System.out.println(" "+n3);
        	n1=n2;
        	n2=n3;
        }


	}

}
