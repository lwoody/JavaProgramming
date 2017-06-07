package day_6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlThreadTest {

	public static void main(String[] args) {

		ControlThread ct = new ControlThread();
		ct.br = new BufferedReader(new InputStreamReader(System.in));

		ct.condition = null;
		ct.start();
		ct.startThread();

	}

}

class ControlThread extends Thread {

	private Stopable r = new Stopable();
	private Thread t = new Thread(r);
	public BufferedReader br;
	public String condition;

	public void run() {
		int i = 0;
		while (true) {
			try {
				condition = br.readLine();
				if (condition.equals("quit")) {
					System.out.println("end");
					this.stopThread();
					break;
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			i++;
			if (i == 5) {
				System.out.println("5times input end");
				this.stopThread();
				break;
			}
		}

	}

	public void startThread() {
		t.start();
	}

	public void stopThread() {
		r.stopRunning();
	}

}

class Stopable implements Runnable {

	private boolean timeToQuit = false;

	@Override
	public void run() {
		while (!timeToQuit) {
			System.out.println("continue working");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void stopRunning() {
		timeToQuit = true;
	}

}
