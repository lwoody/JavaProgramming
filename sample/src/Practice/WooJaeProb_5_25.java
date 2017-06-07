package Practice;

import java.util.ArrayList;

import org.hamcrest.core.SubstringMatcher;

public class WooJaeProb_5_25 {

	public static void main(String[] args) {
		String str = "1#PROD-001#X-note#Samsung#3#6000000";
		String[] strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		for (int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}

	private static String[] stringSplit(String str1, String str2) {
		// 구현하시오.
		
		// 방법 1
		String word = "";
		ArrayList<String> words = new ArrayList<>();

		for (int i = 0; i < str1.length(); i++) {

			// #표시가 나오면 더이상 문자 않넣고 words배열에 완성된 단어 삽입 
			if (str1.charAt(i) == str2.charAt(0)) {
				//#이 첫번째위치에 있을 때 예외처리
				if(i==0){
					continue;
				}
				words.add(word);
				word = "";
				continue;
			}
			// 마지막 문자일 경우 예외처리
			else if (i == str1.length() - 1) {
				word += str1.charAt(i);
				words.add(word);
				break;
			}
			// 문자를 넣어줌
			word += str1.charAt(i);
		}

		// 단어 수 크기의 배열
		String[] s = new String[words.size()];

		// 각 단어배열들을 String으로 만들어줌
		words.toArray(s);
		return s;
		
		
		//방법 2
//		ArrayList<String> list = new ArrayList<>();
//		
//		int startIndex =0;
//		int endIndex = str1.indexOf(str2);
//		while(true){
//			if(startIndex<str1.length()||){
//				list.add(str1.substring(startIndex,endIndex));
//				startIndex = endIndex+1;
//			}
//			
//	
//		}
//		
//		
//		
//		
//		String[] s = new String[list.size()];
//		return s;
	}
	
		
	
}
