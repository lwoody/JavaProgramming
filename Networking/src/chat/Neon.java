package chat;

import java.awt.Button;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

public class Neon {

	public static void main(String[] args) {
		NeonFrame neon = new NeonFrame();
	}

}

class NeonFrame extends Frame implements ActionListener {
	// button, textfield
	Button b1, b2;
	String text = "           I LOVE YOU";
	Timer t1;
	TextField tf;
	char[] list;

	public NeonFrame() {

		this.setLayout(null);
		list = text.toCharArray();

		b1 = new Button("Start");
		b2 = new Button("End");
		b1.setSize(200, 100);
		b1.setLocation(50, 350);
		b2.setSize(200, 100);
		b2.setLocation(250, 350);
		b1.addActionListener(this);
		b2.addActionListener(this);

		tf = new TextField();
		tf.setSize(450, 50);
		tf.setLocation(25, 100);
		tf.setFont(new Font("����", Font.BOLD, 30));

		tf.setText(text);

		this.setSize(500, 500);
		this.add(tf);
		this.add(b1);
		this.add(b2);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.b1) {
			TimerTask task = new TimerTask() {

				@Override
				public void run() {
					char firstElement = list[0];
					for (int i = 1; i < list.length; i++) {
						char temp = list[i];
						list[i - 1] = temp;
					}
					// last element insert
					list[text.length() - 1] = firstElement;

					String s = "";
					for (char data : list) {
						s += data;
					}
					tf.setText(s);
				}
			};

			t1 = new Timer();
			this.t1.scheduleAtFixedRate(task, 0, 100);
		} else if (e.getSource() == b2) {
			this.t1.cancel();
		}

	}

}
