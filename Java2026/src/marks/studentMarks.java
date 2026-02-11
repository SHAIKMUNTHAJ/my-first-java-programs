package marks;

import java.net.MulticastSocket;

public class studentMarks {
	String studentName;
	int id;
	int age;
	char gender;
	int telugu;
	int hindi;
	int english;
	int maths;
	int secience;
	int social;
	int total;
    float avg=0;int sum;
	public static void main(String[] args) {
		studentMarks s1 = new studentMarks();
		s1.m();

	}

	void m() {
		studentName = "munthaj";
		id = 228;
		age = 21;
		gender = 'f';
		telugu = 80;
		hindi = 70;
		english = 90;
		maths = 70;
		social = 80;
		total=telugu+english+hindi+maths+social;
		sum=5;
		avg=total/sum;
		System.out.println(studentName);
		System.out.println(id);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(telugu);
		System.out.println(hindi);
        System.out.println(english);
        System.out.println(social);
		 System.out.println(maths);
		 System.out.println(total);
		 System.out.println(sum);
		 System.out.println(avg);
		 

	}

}
