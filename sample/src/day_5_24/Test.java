package day_5_24;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		Set<String> s = new HashSet();
		s.add("kkk");
		s.add("fdsafda");

		Iterator<String> i = s.iterator();
		for (String data : s) {
			System.out.println(data);
		}

		// 마지막 글자만
		while (i.hasNext()) {
			String ss = i.next();
			System.out.println(ss.charAt(ss.length() - 1));
		}

		List<String> s1 = new ArrayList<>();

		Set<String> names = new HashSet();
		names.add("fdsa");
		names.add("dddd");
		names.add("lee");
		System.out.println(names);

		Set<String> names2 = new TreeSet();
		names2.add("fdsa");
		names2.add("dddd");
		names2.add("lee");
		names2.add("a");
		System.out.println(names2);

		// sorting 안되는 데이터는 treeset에 넣을 수 없음
		// PhoneInfo class에 comparable interface implement 시켜서 compareTo
		// override하면 가능해짐
		Set<PhoneInfo> phones = new TreeSet<>();
		phones.add(new PhoneInfo("PP", "010-2320-2020"));// 대문자가 소문자보다 순서 앞섬
		phones.add(new PhoneInfo("dd", "010-2120-2020"));
		phones.add(new PhoneInfo("ff", "010-2220-2020"));

		for (PhoneInfo data : phones) {
			System.out.println(data);
		}

	}

}
