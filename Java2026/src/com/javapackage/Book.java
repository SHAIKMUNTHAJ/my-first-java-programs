package com.javapackage;

public class Book {
	int bookid;
	String title;
	String author;
	int price;
	double discount; 
	double discountprice;
	double total;
 public static void main(String[] args) {
	 Book b=new Book();
	 b.bookid=1234;
	 b.title="believe ur self";
	 b.author="munthaj";
	 b.price=200;
	 b.discount=0.1;
	 b.discountprice=b.price*b.discount;
	 System.out.println(b.bookid);
	 System.out.println(b.title);
	 System.out.println(b.author);
	 System.out.println("discount price="+b.discountprice);
	 System.out.println("actual price="+(b.price-b.discountprice));
}
}
