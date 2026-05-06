package com.javapackage;
import java.util.Scanner;

public class Methodsdemo {
void munthaj() {
	System.out.println("gud mrng");
} 
static void basi() {
	System.out.println("hii");
}
static{
	System.out.println("my static block");
}
	public static void main(String[] args) {
//	no arg no return
	System.out.println("****************");
	Methodsdemo s=new Methodsdemo();
//	static method can call directly and calling with class name 
//	calling with reference variable also
//	instance only calling with reference variable
	s.munthaj();
	basi();
	s.basi();
	Methodsdemo.basi();
System.out.println("*******ended*********");
//no arg with return type
System.out.println("my age is:"+s.getAge());
System.out.println("my city name is="+s.getCityName());
System.out.println("today is sunday:"+s.isSunday());
System.out.println("PI value is:"+s.getPiValue());
char letter=s.getFirstLetter();
System.out.println("first letter:"+letter);
// with args no return type
	s.greet("good mrng everyone");	
 s.addition(100,20 );
 s.welcome("munthaj");
 s.check(20);
// circle with arg with return
Scanner sc=new Scanner(System.in);
System.out.println("enter base:");
double base=sc.nextDouble();
System.out.println("ener height:");
double height1=sc.nextDouble();
 double area=s.findarea(base,height1);
	}
 int getAge() {
	int age=22;
	return age ;
}
 String getCityName() {
	 String name="munthaj";
	 return name;
 }
 boolean isSunday() {
	 boolean result=true;
	 return result;
 }
 double getPiValue() {
	 double pi=3.14;
	 return pi;
 }
 char getFirstLetter() {

	 return 'M';
 }
 void greet(String wish) {
	 System.out.println("greting:"+wish);
 }
 void addition(int a,int b) {
	 
	 System.out.println(a+b);
 }
 void welcome(String name) {
	 System.out.println("welcome:"+name);
 }
 void check(int number) {
	 if(number%2==0) {
		System.out.println(number + ":is even"); 
	 }else {
	 System.out.println(number+":odd");
 }
double findarea(double b, double h) {
	double arr=0.5*r*r;
	
	return arr;
}

	
}

}
