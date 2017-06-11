package chatProgram;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Server {
	HashMap<String, DataOutputStream> clients;
	ArrayList<String> names;

	Server() {
		clients = new HashMap<String, DataOutputStream>();
		names = new ArrayList<>();
		names.add("2|");//index for names
		Map<String, DataOutputStream> synchronizedMap = Collections.synchronizedMap(clients);// thread ����ȭ
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
				names.add(name);
				sendToAll("--- " + name + " 님이 입장하셨습니다. ---");
				
				clients.put(name, out);
				System.out.println(clients.size() + " users");
				
				//refresh textArea, userlist(by sending message,userlist)
				while (in != null) {
					//userlist
					sendToAll(String.join("\n",names));
					//message
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				sendToAll("--- " + name + " 님이 퇴장하셨습니다. ---");
				names.remove(name);
				sendToAll(String.join("\n",names));
				clients.remove(name);
				System.out.println("" + clients.size() + "");
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
		new Server().start();
	}
}
