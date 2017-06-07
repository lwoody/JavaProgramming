package day_6_7;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FileProgram{

	public static void main(String[] args) {
		FileGui gui = new FileGui();
	}

}


class FileGui extends Frame implements ActionListener{
	
	public FileGui(){
		Frame f = new Frame();
		Button readButton, saveButton;
		TextArea ta = new TextArea("fda",20,20);
		ta.setSize(300,500);
		
		readButton = new Button("fileRead");
		readButton.setSize(100,70);
		readButton.setLocation(350, 300);
		readButton.setForeground(new Color(255,255,255));
		readButton.setBackground(new Color(0,0,255));
		readButton.setFont(new Font("����",Font.BOLD,20));
		readButton.addActionListener(this);
		
		saveButton = new Button("fileSave");
		saveButton.setSize(100,70);
		saveButton.setLocation(350, 400);
		saveButton.setForeground(new Color(255,255,255));
		saveButton.setBackground(new Color(0,0,255));
		saveButton.setFont(new Font("����",Font.BOLD,20));
		saveButton.addActionListener(this);
		
		f.setLayout(null);
		f.setSize(500, 500);
		f.add(ta);
		f.add(readButton);
		f.add(saveButton);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w){
				System.exit(0);
			}
		});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
