package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WooJaeProb_5_26{
	public static void main(String[] args){
		FileReader reader = null;
		FileWriter writer = null;
		BufferedReader bReader = null;
		BufferedWriter bWriter = null;
		
		try {
			reader = new FileReader(args[0]);
			writer = new FileWriter(args[1]);
			bReader = new BufferedReader(reader);
			bWriter = new BufferedWriter(writer);
			
			String data;
			int i=1;
			System.out.println("파일 복사 시작합니다.");
			while((data=bReader.readLine())!=null){
				if(data.equals("")){
					bWriter.newLine();
					continue;
				}
				bWriter.write(i+" : "+data);
				bWriter.newLine();
				i++;
			}
			System.out.println("파일 복사 종료");
			bWriter.flush();
			
		} catch (Exception e) {
			System.out.println("실행 시 인자 값을 아래와 같이 2 개를 입력하십시오.");
			System.out.println("[복사할 원본 파일] [복사될 파일]");
		}finally{
			try {
				if(reader!=null)reader.close();
				if(writer!=null)writer.close();
			} catch (IOException e) {
				
			}
		}
	}
}