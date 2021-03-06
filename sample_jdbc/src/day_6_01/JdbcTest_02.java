package day_6_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcTest_02 {

	public static void main(String[] args) {
		
		String sql = "insert into dept values(?,?,?)";
		Scanner sc = null;
		
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		ResultSet rs = null;
		
		try {
			con = JdbcUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			sc = new Scanner(System.in);
			
//			ps.setString(1, sc.nextLine());
//			ps.setString(2, sc.nextLine());
//			ps.setString(3, sc.nextLine());

			ps.setString(1, args[0]);
			ps.setString(2, args[1]);
			ps.setString(3, args[2]);
			
			result = ps.executeUpdate();
			System.out.println(result+" rows ����");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, ps, con);
			sc.close();
		}
		
		
	}

}
