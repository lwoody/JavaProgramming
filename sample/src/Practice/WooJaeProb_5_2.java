package Practice;

import java.util.*;

public class WooJaeProb_5_2 {

	// [4] ���� ��ȣ��(Classical Cryptography)���� ����ϴ� ��� �� ��Caesar Cipher�� ��
	// ��ȣȭ�� ����� �Ǵ� ������ ���ڵ��� ���ĺ� ���� ����° ������ ���ڷ� ġȯ�ϴ� ������ ġȯ ��ȣ���
	// (��, a�� d��, b�� e��, �� , x�� a��, y�� b��, z�� c��)�Դϴ�.
	// ��everyday we have is one more than we deserve�� ��� ���ڿ��� ����
	// Caesar Cipher �� �����Ͽ� ��ȣȭ�� ���ڿ� ���� �Ʒ��� ���� ����ϵ���
	// Prob4�� Ŭ������ main �Լ��� �ϼ��Ͻʽÿ�.
	// (��, ���鿡 ���ؼ��� ġȯ�� �������� �ʽ��ϴ�.)
	//
	// ��ȣȭ�� ���ڿ� : everyday we have is one more than we deserve
	// ��ȣȭ�� ���ڿ� : hyhubgdb zh kdyh lv rqh pruh wkdq zh ghvhuyh

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";

		// ���α׷��� ������ ����.
		// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�.

		for (int i = 0; i < sourceString.length(); i++) {
			char ch = sourceString.charAt(i);
			if (ch == ' ') {
				encodedString += ' ';
			} else if (ch < 120) {
				encodedString += (char) (ch + 3);
			} else if ((int) ch == 120) {
				encodedString += 'a';
			} else if ((int) ch == 121) {
				encodedString += 'b';
			} else if ((int) ch == 122) {
				encodedString += 'c';
			}

		}

		// ���α׷� ������ ��.

		System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
		System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
	}
}
