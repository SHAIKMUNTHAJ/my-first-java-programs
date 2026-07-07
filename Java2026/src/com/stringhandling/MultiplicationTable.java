package com.stringhandling;
//Write a Java program to create three threads.
//Thread-1 should print the multiplication table of 2.
//Thread-2 should print the multiplication table of 3.
//Thread-3 should print the multiplication table of 5 simultaneously.


class Table5 implements Runnable{

	@Override
	public void run() {
		int n=5;
		for(int i=1;i<=10;i++) {
			int result=n*i;
		
		System.out.println(n+"x"+i+"="+result);
		}
	}
	
}
class Table2 implements Runnable{

	@Override
	public void run() {
		int n=2;
		for(int i=1;i<=10;i++) {
			int result=n*i;
		
		System.out.println(n+"x"+i+"="+result);
		}
	}
	
}
class Table3 implements Runnable{

	@Override
	public void run() {
		int n=3;
		for(int i=1;i<=10;i++) {
			int result=n*i;
		
		System.out.println(n+"x"+i+"="+result);
		}
	}
	
}
public class MultiplicationTable {

	public static void main(String[] args) {
		Table5 t=new Table5();
		Thread th1=new Thread(t);
		Table2 t2=new Table2();
		Thread th2=new Thread(t2);
		Table3 t3=new Table3();
		Thread th3=new Thread(t3);
		th1.start();
		th2.start();
		th3.start();

	}

}
