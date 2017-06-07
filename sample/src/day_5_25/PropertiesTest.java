package day_5_25;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
	public static void main(String[] args) throws IOException{
		Properties p = new Properties();
		p.load(new FileInputStream("dbInfo.properties"));
		System.out.println(p.get("url"));
	}
}
