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
			System.out.println("���� ���� �����մϴ�.");
			while((data=bReader.readLine())!=null){
				if(data.equals("")){
					bWriter.newLine();
					continue;
				}
				bWriter.write(i+" : "+data);
				bWriter.newLine();
				i++;
			}
			System.out.println("���� ���� ����");
			bWriter.flush();
			
		} catch (Exception e) {
			System.out.println("���� �� ���� ���� �Ʒ��� ���� 2 ���� �Է��Ͻʽÿ�.");
			System.out.println("[������ ���� ����] [����� ����]");
		}finally{
			try {
				if(reader!=null)reader.close();
				if(writer!=null)writer.close();
			} catch (IOException e) {
				
			}
		}
	}
}