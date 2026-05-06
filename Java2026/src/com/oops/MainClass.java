package com.oops;

class Device {
	String Brand;
	int Power;

	Device(String Brand, int Power) {
		this.Brand = Brand;
		this.Power = Power;
	}

	void ShowDEtails() {
		System.out.println("brand:" + Brand);
		System.out.println("power:" + Power);
	}
}

//-------------------------------------------------

class Laptop extends Device {

	Laptop(String Brand, int Power) {
		super(Brand, Power);

	}

	void openLid() {
		System.out.println("here your amazing laptop ");
		
	}
}

//---------------------------------------------------------

class Smartphone extends Device {
	Smartphone(String Brand, int Power) {
		super(Brand, Power);
	}
	void MakeCall() {
	System.out.println("Here Your amazing Smartphone");
	}

}

//-----------------------------------------------

public class MainClass {

	public static void main(String[] args) {
		Laptop l1 = new Laptop("hp", 10);
		l1. openLid();
		l1.ShowDEtails();
		
		Smartphone s1=new Smartphone("vivo_65",100);
		s1.MakeCall();
	s1.ShowDEtails();
		
	}

}
