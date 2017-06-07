package day_5_02;
import java.util.*;

public class Page116 {

	public static void main(String[] args) {
		
//		int n1=5, n2=5, n3=0, n4=0, sum=0;
//		n3 = n1++;
//		n4 = ++n2;
//		
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		num = sc.nextInt();
		
		if(num%2==0||num%3==0){
			System.out.println(num);
			System.out.println("2나 3의 배수입니다.");
		}
		else{
			System.out.println("2나 3의 배수가 아닙니다.");
		}
		
		
		
	}

}
