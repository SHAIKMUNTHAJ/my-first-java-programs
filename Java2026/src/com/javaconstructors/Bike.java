package com.javaconstructors;

//Why do we pass values in this()?
//To provide default values and reuse constructor logic without duplicating code
public class Bike {
	String brand;
	String model;
	String color;
	double price;

//	double milage;
	Bike() {
		this("unknown");
//		System.out.println("no arg con called");
	}

	Bike(String brand) {
		this(brand, "unknown");
//		System.out.println("one arg con called");
//		this.brand=brand;

	}

	Bike(String brand, String model) {
		this(brand, model, "blue");
//		System.out.println("two arg con called");

	}

	Bike(String brand, String model, String color) {
		this(brand, model, color, 200000);

	}

	Bike(String brand, String model, String color, double price) {

		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;

	}

	public static void main(String[] args) {
		Bike b2 = new Bike();
		Bike b = new Bike("RE");
		System.out.println(b.brand);
		Bike b1 = new Bike("cz", "Rx_100");
		System.out.println(b1.brand);
		System.out.println(b1.model);
		Bike b3 = new Bike("sp", "spike", "black");
		b3.display();
		Bike b4 = new Bike("zp", "realme", "blue", 200000);
		b4.display();
	}

	void display() {
		System.out.println(brand);
		System.out.println(model);
//		System.out.println(milage);
		System.out.println(price);
		System.out.println(color);
	}

}
