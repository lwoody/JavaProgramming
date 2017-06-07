package day_5_01;

public class Page130 {

	public static void main(String[] args) {

		int jumsu = 90;

		String flag = jumsu >= 0 && jumsu <= 100 ? "pass" : "fail";
		System.out.println(jumsu<0?jumsu:null);

		if (jumsu >= 0 && jumsu <= 100) {

			System.out.println(jumsu);
			System.out.println(flag);

		}

	}

}
