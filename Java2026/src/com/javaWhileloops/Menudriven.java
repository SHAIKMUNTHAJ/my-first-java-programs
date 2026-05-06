package com.javaWhileloops;

import java.util.Scanner;

public class Menudriven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;

		while(true){
		    System.out.println("1.Add 2.Exit");
		    choice = sc.nextInt();

		    if(choice == 1){
		        System.out.println("Addition selected");
		    }
		    else if(choice == 2){
		        break;
		    }
		    else{
		        System.out.println("Invalid choice");
		    }
		}
		}

	}


