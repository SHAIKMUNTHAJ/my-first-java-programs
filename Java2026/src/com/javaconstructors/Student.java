package com.javaconstructors;

public class Student {
	String sname;
	int sid;
	int marks;

	Student(String sname, int sid, int marks) {
		System.out.println("parameteized constructor called");

		this.sname = sname;
		this.sid = sid;
		this.marks = marks;

	}

	public static void main(String[] args) {
		System.out.println("main method started");

		Student s1 = new Student("munthaj", 101, 85);
		s1.display();
		Student s2 = new Student("ravi", 102, 90);
		s2.display();
	}

	void display() {
		System.out.println("Name:" + sname);
		System.out.println("Id:" + sid);
		System.out.println("Marks:" + marks);
		if(marks>35) {
			System.out.println("Result:pass");
		}else {
			System.out.println("Result:fail");
		}
	}

}
