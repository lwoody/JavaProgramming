package day_6_01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

//connection 관리 class ==> 서버환경으로 가면 Datasource로 바뀜
public class JdbcUtil {
	
	public static Connection getConnection(){
		Connection con = null;
		String file = "c://dbInfo.properties";
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(file));
			String driver = p.getProperty("driver");
			String url=p.getProperty("url");
			String user=p.getProperty("user");
			String pw=p.getProperty("pw");
			
			Class.forName(driver);
			
			con = DriverManager.getConnection(url,user,pw);
			 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("driver not found");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println(e);
		}
		
		return con;
	}
	
	public static void close(ResultSet rs, PreparedStatement ps, Connection con){
		try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
