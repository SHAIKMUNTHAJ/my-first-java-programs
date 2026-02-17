
package student;

public class Employee1 {
	String name;
	Integer salary;
	Double pf=0.08;
	Double gst=0.06;
	double Da=0.03;

	public static void main(String[] args) {
		Employee1 e = new Employee1();

	}

	{
		name = "king";
		salary = 5000;
		Double pfsal=salary*pf;
		Double gstsal=salary*gst;
		Double dasal=salary*Da;
		Double totalpfsal=pfsal*12;
		Double total=salary+dasal-pfsal-gstsal;
		
		System.out.println("total net salary "+(total*12));
		System.out.println("gstsal="+gstsal);
		System.out.println("pfsal="+pfsal);
		System.out.println("dasal="+dasal);
		System.out.println("totalpfsal="+totalpfsal);
		



		

	}
}
