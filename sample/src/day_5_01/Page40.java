package day_5_01;
import java.util.*;
import java.sql.*;

public class Page40 {

	public static void main(String[] args) {
		
		java.lang.String msg = new String("hello"); // lang package can be omitted
		java.util.Date today = new java.util.Date(); 
		System.out.println(msg);
		System.out.println(today.getYear());
		
		Scanner sc = new Scanner(System.in);
		
		String name = null;
		name = sc.nextLine();
		int b = sc.nextInt();
		sc.nextLine();
		String c = sc.nextLine();
		int d = Integer.parseInt(c);
		int age = b+d;
		
		System.out.println("이름은 : "+name);
		System.out.println("나이는 : "+age);
		System.out.println("가족수를 입력해주세요(ex. 5)");
		int count = sc.nextInt();
		System.out.println(count);
		
		sc.close();
		
	}

}
