package DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class execute {

	static DButil db = new DButil();
	
	//执行查询语句
	public static ResultSet executeQuery(String sql , Object ...obj) throws SQLException{
		Connection connection = db.getConnection();
		System.out.println(connection);
		PreparedStatement pstmt = connection.prepareStatement(sql);
		for(int i = 0 ; i < obj.length ; i ++ ){
			pstmt.setObject(i+1 , obj[i]);
		}
		ResultSet rs = pstmt.executeQuery();
		return rs ; 
	}

	//执行增删改语句
	public static int executeUpdate(String sql , Object ...obj) throws SQLException{
		Connection connection = db.getConnection();
		System.out.println(connection);
		PreparedStatement pstmt = connection.prepareStatement(sql);
		for(int i = 0 ; i < obj.length ; i ++ ){
			pstmt.setObject(i+1 , obj[i]);
		}
		int result = pstmt.executeUpdate();
		return result ; 
	}
}
