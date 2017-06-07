package Practice;

public class WooJaeProb_5_22 {

	public static void main(String args[]) {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

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
				// //숫자 확인
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
