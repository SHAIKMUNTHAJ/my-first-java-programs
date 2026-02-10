package count;

public class Instance {
	public void h() {
		System.out.println("1");
		b();
	}

	public void b() {
		System.out.println("2");
		r();
	}

	public void r() {
		System.out.println("3");
		main();
	}

	public static void main() {

		System.out.println("4");
		k();
	}

	public static void k() {

		System.out.println("5");

	}

	static {
		Instance d = new Instance();
		d.h();
	}
}
