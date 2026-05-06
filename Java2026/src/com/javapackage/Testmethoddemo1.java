package com.javapackage;

public class Testmethoddemo1 {
	static void addition() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
  void subtraction() {
	 int a=10;
	 int b=20;
	 System.out.println(a-b);
 }
  void multiplication() {
	  int a=10;
		 int b=20;
		 System.out.println(a*b);
  }
//  division gives quotient
		 void divison() {
			  int a=10;
				 int b=20;
				 System.out.println(a/b);
		 }		 
//	module gives reminder 
static	 void module() {
					  int a=10;
						 int b=20;
						 System.out.println(a%b);
					 
				 }

  
	public static void main(String[] args) {
		System.out.println("main method started");
		Testmethoddemo1 s=new Testmethoddemo1();
		addition();
		s.subtraction();
		s.multiplication();
		s.divison();
		module();

	}

}
