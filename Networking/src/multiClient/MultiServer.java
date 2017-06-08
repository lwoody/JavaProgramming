package multiClient;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MultiServer {

	HashMap clients;

	MultiServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);// thread 동기화
	}

	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;

		try {
			serverSocket = new ServerSocket(7999);//port
			System.out.println("server running... ");

			while (true) {
				socket = serverSocket.accept();
				ServerReceiver recieverThread = new ServerReceiver(socket);
				recieverThread.start();

			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;

		public ServerReceiver(Socket socket) {

			try {
				this.socket = socket;
				this.in = new DataInputStream(socket.getInputStream());
				this.out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll("#" + name + "님이 들어왔습니다.");

				clients.put(name, out);
				System.out.println("현재 서버 접속자 수는" + clients.size() + "명 입니다.");

				while (in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendToAll("#" + name + "이 나갔습니다.");
				clients.remove(name);
				System.out.println("현재 접속자 수는 " + clients.size() + "명 입니다.");
			}

		}
	}

	public void sendToAll(String msg) {

		Iterator it = clients.keySet().iterator();

		while (it.hasNext()) {

			DataOutputStream out = (DataOutputStream) clients.get(it.next());

			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new MultiServer().start();
	}

}
