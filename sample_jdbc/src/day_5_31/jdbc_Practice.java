package day_5_31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_Practice {

	public static void main(String[] args) {
		String sql = "select ename,sal,job from emp where sal > ?";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// 1. jdbc load
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@70.12.114.93:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			//2. db connection
			con = DriverManager.getConnection(url,user,pw);
			
			//3. preparedstatement create
			ps = con.prepareStatement(sql);
			ps.setString(1, args[0]);//1��° args�� ������
			
			//4. resultset
			rs = ps.executeQuery();

			
			//5.handling
			while(rs.next()){
				System.out.print(rs.getString("ename")+"\t");
				System.out.print(rs.getString("sal")+"\t");
				System.out.print(rs.getString("job")+"\n");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			
				try {
					if(con!=null)con.close();
					if(ps!=null)ps.close();
					if(rs!=null)rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}

}
