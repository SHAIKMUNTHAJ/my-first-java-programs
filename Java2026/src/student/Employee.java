package student;



public class Employee {
	int id;
	int sal;
	String name;
     int m;
	public static void main(String[] arg) {
		Employee e1 = new Employee();
		e1.id = 201;
		e1.sal = 40000;
		e1.name = "munthaj";
		
		System.out.println(e1.id);
		System.out.println(e1.sal);
		System.out.println(e1.name);
		e1.bonus();
}

void bonus() {
  m=20;
  System.out.println(120*40000/100);
	}
}
