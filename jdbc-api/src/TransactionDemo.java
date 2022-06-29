import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionDemo {

	public static void main(String[] args) {
		String sql1 = "insert into person values ('Drek', 42, 'Delhi')";
		String sql2 = "update person set age=22 where name='Polo'";
		String sql3 = "delete from person where nam='Frank'";
		Connection conn = null;
		
		try {
			conn = JdbcFactory.getConnection();
			conn.setAutoCommit(false);	// Setting auto-commit off
			
			Statement stmt = conn.createStatement();
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			
			stmt.executeBatch();
			conn.commit();	// Commit: Only when all the statements executes successfully
			System.out.println("Transaction completed");
		} catch (SQLException e) {
			System.out.println("Transaction failed due to...");
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
