package day_5_27;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileTest {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File(""));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		File dir = new File("c:\\");
		String[] list = dir.list();
		File file = null;
		
		for(int i=0;i<list.length;i++){
			file = new File(dir,list[i]);
			System.out.print(file.getName()+"\t"+file.length());
			if(file.isDirectory()) System.out.println("<dir>");
			System.out.println();
		}
		
	}

}
