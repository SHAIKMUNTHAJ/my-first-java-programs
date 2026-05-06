package loopsconcept;

import java.util.Scanner;

//wap to print even odd number between 1 to 50

public class PrintEvenOdd {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your  number:");
		int n=sc.nextInt();
for(int i=1;i<=n; i++) {
	if(i%2==0) {
	System.out.println(i +"even");
 }else {
	 System.out.println(i+"odd");
 }
 


 }

	}

}
