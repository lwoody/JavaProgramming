package day_6_7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.*;

public class TextAreaTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		TextArea ta = new TextArea("fda",5,20);
		ta.append("fdsa");
		f.add(ta);
		f.setSize(200, 100);
		f.setVisible(true);
		System.out.println(ta.getText());
		
	}

}
