package day_6_7;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		Choice c = new Choice();
		c.add("item1");
		c.add("item2");
		c.add("item3");
		c.add("item4");
		c.add("item5");
		f.add(c);
		f.pack();
		f.setSize(100, 150);
		f.setVisible(true);
	}

}
