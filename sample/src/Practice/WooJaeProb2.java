package Practice;

public class WooJaeProb2 {
	public static void main(String[] args) {
		/*
		 * �Ʒ��� ���� num�� �������� ��� ���� 0�� ����ϴ� �ڵ��̴�. ���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���.
		 * ��Ʈ: ���� �����ڸ� �ι� �̿�
		 */
		int num = -90;
		System.out.println(num > 0 ? "���" : (num < 0 ? "����" : 0));

		/*
		 * ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�. ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� �ҹ��ڷ� �����ϴ� �ڵ带 �ϼ�
		 * �մϴ�.
		 */
		char ch = 'P';
		char lowerCase = (char) (((int) ch >= 97 && (int) ch <= 122) ? ch : ((int) ch + 32));
		System.out.print("ch:" + ch);
		System.out.println(" to lowerCase :" + lowerCase);

		char a = 'A';
		System.out.println((int) a);
	}
}