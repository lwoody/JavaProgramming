package Practice;

import java.util.Arrays;

//class PhoneInfo {
//	String number;
//	String name;
//
//	void display() {
//		System.out.printf("이름 : %s 전화번호 : %s", this.name, this.number);
//	}
//}
//
//public class WooJaeProb_5_10 {
//
//	public static void main(String[] args) {
//		// PhoneInfo class 생성
//		// 변수 : 이름과 전화번호
//		// 메소드 : 이름과 전화번호 출력
//
//		PhoneInfo phone = new PhoneInfo();
//
//		phone.name = "lee";
//		phone.number = "02-3321-3231";
//
//		phone.display();
//
//		// lotto 중복제거
//		System.out.println("\n============");
//		int[] lotto = new int[6];
//		int temp;
//
//		for (int i = 0; i < lotto.length; i++) {
//			
////			temp = (int) (Math.random() * 7 + 1);
////
////			while(Arrays.toString(lotto).contains(Integer.toString(temp))){
////				temp = (int) (Math.random() * 7 + 1);
////			}
////			
////			lotto[i] = temp;
//			
//			lotto[i] = (int) (Math.random() * 5 + 1);
//			for (int j=0;j<i;j++) {
//				if(lotto[i]==lotto[j]){
//					lotto[i] = (int) (Math.random() * 5 + 1);
//					System.out.println(lotto[i]);
//					j=0;
//				}
//			}
//
//		}
//
//		System.out.println(Arrays.toString(lotto));
//	}
//
//}
