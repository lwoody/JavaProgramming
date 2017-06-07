package day_5_02;
import java.util.*;

public class Page139 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input>0){
			System.out.println(input+"은 양수입니다.");
		}
		else if(input==0){
			System.out.println(input+"은 0입니다.");			
		}
		else{
			System.out.println(input+"은 음수입니다.");
		}
		
		System.out.println("==== main end ====");
		
	}

}
