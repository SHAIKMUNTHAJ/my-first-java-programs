package count;

public class CountIncrement {
	static int a = 15;
	{
		a = a + 1;
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		

		CountIncrement sm = new CountIncrement();
		CountIncrement sm1 = new CountIncrement();
		CountIncrement sm2= new CountIncrement();


		CountIncrement sm3 = new CountIncrement();
		System.out.println("object count"+a);

	}

}
