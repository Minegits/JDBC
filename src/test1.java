import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import DBUtil.DButil;
import DBUtil.execute;

public class test1 {

	@Test
	public void test() throws SQLException {
			DButil db = new DButil();
			System.out.println(db.getConnection());
	}

}
