package day_5_01;

public class Page109 {

	public static void main(String[] args) {

		int x = 1, y = 100;
		System.out.println(x > y);

		System.out.println("=========");
		String s1 = new String("Hong");
		String s2 = new String("Hong");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		String s3 = s2;
		System.out.println(s3 == s2);

		System.out.println("=========");
		String s4 = "Gil";
		String s5 = "Gil";
		System.out.println(s4 == s5);

		System.out.println("=========");
		System.out.println(false && true);
		System.out.println(false || true);

		System.out.println("=========");
		int result = x >= y ? x : y;
		System.out.println(result);

		s1 = s2 = s3 = s4 = null;

	}

}
