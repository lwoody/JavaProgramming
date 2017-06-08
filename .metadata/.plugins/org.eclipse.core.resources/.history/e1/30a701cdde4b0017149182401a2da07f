package chat;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.*;

public class MyEcho {
	// socket

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("manual: java MyEcho hostname port");
			System.exit(0);
		}

		try {
			String host = args[0];
			int port = Integer.parseInt(args[1]);
			Socket s = new Socket(host, port);
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String msg = "", recMsg = "";
			while (true) {
				System.out.print("Data 입력:");
				msg = in.readLine();
				if (msg.length() == 0) {
					break;
				}
				bw.write(msg, 0, msg.length());
				bw.newLine();
				bw.flush();
				recMsg = br.readLine();
				System.out.print("되돌아온 Data: " + recMsg);
			}
			s.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
