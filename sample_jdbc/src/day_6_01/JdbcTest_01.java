package day_6_01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest_01 {

	public static void main(String[] args) {
		
		String sql = "select deptno,dname,loc from dept";
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			con = JdbcUtil.getConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.print(rs.getString("deptno")+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\n");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e){
			System.out.println(e);
		} finally{
			JdbcUtil.close(rs, ps, con);
		}
		
		
		
	}

}
