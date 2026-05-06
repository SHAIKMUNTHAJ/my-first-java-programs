package com.oops;

class testA {
	int age = 18;

}

class testB extends testA {
	int age = 20;

	void method1() {
		System.out.println(this.age);
		System.out.println(super.age);
	}

}
class testC extends testB{
	void method1() {
		System.out.println(this.age);
		System.out.println(super.age);
	}

	
	
}

public class SingleInheitance {

	public static void main(String[] args) {
		testC b=new testC();
b.method1();
	}

}
