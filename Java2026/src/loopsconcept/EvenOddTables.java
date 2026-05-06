package loopsconcept;

public class EvenOddTables {
	public static void main(String[] args) {
		for(int even=2;even<=10;even=even+2) {
//		this odd table logic	
//			for(int odd=1;odd<=10;odd=odd+2)
			
			System.out.println("even table number:"+even);
			for(int i=1;i<=10;i++) {
				System.out.println(even+"x"+i+"="+(even*i));
			}
		}
	}

}




