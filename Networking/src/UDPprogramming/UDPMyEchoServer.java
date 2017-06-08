package UDPprogramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPMyEchoServer {

	final int MAXBUFFER = 512; // temporary room size

	public static void main(String[] args) {
		int arg_port = Integer.parseInt(args[0]); // port number
		new UDPMyEchoServer().work(arg_port);
	}

	void work(int arg_port) {
		int port = arg_port;// get current port number
		byte buffer[] = new byte[MAXBUFFER];
		try {
			DatagramSocket socket = new DatagramSocket(port);
			DatagramPacket recv_packet;
			System.out.println("running the server...");
			
			while(true){
				recv_packet = new DatagramPacket(buffer,buffer.length);
				socket.receive(recv_packet);
				DatagramPacket send_packet = new DatagramPacket(recv_packet.getData(),recv_packet.getLength()
						,recv_packet.getAddress(),recv_packet.getPort());
				socket.send(send_packet);
			}

		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
