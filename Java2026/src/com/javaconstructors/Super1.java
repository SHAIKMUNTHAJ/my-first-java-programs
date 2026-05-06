package com.javaconstructors;
class Animal2{
public Animal2() {
	System.out.println("no arg con called");
}
}
class Monkey extends Animal2{
	public Monkey(){
		super();
		System.out.println("no arg con calls");
	}
	
}

public class Super1 {
public static void main(String[] args) {
	Monkey m=new Monkey();
}
}
