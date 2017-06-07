package day_5_27;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class RandomAccess {

	public static void main(String[] args) {
		
		try {
			RandomAccessFile raf = new RandomAccessFile("abc.dat","rw");
			String msg = "fdsafdasfdsafdfdsaff";
			
			raf.writeBytes(msg);
			raf.seek(0);
			String data=null;
			while((data=raf.readLine())!=null){
				System.out.println(data);
			}
			System.out.println("-------------");
			raf.seek(raf.length());
			msg = "\neeeeeeeee";
			raf.writeBytes(msg);
			raf.seek(10);
			while((data=raf.readLine())!=null){
				System.out.println(data);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
