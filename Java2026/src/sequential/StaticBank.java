package sequential;
class StaticBank {
	 String username;
	   int phonenumber;
	   int balance;
	    int accountnumber;
	    static int nextAccount=12350;
	    {
	    	nextAccount=nextAccount+1;
	    }
	    
   public static void main(String[] args) {
	System.out.println("main mentod started");
StaticBank s=new StaticBank();
	s.username="munthaj";
	s.phonenumber=567843;
	s.balance=4000;
	System.out.println("nextAccount="+s.nextAccount);
     System.out.println( "username="+s.username);
     System.out.println( "phonenumber="+s.phonenumber);
 	 System.out.println( "balance="+s.balance);
 	StaticBank s1=new StaticBank();
	s1.username="basith";
	s1.phonenumber=767689;
	s1.balance=5000;
	 System.out.println("nextAccount="+s1.nextAccount);

     System.out.println( "username="+s1.username);
     System.out.println( "phonenumber="+s1.phonenumber);
 	 System.out.println( "balance="+s1.balance);
 	


	
}

}
