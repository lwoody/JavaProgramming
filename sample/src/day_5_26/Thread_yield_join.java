package day_5_26;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Thread_yield_join extends JFrame {

	Label label1, label2, label3;
	TextField text1, text2, text3;
	Button button = new Button("START");

	public Thread_yield_join() {

		this.label1 = new Label("홀수 합");
		this.label2 = new Label("짝수 합");
		this.label3 = new Label("총 합");

		text1 = new TextField("", 40);
		text2 = new TextField("", 40);
		text3 = new TextField("", 40);

		Panel p1 = new Panel();
		p1.setLayout(new GridLayout(3, 2));

		p1.add(label1);
		p1.add(text1);
		p1.add(label2);
		p1.add(text2);
		p1.add(label3);
		p1.add(text3);

		this.add(p1, BorderLayout.NORTH);
		this.add(button, BorderLayout.SOUTH);

		// start 시 보여줌
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("start 버튼이 눌려졌습니다.");
				Job1 j1 = new Job1();
				Thread t1 = new Thread(j1);

				Job2 j2 = new Job2();
				Thread t2 = new Thread(j2);

				t1.setPriority(7);
				t1.start();
				t2.start();
				
				try {
					t1.join();
					t2.join();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				text3.setText(j1.sum+j2.sum+"");

			}
		});

		// x button선택시 프로그램 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 200);
		this.setVisible(true);

	}

	class Job1 implements Runnable {
		int sum = 0;

		@Override
		public void run() {
			

			for (int i = 0; i < 1000; i++) {
				if (i % 2 != 0) {
					sum += i;
					text1.setText(Integer.toString(sum));
					System.out.println("홀수 합 : " + sum);
				}
				Thread.yield();
			}
			
			System.out.println("Job1");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}

	}

	class Job2 implements Runnable {
		int sum = 0;

		@Override
		public void run() {

			for (int i = 0; i < 1000; i++) {
				if (i % 2 == 0) {
					sum += i;
					text2.setText(Integer.toString(sum));
					System.out.println("짝수 합 : " + sum);
				}
				Thread.yield();
			}
			System.out.println("Job2");
			System.out.println(Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getPriority());
		}

	}

	public static void main(String[] args) {
		System.out.println("main Start");
		
		Thread.yield();
		
		Thread_yield_join t = new Thread_yield_join();
		
		System.out.println("main End");
	}

}