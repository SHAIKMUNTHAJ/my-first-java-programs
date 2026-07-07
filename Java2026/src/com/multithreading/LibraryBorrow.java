package com.multithreading;
//Write a Java program using the Runnable interface to create 3 threads
//representing books borrowed from a library. Each thread should display
//the book title and the number of days it was borrowed. If a book is 
//returned after more than 7 days, calculate and display a fine of ₹10 per extra 
//day; otherwise, display "No Fine". Start all three threads simultaneously and
//display the details for each book.
//Requirements:
//1.Book 1: Java Basics – 10 days
//2.Book 2: Data Structures – 5 days
//3.Book 3: Spring Boot – 12 days
//4.Fine = ₹10 per day after the first 7 days
//Use the Runnable interface.
//5.Create and start 3 threads simultaneously.

	
	class JavaBasics implements Runnable{

		@Override
		public void run() {
			String booknames="java";
		int days=10;
		System.out.println("bookname is :"+booknames);
		System.out.println("days:"+days);
			if(days>7) {
				int fine=(days-7)*10;
				System.out.println("fine:"+fine);
			}else {
				System.out.println("not fine");
			}
		}
		
	}
	class DataStructure implements Runnable{

		@Override
		public void run() {
			String booknames="datastructure";
			int days=5;
			if(days>7) {
				int fine=(days-7)*10;
				System.out.println("fine:"+fine);
			}else {
				System.out.println("not fine");
			}
			
		}
		
	}
	class SpringBoot implements Runnable{

		@Override
		public void run() {
			String booknames="SpringBoot";
			int days=12;
			if(days>7) {
				int fine=(days-7)*10;
				System.out.println("fine:"+fine);
			}else {
				System.out.println("not fine");
			}
			
		}
		
			
		}
		
	
	public class LibraryBorrow {
	public static void main(String[] args) {
		JavaBasics j=new JavaBasics();
		Thread t=new Thread(j);
		t.start();
		DataStructure d= new DataStructure();
		Thread t1=new Thread(d);
		t1.start();
		SpringBoot s=new SpringBoot();
		Thread t2=new Thread(s);
		t2.start();
		
	

	}

}
