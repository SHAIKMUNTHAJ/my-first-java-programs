package count;

public class ObjectCount {
	 static int count=0;
	ObjectCount(){
		count++ ;
		System.out.println("object count="+count);
	}
 
	public static void main(String[] args) {
	System.out.println("main method");
	ObjectCount s1=new ObjectCount();
	ObjectCount s2=new ObjectCount(); 
	ObjectCount s3=new ObjectCount();

	}

}
