package loopsconcept;

public class PrimeNumber {

	static boolean isPrime(int n) {
		
		boolean prime = true;
		if(n==1 ||n==0) {
			return false;
		}

		
		for (int i = 2; i <n; i++) {
			
			if(n%i==0) {
				
				return prime=false;
				
			}
			

		}

		return prime;
	}

	public static void main(String[] args) {
		for(int i=2;i<=100;i++) {
			if(isPrime(i))
		  System.out.println(i);
		 
	}


	
}
}