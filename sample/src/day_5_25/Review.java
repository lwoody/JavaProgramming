package day_5_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Review {

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 1 };
		Arrays.sort(n);

		List<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(7);
		a.add(3);
		a.add(2);
		a.add(0);

		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);

		Object[] b = a.toArray();

		System.out.println(Arrays.toString(b));
		System.out.println(b[0].getClass().getTypeName());

		Set<Integer> set = new HashSet();
		set.add(1);
		set.add(4);
		set.add(3);
		set.add(3);
		set.add(7);

		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
