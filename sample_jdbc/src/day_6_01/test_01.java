package day_6_01;
import java.sql.Connection;

import javax.sql.DataSource;

public class test_01 {
	public static void main(String[] args){
		Connection con = JdbcUtil.getConnection();
		
		System.out.println(con);
		JdbcUtil.close(null, null, con);
		
		
//		Connection dataSource = DataSource.getConnection();
//		NamedParameterJdbcOperations jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
}