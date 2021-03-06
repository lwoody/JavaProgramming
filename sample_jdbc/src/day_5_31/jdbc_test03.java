package day_5_31;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc_test03 {

	public static void main(String[] args) {
		
		//sql문을 변수바인딩으로 하기 - preparedstatement만 ? 가능 - ps 객체로 조정
		String sql = "select ename,sal,hiredate from emp "
				+ " where job like '%'||?||'%'";

		// 자원 반납하려면 밖에서 초기화 시켜주고 해야함
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		
		try {
			// 1. jdbc driver loading
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@70.12.114.93:1521:xe";
			String user = "scott";
			String pw = "tiger";

			// 2. db connection
			con = DriverManager.getConnection(url, user, pw);

			// 3. sql문 관리 객체 생성 = statement(보안상의 이유로 PreparedStatement 씀)
			ps = con.prepareStatement(sql);
			
			//? 처리
			ps.setString(1, args[0]);

			// 4. sql문 전송 후 실행
			rs = ps.executeQuery(); // rs에 결과 set이 들어와있음

			while (rs.next()) {
				System.out.print(rs.getString("ename") + "\t");
				System.out.print(rs.getString("sal") + "\t");
				System.out.print(rs.getDate("hiredate") + "\n");
			}

		} catch (ClassNotFoundException e) {
			System.out.println("driver check");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (ps != null)
					ps.close();
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("===main end===");
	}

}
