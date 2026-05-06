package conditionalStataments;
import java.util.Scanner;

public class checking {

	public static void main(String[] args) {

   Scanner sc=new Scanner(System.in);
   System.out.println("enter your age:");
   int age=sc.nextInt();
   if(age<0) {
	   System.out.println("invalid");
   }else if(age<=5){
	   System.out.println("your  are a kid");
   }else if(age<=12) {
	   System.out.println("your are a child");
   }else if(age<=19) {
    System.out.println("your are a tenage");
    }else if(age<=35) {
    	System.out.println("your are a young");
    
    }else if(age<=59) {
    	System.out.println("your are a middle age");
    }else{
     System.out.println(" your are a citizen");	
    }

}
}
