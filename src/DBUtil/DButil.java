package DBUtil;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DButil {
	public static String driver = null ;
	public static String url = null ;
	public static String username = null ;
	public static String password = null ;
	
	static {
		try {
					Properties pt = new Properties();
			      // 使用InPutStream流读取properties文件
			 	  FileInputStream fis = new FileInputStream("D:\\workspace\\user\\src\\db.properties");
			      //BufferedReader bufferedReader = new BufferedReader(new FileReader("db.properties"));
			      pt.load(fis);
			      // 获取key对应的value值
			      driver = pt.getProperty("driver");
			      url = pt.getProperty("url");
			      username = pt.getProperty("username");
			      password = pt.getProperty("password");
			      
			      Class.forName(driver);
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() throws SQLException{
		System.out.println(driver +"-->" + url + "" + username + "" + password);
		Connection connection = DriverManager.getConnection(url , username , password);
		return connection ;
	}
	
}
