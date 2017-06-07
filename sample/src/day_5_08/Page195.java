package day_5_08;

import java.util.Arrays;

public class Page195 {

	public static void main(String[] args) {
		
		int[] num = {99,98,77,66,100};
		System.out.println(Arrays.toString(num));
		
		String[] names = {"±è±æµ¿","È«±æµ¿","°í±æµ¿"};
		for(String data:names){
			System.out.println(data.charAt(0));
		}
		for(int i=0;i<names.length;i++){
			System.out.println(names[i].charAt(0));
		}
		
		
		
		System.out.println("==================");
		char[] abc = {'a','b','c','d'};
		char[] n = {'0','1','2','3','4','5'};
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(n));
		
		char[] m = new char[n.length+abc.length];
		System.arraycopy(abc, 0, m, 0, abc.length);
		System.arraycopy(n, 0, m, abc.length, n.length);
		System.out.println(Arrays.toString(m));
		
	}
}
