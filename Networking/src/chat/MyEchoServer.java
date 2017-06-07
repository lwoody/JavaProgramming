package chat;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MyEchoServer {
	//sever socket + accept �ʿ�
	
	public static void main(String[] args){
		if(args.length !=1){
			System.out.println("maual : java MyEchoServer port");
			System.exit(0);
		}
		
		try {
			ServerSocket ss = new ServerSocket(Integer.parseInt(args[0]));//sever socket object
			Socket s = ss.accept();// accept object
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			BufferedInputStream bis = new BufferedInputStream(in);
			BufferedOutputStream bos = new BufferedOutputStream(out);
			
			int b;
			while(true){
				b = bis.read();
				if(b==-1) break;
				bos.write(b);
			}
			bos.flush();
			ss.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
