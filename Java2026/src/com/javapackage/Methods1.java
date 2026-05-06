package com.javapackage;
 import java.util.Scanner;
 public class Methods1 {
 void main(String[] args) {
 Scanner sc =new Scanner(System.in);
// using integer;
 System.out.println("enter my age:");
 int age=sc.nextInt();
 int ag=getAge(age);
 System.out.println("my age is:"+ag);
// using short
 System.out.println("enter your height :");
 short pocket=sc.nextShort();
 short poo=getBonus(pocket);
 System.out.println("my montly pocket:"+poo);
// using float
 System.out.println("Enter your height:");
 float height=sc.nextFloat();
 float hei=getHeight(height);
 System.out.println("my height id:"+hei);
 }
int getAge(int a){
	return a;
	
}
short getBonus(short p) {
	return p;
}
float getHeight(float h) {
	return h;
}
}
