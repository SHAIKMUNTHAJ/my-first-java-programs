package com.javaconstructors;

public class Book {
	String bookName;
	String authorName;
	double price;
	double releasedyear;

	Book(String bookName, String authorName, double price, int releasedyear) {
		System.out.println("four arg constructor");
		this.bookName="hero";
		this.authorName="munthaj";
		this.price=700;
		this.releasedyear=2026;
		
		
	}

	Book(String bookName, String authorName, double price) {
		this("hero", "munthaj", 700, 2026);
		System.out.println("three arg constructor");
	}

	Book(String bookName, String authorName) {
		this("hero", "munthaj", 700);
		System.out.println("two arg constructor");
	}

	Book(String bookName) {
		this("hero", "munthaj");
		System.out.println("one arg constructor");
	}

	Book() {
		this("hero");
		System.out.println("no arg constructor");
	}
void show() {
	System.out.println("bookName:"+bookName);
	System.out.println("AuthorName:"+authorName);
	System.out.println("price:"+price);
	System.out.println("releaseyear:"+releasedyear);

}
	

	public static void main(String[] args) {
		Book b = new Book();
	b.show();	
	}

}
