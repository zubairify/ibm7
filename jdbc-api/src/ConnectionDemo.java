import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;


public class ConnectionDemo {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ibm7";
		
		try {
			DriverManager.registerDriver(new Driver());
			Connection conn = DriverManager.getConnection(url, "zubair", "oracle");
			System.out.println("Connection successful");
			
			DatabaseMetaData meta = conn.getMetaData();
			System.out.println("DB Name: " + meta.getDatabaseProductName());
			System.out.println("DB Ver: " + meta.getDatabaseProductVersion());
			System.out.println("Driver Name: " + meta.getDriverName());
			System.out.println("Driver Ver: " + meta.getDriverVersion());
			
		} catch (SQLException e) {
			System.out.println("Connection failed!");
			e.printStackTrace();
		}
	}
}
