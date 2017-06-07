package day_5_22;

import java.util.function.Function;

public class Test05 {

	public static void main(String[] args) {
		System.out.println(new M1().max(1, 2));
		F1 f = (int a, int b) -> {
			return a > b ? a : b;
		};
		System.out.println(f.max(1, 2));
		F1 f2 = (int a, int b) -> a > b ? a : b;
		f2.max(1, 2);

		F2 f3 = (int a, int b) -> a > b ? b : a;
		f3.min(1, 2);
		
		//ramda with generic
		Function<String, Integer> sToi= (s) -> Integer.parseInt(s);
		int num = sToi.apply("55");
		System.out.println(num);
		
		Function<Integer, Integer> k = (Integer e) -> e*20;
		System.out.println(k.apply(4));
	}

}


@FunctionalInterface
interface F1 {
	public abstract int max(int a, int b);
}

@FunctionalInterface
interface F2 {
	public abstract int min(int a, int b);
}

class M1 {
	public int max(int a, int b) {
		return a > b ? a : b;
	}
}