package com.oops;

class student implements Cloneable {
	String name;
	int age;
	Address address;

	public student(String name, int age,Address address) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
class  Address{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}
}

public class ObjectCloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a1=new Address("hyd");
		student s = new student("munthaj",20,a1);
		student s1 = (student) s.clone();
		
		
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.address.city);
		System.out.println(s);
		System.out.println(s1.name);
		System.out.println(s1.age);
		System.out.println(s1.address.city);
	}

}
