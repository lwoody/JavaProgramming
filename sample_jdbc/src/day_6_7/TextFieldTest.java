package day_6_7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class TextFieldTest {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		TextField tf = new TextField("fdsa",20);
		
		f.add(tf);
		f.setSize(200, 100);
		f.setVisible(true);
		
	}

}
