package day_6_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTemplate {

	public static void main(String[] args) {
		
		String sql = "insert into dept values(?,?,?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		ResultSet rs = null;
		
		try {
			con = JdbcUtil.getConnection();
			ps = con.prepareStatement(sql);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, ps, con);
		}
		
		
	}

}
