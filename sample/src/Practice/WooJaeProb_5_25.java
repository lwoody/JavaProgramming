//package Practice;
//
//import java.util.ArrayList;
//
//import org.hamcrest.core.SubstringMatcher;
//
//public class WooJaeProb_5_25 {
//
//	public static void main(String[] args) {
//		String str = "1#PROD-001#X-note#Samsung#3#6000000";
//		String[] strs = stringSplit(str, "#");
//		System.out.println("=== ���ڿ� ó�� ��� ===");
//		for (int i = 0; i < strs.length; i++) {
//			System.out.println(strs[i]);
//		}
//	}
//
//	private static String[] stringSplit(String str1, String str2) {
//		// �����Ͻÿ�.
//		
//		// ��� 1
//		String word = "";
//		ArrayList<String> words = new ArrayList<>();
//
//		for (int i = 0; i < str1.length(); i++) {
//
//			// #ǥ�ð� ������ ���̻� ���� �ʳְ� words�迭�� �ϼ��� �ܾ� ���� 
//			if (str1.charAt(i) == str2.charAt(0)) {
//				//#�� ù��°��ġ�� ���� �� ����ó��
//				if(i==0){
//					continue;
//				}
//				words.add(word);
//				word = "";
//				continue;
//			}
//			// ������ ������ ��� ����ó��
//			else if (i == str1.length() - 1) {
//				word += str1.charAt(i);
//				words.add(word);
//				break;
//			}
//			// ���ڸ� �־���
//			word += str1.charAt(i);
//		}
//
//		// �ܾ� �� ũ���� �迭
//		String[] s = new String[words.size()];
//
//		// �� �ܾ�迭���� String���� �������
//		words.toArray(s);
//		return s;
//		
//		
//		//��� 2
////		ArrayList<String> list = new ArrayList<>();
////		
////		int startIndex =0;
////		int endIndex = str1.indexOf(str2);
////		while(true){
////			if(startIndex<str1.length()||){
////				list.add(str1.substring(startIndex,endIndex));
////				startIndex = endIndex+1;
////			}
////			
////	
////		}
////		
////		
////		
////		
////		String[] s = new String[list.size()];
////		return s;
//	}
//	
//		
//	
//}
