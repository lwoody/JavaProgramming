package day_5_01;
import java.util.*;

public class Page104 {
	
	public static void main(String[] args){
		
		char c1 = 'a', c2='A';
		
		System.out.println(c1+":"+(int)c1+" "+c2+":"+(int)c2);
		
		for(int i=0;i<26;i++){
			System.out.println(c1+":"+(int)c1+" "+c2+":"+(int)c2);
			c1++;
			c2++;
//			System.out.println(++c1);
		}
		
		char c = 'f';
		char d;
		int k = (int)c - 32;
		d = (char)k;
		System.out.println(d);
		
		char uppercase = (char)(c-32);
		System.out.println(uppercase);
		
		double pi = 3.14159;
		System.out.println((int)(pi*1000)/1000.);
		System.out.println(Math.round(pi));
		
		int x = 10;
		int y = 3;
		System.out.printf("³ª¸ÓÁö\t: %d \n",x%y);
		System.out.printf("¸ò\t: %d \n",x/y);
		
		
		
//		while(true){
//			System.out.println(c1);
//			if(c1=='z'){
//				break;
//			}
//			c1++;
//		}
		
	}
}
