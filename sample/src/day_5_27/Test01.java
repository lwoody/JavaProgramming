package day_5_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
		//inputStreamReader
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String data = null;
		try {
			while((data = br.readLine())!=null){
				System.out.println("Read : "+data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("==Main end==");
		
	}

}
