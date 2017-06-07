package day_5_26;

//inputstream -> reader
//outputstream -> writer
//byte[]   char[]

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Filecopy4_reader_writer {

	public static void main(String[] args) {

		FileReader fis = null;
		FileWriter fos = null;
		BufferedReader bis = null;
		BufferedWriter bos = null;

		long start = 0;
		long end = 0;

		try {
			fis = new FileReader(args[0]); // �������
			fos = new FileWriter(args[1],true);// ������
			
			bis = new BufferedReader(fis);
			bos = new BufferedWriter(fos);
			
			start = System.currentTimeMillis();
			System.out.println("���� ���� �����մϴ�.");

			SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String date = f.format(new Date());
			bos.write("copy�� �ð����� : "+date);
			bos.newLine();
			
			int readData=0;
			while((readData=bis.read())!=-1){
				bos.write(readData);
			}
			
			end = System.currentTimeMillis();
			
			System.out.println("���� ���� ����");
			System.out.println("����ð� : "+(end-start));
			
			bos.flush();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (Exception e) {

			}
		}

	}

}
