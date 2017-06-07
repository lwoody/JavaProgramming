package day_6_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest04 {

	public static void main(String[] args) {
		
		String sql = "update dept set dname = ? where dname = ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		ResultSet rs = null;
		
		try {
			con = JdbcUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setString(1, args[0]);
			ps.setString(2, args[1]);
			
			result = ps.executeUpdate();
			System.out.println(result+"update complete");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, ps, con);
		}
		
		
	}

}
