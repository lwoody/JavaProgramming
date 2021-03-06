package day_6_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest_03 {

	public static void main(String[] args) {
		
		String sql = "delete from dept where deptno=?";
		
		Connection con = null;
		PreparedStatement ps = null;
		int result =0;
		ResultSet rs = null;
		
		try {
			con = JdbcUtil.getConnection();
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, Integer.parseInt(args[0]));
			result = ps.executeUpdate();
			System.out.println(result+" delete complete");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs, ps, con);
		}
		
		
	}

}
