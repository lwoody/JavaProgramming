package day_6_7;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EasyEvent implements ActionListener{

	public static void main(String[] args) {
		EasyEvent a = new EasyEvent();
	}
	
	Button b1;
	Frame f1;
	TextField tf1;
	public EasyEvent(){
		b1 = new Button("fdsa");
		b1.setBounds(20,100,100,30);
		b1.addActionListener(this);
		
		tf1 = new TextField();
		tf1.setBounds(20, 30, 100, 30);
		
		f1 = new Frame();
		f1.setLayout(null);
		f1.setSize(200, 200);
		f1.add(tf1);
		f1.add(b1);
		f1.setVisible(true);
		f1.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent w){
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1.setText("fdasfdas");
	}

}
