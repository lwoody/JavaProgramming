package day_6_7;

import javax.swing.*;

public class ButtonTest extends JFrame{
	
	public ButtonTest(){
		JPanel p = new JPanel();
		JButton b1 = new JButton("kim");
		JButton b2 = new JButton("choi");
		JButton b3 = new JButton("park");
		JButton b4 = new JButton("lee");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		getContentPane().add(p);
	}
	

	public static void main(String[] args) {
		ButtonTest bt = new ButtonTest();
		bt.setTitle("fdas");
		bt.setSize(250,200);
		bt.setVisible(true);
	}

}
