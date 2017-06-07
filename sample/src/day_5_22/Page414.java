package day_5_22;

import java.util.concurrent.ExecutionException;

public class Page414 {

	public static void main(String[] args) {

		System.out.println("===Start===");

		String name = "0";
		try {
			System.out.println(name);
			int num = Integer.parseInt(name);
			int num2 = 100 / num;
			System.out.println("100/" + num + " : " + num2);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("null cannot use .");
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("예외 발생 " + e);
		} finally {
			System.out.println("finally");
		}

		System.out.println("===end===");
	}

}
