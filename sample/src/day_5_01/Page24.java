package day_5_01;

public class Page24 {

	public static void main(String[] args) {
		
		int year=0;
		System.out.println(year);

		year+=2000;
		System.out.println("year : "+year);
		System.out.printf("year : %d \n",year);
		
		int x=10, y=90;
		System.out.printf("x = %d y= %d \n",x,y);
		
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.printf("x = %d y= %d \n",x,y); 
		
		final double PI = 3.14159;
		System.out.println("pi = "+PI);
		System.out.printf("pi = %4.2f \n",PI);
		
		int num=10;
		System.out.printf("num = %d  %d\n",num,num);
		System.out.printf("num = %d  %o\n",num,num);
		System.out.printf("num = %d  %x\n",num,num);
		System.out.println("num = "+Integer.toBinaryString(num));
		
		String msg = "Hello Java";
		System.out.println("msg = "+msg);
		System.out.printf("msg = %s \n",msg);
		System.out.printf("msg = %s \n",msg.length());
		
		System.out.println("== main end ==");
	}

}
