package day_5_10;

import java.util.Arrays;
import java.util.Objects;

class Test{
	int i, k;
	
	Test(int i, int k){
		this.i = i;
		this.k = k;
	}
	
	int sum(){
		return i+k;
	}
	
	void kk(){
		
	}
}

public class Review {
	
	public static void main(String[] args){
		
		Test n = new Test(1,2);
		
		int[] lotto = new int[6];
		
		
		
		
		for(int i=0;i<lotto.length;i++){
			lotto[i]=(int)(Math.random()*99+1);
		}
		
		int[] src = Arrays.copyOf(lotto, lotto.length);
		
		int[] src2 = new int[src.length];
		System.arraycopy(src, 0, src2, 0, src.length);
		
		System.out.println(n.i);
		System.out.println(n.sum());
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(src));
		
		int temp;
		for(int i=0;i<src.length-1;i++){
			for(int j=i+1;j<src.length;j++){
				if(src[i]>src[j]){
					temp = src[i];
					src[i] = src[j];
					src[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(src));
		
		
		int[] m = null;
		m = new int[Integer.parseInt(args[2])];
		
		System.out.println(Arrays.toString(m));
	
		
	}

}
