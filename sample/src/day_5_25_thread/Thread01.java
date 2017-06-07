package day_5_25_thread;

public class Thread01 {
	public static void main(String[] args) {
		Job1 j1 = new Job1();
		Thread thread1 = new Thread(j1);

		Job2 j2 = new Job2();
		Thread thread2 = new Thread(j2);

		thread1.start();
		thread2.start();

		System.out.println("== main end ==");

	}

}

class Job1 implements Runnable {
	int sum = 0;

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			if (i % 2 != 0) {
				sum += i;
				System.out.println("È¦¼ö ÇÕ : " + sum);
			}
		}
	}

}

class Job2 implements Runnable {
	int sum = 0;

	@Override
	public void run() {

		for (int i = 0; i < 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
				System.out.println("Â¦¼ö ÇÕ : " + sum);
			}
		}
	}

}