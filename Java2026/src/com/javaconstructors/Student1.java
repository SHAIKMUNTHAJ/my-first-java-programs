package com.javaconstructors;

public class Student1 {

	String sname;
	int sid;
	int marks;

	Student1(String sname, int sid, int marks) {
		System.out.println("parameteized constructor called");

		this.sname = sname;
		this.sid = sid;
		this.marks = marks;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Student1 s1 = new Student1("munthaj", 101, 85);
		s1.display();
		s1.IsTopper();
		Student1 s2 = new Student1("ravi", 102, 90);
		s2.display();
		s1.IsTopper();
	}
	void IsTopper() {
		if(marks>90) {
			System.out.println("Result:Topper");
		}else {
			System.out.println("Result:Average");
		}

	}

	void display() {
		System.out.println("Name:" + sname);
		System.out.println("Id:" + sid);
		System.out.println("Marks:" + marks);
	
	

	}

}
