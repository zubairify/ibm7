import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	public static void main(String[] args) {
		
		String sql = "insert into person values ('Neil', 22, 'Nagpur')";
		
		try {
			Connection conn = JdbcFactory.getConnection();
			Statement stmt = conn.createStatement();
			// Executing SQL query
			stmt.executeUpdate(sql);	
			System.out.println("Record inserted.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
