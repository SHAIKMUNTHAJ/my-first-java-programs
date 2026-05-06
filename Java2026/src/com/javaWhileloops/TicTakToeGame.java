package com.javaWhileloops;

import java.util.Scanner;

public class TicTakToeGame {
	private static char Currentplayer='X';
	static char [][]board=new char[3][3];
	public static void main(String[] args) {
 	Scanner sc=new Scanner(System.in);
//	System.out.println("enter rows:");
//	int row=sc.nextInt();
	initialization();
	while(true) {
	
	printboard();
	 System.out.println("player "+Currentplayer+"enter row value:");
	 int row=sc.nextInt();
	 System.out.println("player "+Currentplayer+"enter Column value:");
	 int column=sc.nextInt();
	board[row][column]=Currentplayer;
	if (towin()) {
	    printboard();
	    System.out.println("Player " + Currentplayer + " wins!");
	    break;
	}
	if(boardfull()) {
		printboard();
		System.out.println("game Draw");
	}
	Currentplayer=(Currentplayer=='X')?'O':'X';
	
	}
	}
	
static void initialization() {	
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		board[i][j]=' ';
	}
}
}
static void printboard() {
	System.out.println("------------");
	for(int i=0;i<3;i++) {
		System.out.print("|");
	
	for(int j=0;j<3;j++) {
		System.out.print(board[i][j]+" | ");
	}
	System.out.println();
	
		System.out.println("-------------");
	}

  }

static boolean winrow() {
	for(int i=0;i<3;i++) {
		if(board[i][0]==Currentplayer &&
				board[i][1]==Currentplayer &&
				board[i][2]==Currentplayer) {
			return true;
		}
	}
	return false;
}
	static boolean wincol() {
		for(int i=0;i<3;i++) {
			if(board[0][i]==Currentplayer &&
					board[1][i]==Currentplayer &&
					board[2][i]==Currentplayer) {
				return true;
			}
		
		}
		return false;
	}
	static boolean windig() {
		for(int i=0;i<3;i++) {
			
				if(board[0][0]==Currentplayer &&
				board[1][1]==Currentplayer &&
				board[2][2]==Currentplayer) {
			return true;
				}
		
			if(board[0][2]==Currentplayer &&
					board[1][1]==Currentplayer &&
					board[2][0]==Currentplayer) {
				return true;
			}
		
			}
		return false;
		}
	
	static boolean towin(){
		if(winrow()||wincol()||windig()) {
		return true;
			 
		}
		return false;
	}
	
	static boolean boardfull() {
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				board[i][j]=' ';
				return false;
			}
		}
		return true;
	}
	
}
		
	
		
	


 



