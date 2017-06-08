package URLProgramming;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class URLInputStream {

	public static void main(String[] args) {
		try {
			URL obj = new URL(args[0]);
			DataInputStream in = new DataInputStream(obj.openStream());
			String inputLine;
			while((inputLine = in.readLine())!=null){
				System.out.println(inputLine);
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
