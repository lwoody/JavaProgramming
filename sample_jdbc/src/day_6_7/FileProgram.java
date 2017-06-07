package day_6_7;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;

public class FileProgram {

	public static void main(String[] args) {
		FileGui gui = new FileGui();
	}

}

class FileGui extends Frame implements ActionListener {

	TextArea ta;
	Button readButton, saveButton;

	public FileGui() {

		ta = new TextArea("fda", 5, 20);
		ta.setSize(300, 500);
		ta.setLocation(10, 30);

		readButton = new Button("fileRead");
		readButton.setSize(100, 70);
		readButton.setLocation(350, 300);
		readButton.setForeground(new Color(255, 255, 255));
		readButton.setBackground(new Color(0, 0, 255));
		readButton.setFont(new Font("����", Font.BOLD, 20));
		readButton.addActionListener(this);

		saveButton = new Button("fileSave");
		saveButton.setSize(100, 70);
		saveButton.setLocation(350, 400);
		saveButton.setForeground(new Color(255, 255, 255));
		saveButton.setBackground(new Color(0, 0, 255));
		saveButton.setFont(new Font("����", Font.BOLD, 20));
		saveButton.addActionListener(this);

		this.setLayout(null);
		this.setSize(500, 500);

		this.add(ta);
		this.add(readButton);
		this.add(saveButton);
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		FileWriter fo = null;
		FileReader fr = null;
		BufferedWriter bo = null;
		BufferedReader br = null;
		
		if (e.getSource() == saveButton) {
			
			//file explorer pop up
			FileDialog fd = new FileDialog(this,"fileread",FileDialog.LOAD);
			fd.setVisible(true);
			String filePath = fd.getDirectory()+fd.getFile();
			
			try {
				fo = new FileWriter(filePath);
				bo = new BufferedWriter(fo);
				bo.write(ta.getText());
				bo.flush();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fo != null)
						fo.close();
					if (bo != null)
						bo.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		
		else if(e.getSource() == readButton){
			
			//file explorer pop up
			FileDialog fd = new FileDialog(this,"fileread",FileDialog.LOAD);
			fd.setVisible(true);
			String filePath = fd.getDirectory()+fd.getFile();
			
			try {
				fr = new FileReader(filePath);
				br = new BufferedReader(fr);
				String readData;
				String content="";
				while((readData=br.readLine())!=null){
					content+=readData+"\n";
				}
				ta.setText(content);
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					if (fr != null)
						fr.close();
					if (br != null)
						br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

	}

}
