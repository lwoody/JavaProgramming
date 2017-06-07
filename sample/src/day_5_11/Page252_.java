package day_5_11;

import java.util.Arrays;

public class Page252_ {
	
	String name;
	int num1;

	public void msgPrint(String name, int num){
		for(int i=0;i<num;i++){
			System.out.println(Page252_.msg(name));
		}
		return;
	}
	public static String msg(String name) {
		
		return "안녕하세요. " + name + "님!";
		
	}
	

	public static int max(int num1, int num2) {

		if (num1 > num2) {
			return num1;
		}
		
		//꼭 리턴값만 적용할 수 있는 건 아님
		System.out.println("fdsa");
		return num2;
	}

	public static void maxPrint(int num1, int num2) {

		System.out.println(max(num1, num2));
		return;

	}

	public static void main(String[] args) {

		System.out.println("========");
		int n1 = 100, n2 = 200;
		Page252_.maxPrint(n1, n2);
		int k = Page252_.max(n1, n2);
		
		System.out.println("========");
		String hello = Page252_.msg("lee");
		System.out.println(hello);		
		
		System.out.println("========");
		Page252_ m = new Page252_();
		m.msgPrint("lee",3);
		
		new Page252_().msgPrint("lee", 3);
		
		char[] cc = "abcdef".toCharArray();
		System.out.println(Arrays.toString(cc));

	}

}
