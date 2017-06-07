package day_5_19;

public class Page352 {

	public static void main(String[] args) {

		Math.random();
		// Singletone s1 = new Singletone();
		// Singletone s2 = new Singletone();
		// Singletone s3 = new Singletone();

		Singletone s1 = Singletone.getInastance();
		Singletone s2 = Singletone.getInastance();

		System.out.println(s1);

	}

}

// singletone ÀÛ¼º¹ý
final class Singletone {

	private static Singletone s = new Singletone();

	private Singletone() {
		System.out.println("create instance");
	}

	public static Singletone getInastance() {
		if (s == null) {
			s = new Singletone();
		}
		return s;
	}

}
