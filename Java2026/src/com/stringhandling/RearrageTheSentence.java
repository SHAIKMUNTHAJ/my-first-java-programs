package com.stringhandling;
//Write a Java program to arrange the words in a sentence according to the number 
//attached to each word and print the sentence after removing the numbers.
//Input: "going4 to3 Hyderabad5 I1 am2"
//Output: "I am to going Hyderabad"
//split(" ") → splits the sentence into words.
//charAt(word.length()-1) → gets the last character (the number).
//- '0' → converts the character into an integer.
//substring(0, word.length()-1) → removes the last number.
public class RearrageTheSentence {

	public static void main(String[] args) {
		 String str = "going4 to3 Hyderabad5 I1 am2";
		 String []arr=str.split(" ");
		 String []result=new String[arr.length];
		 for(String word:arr) {
			 int n=word.charAt(word.length()-1)-'0';
			 result[n-1]=word.substring(0,word.length()-1);
		 }
for(String word:result) {
	System.out.print(word+" ");
}
	}

}
