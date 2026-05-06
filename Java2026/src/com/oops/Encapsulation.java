package com.oops;

public class Encapsulation {

	public static void main(String[] args) {
		Passenger p1=new Passenger();
	p1.setpname("munthaj");
	System.out.println(p1.getpname());
    p1.setpcontact(7095236575l);
    System.out.println(p1.getpcontact());
    
    p1.setpemail("shaimunthaj08@gmail.com");
    System.out.println(p1.getpname());
    System.out.println(p1.getpassportno());
	}

}
