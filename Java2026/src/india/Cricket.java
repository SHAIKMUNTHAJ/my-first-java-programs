package india;

public class Cricket {
      String playername;
      int age;
      int jersynumber;
      int highscore;
	public static void main(String[] args) {
       
		Cricket sm = new Cricket();

		sm.playername = "kholi";
		sm.age=20;
		sm.jersynumber=91;
		sm.highscore=98;
		 String board="bcci";
		System.out.println("Name ="  +sm.playername);
		System.out.println("AGE ="  +sm.age);
		System.out.println("jersynumber ="  +sm.jersynumber);
		System.out.println(board);
		
		System.out.println("highscore ="  +sm.highscore);
		

		

	}

}
