package day_5_24;

import java.util.ArrayList;

public class ListPractice {

	public static void main(String[] args) {
		Object[] obj1 = new Object[10];
		PhoneInfo[] p1 = new PhoneInfo[10];

		ArrayList<Object> obj2 = new ArrayList<Object>();
		obj2.add(new PhoneInfo());
		ArrayList<PhoneInfo> p2 = new ArrayList<PhoneInfo>();
		p2.add(new PhoneInfo());

		for (int i = 0; i < p2.size(); i++) {
			System.out.println(p2.get(i));
		}

	}

}
