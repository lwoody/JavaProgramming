package day_6_2;

class ThreadA implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "run");
		}
	}
}

class ThreadB implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "run");
		}
	}
}

class ThreadExam extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "run");
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {

		ThreadA a1 = new ThreadA();
		ThreadA a2 = new ThreadA();
		ThreadB b = new ThreadB();
		ThreadExam c = new ThreadExam();

		Thread threadA1 = new Thread(a1);
		Thread threadA2 = new Thread(a2);
		Thread threadB = new Thread(b);
		
		threadA1.start();
		threadA2.start();
		threadB.start();
		c.start();

	}

}
