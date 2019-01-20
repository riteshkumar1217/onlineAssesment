import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class database {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.getConnection("jdbc:odbc:localhost");
		String sql="select * from test_users limit 100";
		ResultSet r=c.createStatement().executeQuery(sql);
		String result=r.getMetaData().getColumnName(1);
		System.out.println(result);

	}

}
