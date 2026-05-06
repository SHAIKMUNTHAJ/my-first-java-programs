package com.javapackage;

import java.util.Scanner;

public class Saure {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Saure s1 = new Saure();
		System.out.print("Enter the radius : ");
		int radius = sc.nextInt();
		double area = s1.getAreaOfCircle(radius);
		System.out.println("area of Circle : " + area);
//	area of	square 
		System.out.println("Enter the  radius:");
		int square=sc.nextInt();
	   double value=s1.getAreaOfSquare(square);
		System.out.println(" area of cricle :"+value);
//		triangle of area
		System.out.println("Enter the radius :");
		int triangle=sc.nextInt();
		double tri=s1.getAreOfTriangle(radius,radius);
		System.out.println("area of triangle:"+tri);
//	area of rectangle	
		System.out.println("Enter the radius :");
		int rectangle=sc.nextInt();
		double rec=s1.getAreaOfRectangle(rectangle,rectangle);
		System.out.println("area of rectangle:"+rec);
//		peram
      System.out.println("enter the value:");
      double per=sc.nextDouble();
      double perm=s1.getAreaOfPeramid(per);
      System.out.printf("value:%.2f",perm);
	}


double getAreaOfCircle(int radius) {
		double area = Math.PI * (radius * radius);
		return area;
	}
	double getAreaOfSquare(int sqaure) {
		double area=sqaure*sqaure;
		return area;
	}
	double getAreOfTriangle(int b,int h){
		double area=0.5*b*h;
		return area;
	}
	double getAreaOfRectangle(int l, int b) {
		double area=l*b;
		return area;
	}
	double getAreaOfPeramid(double a){
		double area=45.30000879;
		return area;
	}
}
