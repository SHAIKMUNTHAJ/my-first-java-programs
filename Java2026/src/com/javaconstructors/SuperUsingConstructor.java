package com.javaconstructors;

class Animal{
	String sname="puppy";
	void show() {
		System.out.println("Animal:"+sname);
	}
	
}
class Dog extends Animal{
	String sname="sweety";

void show() {
	System.out.println("dog:"+this.sname);
}
//Cannot use super in a static context
//static void display() {
//	System.out.println(super.sname);
//}
}
public class SuperUsingConstructor {
	public static void main(String[] args) {
Dog d=new Dog();
//System.out.println(d.sname);
d.show();

	}

}
