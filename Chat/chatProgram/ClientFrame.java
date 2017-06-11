package chatProgram;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;

public class ClientFrame extends JFrame implements ActionListener {

	JTextField textInput;
	JButton sendButton;
	JTextArea content;
	ClientSender sender;
	ClientReceiver receiver;
	String userName;
	JTextArea userList;

	public ClientFrame(String userName) {
		getContentPane().setLayout(null);
		this.userName = userName;

		this.setSize(400, 500);

		textInput = new JTextField();
		textInput.setBounds(6, 430, 203, 42);
		getContentPane().add(textInput);

		sendButton = new JButton("send");
		sendButton.setBounds(206, 430, 66, 42);
		getContentPane().add(sendButton);
		sendButton.addActionListener(this);

		// add scrollbar(textarea surround with)
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 32, 260, 392);
		getContentPane().add(scrollPane);

		content = new JTextArea();
		scrollPane.setViewportView(content);
		content.setLineWrap(true);
		content.setWrapStyleWord(true);
		content.setEditable(false);

		JLabel roomTitleLabel = new JLabel("room title");
		roomTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roomTitleLabel.setBounds(84, 6, 110, 26);
		getContentPane().add(roomTitleLabel);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(278, 32, 113, 180);
		getContentPane().add(scrollPane_1);

		userList = new JTextArea();
		userList.setWrapStyleWord(true);
		userList.setLineWrap(true);
		scrollPane_1.setViewportView(userList);
		userList.setEditable(false);

		JLabel lblUser = new JLabel("User");
		lblUser.setHorizontalAlignment(SwingConstants.CENTER);
		lblUser.setBounds(301, 6, 66, 26);
		getContentPane().add(lblUser);

		JButton loginButton = new JButton("logout");
		loginButton.setBounds(274, 248, 117, 26);
		getContentPane().add(loginButton);

		JLabel idLabel = new JLabel(userName); // show current id in label
		idLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idLabel.setBounds(324, 224, 61, 16);
		getContentPane().add(idLabel);

		JLabel lblNewLabel_1 = new JLabel("ID   :");
		lblNewLabel_1.setBounds(282, 224, 30, 16);
		getContentPane().add(lblNewLabel_1);

		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent w) {
				System.exit(0);
			}
		});

		// apply enter key
		textInput.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e) {
				char keyCode = e.getKeyChar();
				if (keyCode == KeyEvent.VK_ENTER) {
					sender.send(textInput.getText());
					textInput.setText("");
				}
			}
		});

		// client create
		String serverIp = "192.168.0.4";
		try {
			Socket socket = new Socket(serverIp, 7999);
			System.out.println("connected with server!");

			// message sending object
			sender = new ClientSender(socket);

			// message receiving thread
			receiver = new ClientReceiver(socket);
			Thread treceiver = new Thread(receiver);

			treceiver.start();

		} catch (UnknownHostException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.sendButton) {
			sender.send(textInput.getText());
			textInput.setText("");
		}
	}

	// message sending object

	class ClientSender {
		Socket socket;
		DataOutputStream out;

		ClientSender(Socket socket) {
			this.socket = socket;
			try {
				this.out = new DataOutputStream(socket.getOutputStream());
				if (out != null) {
					out.writeUTF(userName);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void send(String message) {

			try {
				if (out != null) {
					out.writeUTF("[" + userName + "]" + message);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	// print message in content
	public void setMessage(String message) {
		this.content.append(message);
		this.content.append("\n");
	}

	// print usernames in userlist
	public void setUsers(String name) {
		this.userList.setText(name);
	}

	// message receiving object
	class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;

		ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			while (in != null) {
				try {
					String temp = in.readUTF();
					// userlist refresh
					if (temp.contains("2|")) {
						ClientFrame.this.setUsers("");
						ClientFrame.this.setUsers(temp.substring(3));
					} // refresh textarea
					else {
						ClientFrame.this.setMessage(temp);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		// type username
		String userName = "none";
		Scanner sc = new Scanner(System.in);
		userName = sc.nextLine();
		sc.close();
		// client execute
		new ClientFrame(userName);
	}
}
