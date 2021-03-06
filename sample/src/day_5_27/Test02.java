package day_5_27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// test.txt File에 키보드로부터 입력받은 문자열을 저장
		Scanner sc = new Scanner(System.in);
		
		try (FileWriter fw = new FileWriter("c://javalecture/test.txt",true); // true면 기존 파일에 append임
				BufferedWriter bw = new BufferedWriter(fw);){
			System.out.println("저장할 문장을 입력하세요.");
			String s = sc.nextLine();
			bw.write(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		// reading
		try(FileReader fr = new FileReader("c://javalecture/test.txt");
				BufferedReader br = new BufferedReader(fr);){
			String data = null;
			while((data=br.readLine())!=null){
				System.out.println(data);
			}
			
		}catch (IOException e){
			e.printStackTrace();
		}
		
		System.out.println("====main end====");
		
	}

}
