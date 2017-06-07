package day_5_22;

public class Page416 {

	public static void main(String[] args) {

		System.out.println("===Start===");

		String name = "0";
		try {
			System.out.println(name);
			int num = Integer.parseInt(name);
			int num2 = 100 / num;
			System.out.println("100/" + num + " : " + num2);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("exection occured");
		}
		finally {
			System.out.println("finally");
		}

		System.out.println("===end===");
	}

}
