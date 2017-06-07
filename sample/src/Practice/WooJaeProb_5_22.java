package Practice;

public class WooJaeProb_5_22 {

	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);

	}
}

class DiceGame {
	
	int countSameEye(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			int num1 = d1.play();
			int num2 = d2.play();
			if (num1 == num2) {
				count++;
				// //���� Ȯ��
				// System.out.println(num1 + " : " + num2);
			}
		}
		return count;
	}
}

class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}
