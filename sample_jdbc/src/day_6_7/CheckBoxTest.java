package day_6_7;

import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class CheckBoxTest {

	public static void main(String[] args) {
		Frame f = new Frame();
		Checkbox c1 = new Checkbox("item1",true);
		Checkbox c2 = new Checkbox("item2",false);
		Checkbox c3 = new Checkbox("item3",false);
		
		f.setLayout(new FlowLayout());
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.setTitle("checkbox");
		f.pack();
		f.setVisible(true);
	}

}
