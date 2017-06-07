package day_6_7;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Frame2 extends Frame{

	public static void main(String[] args) {
		Frame2 f1 = new Frame2();
		f1.setSize(500,500);
		Panel p1 = new Panel();
		Button b1 = new Button("button");
		p1.add(b1);
		f1.add(p1);
		p1.setVisible(true);
		f1.setVisible(true);
	}

}
