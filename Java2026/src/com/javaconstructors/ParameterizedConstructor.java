package com.javaconstructors;

public class ParameterizedConstructor {
	String sname;
	int sid;
	int sage;
    float Height;
	ParameterizedConstructor(){
		System.out.println("no arg constrctor called:");
	}
		ParameterizedConstructor(String sname,int sage,float height){
			System.out.println("parameterized constructor called");
			this.sname=sname;
			this.sage=sage;
			this.Height=height;
		}
	

	public static void main(String[] args) {
		System.out.println("main method started");
		ParameterizedConstructor s3=new ParameterizedConstructor();
		ParameterizedConstructor s4=new ParameterizedConstructor("munthaj",22,6f);
	s4.show();

	}
	void show(){
		System.out.println(sname);
		System.out.println(sage);
		System.out.println(Height);
		System.out.println("ended");
	}

}
