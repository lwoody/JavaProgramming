package day_5_08;

public class Page183 {

	static int num = 0;

	public static void main(String[] args) {
		
		String[] name = new String[3];
		int[] number = new int[3];
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		for (int i = 0; i < number.length; i++) {
			number[i]=i;
			name[i]="lee";
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		for (int data : number) {
			System.out.println(data);
		}
		for (String data : name) {
			System.out.println(data);
		}
		

	}

}
