package chatProgram;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ClientFrame extends JFrame implements ActionListener {

	JTextField textInput;
	JButton sendButton;
	JTextArea content;
	ClientSender sender;
	ClientReceiver receiver;
	String userName;

	public ClientFrame(String userName) {
		getContentPane().setLayout(null);
		this.userName = userName;

		this.setSize(500, 500);

		textInput = new JTextField();
		textInput.setBounds(19, 246, 130, 26);
		getContentPane().add(textInput);
		textInput.setColumns(10);

		sendButton = new JButton("send");
		sendButton.setBounds(165, 246, 117, 29);
		getContentPane().add(sendButton);
		sendButton.addActionListener(this);

		content = new JTextArea();
		content.setBounds(19, 29, 130, 205);
		getContentPane().add(content);

		JLabel roomTitleLabel = new JLabel("room title");
		roomTitleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		roomTitleLabel.setBounds(28, 6, 103, 16);
		getContentPane().add(roomTitleLabel);

		this.setVisible(true);

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

	public void setMessage(String message) {
		this.content.append(message);
		this.content.append("\n");
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
					ClientFrame.this.setMessage(in.readUTF());//refresh textarea
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
