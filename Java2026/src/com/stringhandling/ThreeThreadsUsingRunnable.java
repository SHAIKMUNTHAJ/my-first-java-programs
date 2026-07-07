package com.stringhandling;
//Write a java program using the Runnable interface to create 3 threads that print
//employee names, emp IDs, and emp salaries. Start all 3 threads simulatneously and
//display the output.
class EmployeeId implements Runnable{

	@Override
	public void run() {
		int []id= {1,2,3};
		for(int ids:id ) {
			System.out.println(ids);
		}
		
	}
	class EmployeeSalary implements Runnable{

		@Override
		public void run() {
			double []sal= {700000.00,723827.00,200000.00};
			for(double sals:sal ) {
				System.out.println(sals);
			}
			
		}
		
	}
	class EmployeeName implements Runnable{

		@Override
		public void run() {
			String []name= {"munthaj","anjana","sunil"};
			for(String names:name ) {
				System.out.println(names);
			}
			
		}
		
	}
	
}

public class ThreeThreadsUsingRunnable {

	public static void main(String[] args) {
		EmployeeId e=new EmployeeId();
		Thread t=new Thread(e);
//		Thread t1=new Thread(new EmployeeName());
//		Thread t2=new Thread(new EmployeeSalary());
		t.start();
		
		

	}

}
