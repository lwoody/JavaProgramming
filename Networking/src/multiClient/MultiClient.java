package multiClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MultiClient {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("check manual..");
			System.exit(0);
		}

		String serverIp = "70.12.114.90";//특정 서버 ip (여기에 데이터 공유하게됨)
		try {
			Socket socket = new Socket(serverIp, 7999);
			System.out.println("connected with server!");
			Thread sender = new Thread(new ClientSender(socket, args[0]));//args[0]은 id(name)
			Thread receiver = new Thread(new ClientReceiver(socket));

			sender.start();
			receiver.start();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;

		ClientSender(Socket socket, String name) {
			this.socket = socket;
			try {
				out = new DataOutputStream(socket.getOutputStream());
				this.name = name;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			Scanner sc = new Scanner(System.in);

			try {
				if (out != null) {
					out.writeUTF(name);
				}
				while (out != null) {
					out.writeUTF("[" + name + "]" + sc.nextLine());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	static class ClientReceiver extends Thread {
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
					System.out.println(in.readUTF());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
