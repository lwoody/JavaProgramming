package day_6_7;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;

public class ListBox {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setLayout(new FlowLayout());
		List list = new List(4,false);
		
		list.add("item1");
		list.add("item2");
		list.add("item3");
		list.add("item4");
		list.add("item5");
		
		list.select(1);
		f.add(list);
		f.pack();
		f.setVisible(true);
	}

}
