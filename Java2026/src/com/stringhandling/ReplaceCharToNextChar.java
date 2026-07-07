package com.stringhandling;

import java.util.Scanner;

//A company wants to encode a text message by replacing each character in a string 
//with the next alphabet (e.g., a→b, b→c, ..., z→a). Write a program using string
//operations to encode the given string.
//Input: "abc" → Output: "bcd"
//Input: "xyz" → Output: "yza"
public class ReplaceCharToNextChar {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter your string");
	String str=sc.next();
	String result="";
	for(int i=0;i<str.length();i++) {
		char ch=str.charAt(i);
		if(ch=='z') {
			result=result+'a';
		}else if(ch=='Z') {
			result=result+'A';
			
		}else {
			result=result+(char)(ch+1);
		}
	}
	
	System.out.println("originalstring:"+str);
	System.out.println("encoded string:"+result);

	}

}
