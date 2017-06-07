package day_6_7;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;

public class LabelTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		Label l1 = new Label("label1");
		Label l2 = new Label("label2");
		
		l2.setFont(new Font("Arial",Font.BOLD,20));
		f.add("North", l1);
		f.add("South", l2);
		f.setSize(200, 100);
		f.setTitle("labelTest");
		f.setVisible(true);
		
	}

}
