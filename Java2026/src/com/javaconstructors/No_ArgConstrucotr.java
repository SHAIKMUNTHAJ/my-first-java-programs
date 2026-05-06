package com.javaconstructors;
//A no-argument constructor is a constructor without parameters, used to initialize object fields
//with default values. If no constructor is defined,
//Java provides a default one automatically.
//Why do we need a no-arg constructor if default exists?
//We use a no-arg constructor to initialize objects with meaningful default values and custom logic.
//The default constructor provided by Java only assigns default values
//like 0 or null and is not available once we define our own constructors
public class No_ArgConstrucotr {
	String sname;
	int sid;
	int sroll;
	No_ArgConstrucotr(){
		sname="munthaj";
		sid=77;
		sroll=290;
		System.out.println("no arg constrctor called");
	}

	public static void main(String[] args) {
System.out.println("main method started");
No_ArgConstrucotr s2=new No_ArgConstrucotr();

System.out.println(s2.sname);
System.out.println(s2.sid);
System.out.println(s2.sroll);
}
}
