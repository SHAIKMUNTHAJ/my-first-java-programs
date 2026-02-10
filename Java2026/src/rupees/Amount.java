package rupees;

public class Amount {
	static int a = 100;
	static int b = 7;

	public static void main() {
		int items = a / b;
		 int rupees=a-a%b;
	int remining=a%b;
		System.out.println("total items bought are : " + items);
        System.out.println("total rupees are:"+rupees);
        System.out.println("  remining:"+remining);

	}
}
