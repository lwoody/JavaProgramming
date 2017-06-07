package day_4_28;

public class DataType {
	
	static double k3;

	public static void main(String[] args) {
		
		boolean flag;
		char d = 'a';	
		int a = 1;
		double b = 2.0;
		double c = a+b;
		System.out.println(c);
		c=b;
		c-=1;
		System.out.println(b);
		
		byte k1=127, k2=1;
		k3 = k2/k1;
		System.out.println(k3);
		
		System.out.print("1 \n");
		
		char g='0';
		
		String name = new String("lee");
		System.out.println(name.contains("l"));
		System.out.println((int)'0');
		System.out.println(Character.isDigit(g));
		
		
		
	}

}
