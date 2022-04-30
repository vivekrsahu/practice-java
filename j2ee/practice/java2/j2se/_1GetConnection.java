package practice.java2.j2se;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class _1GetConnection {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		_0LoadJDBCDriver.loadDriverApproach1(); // not required anymore
		Connection connection 
							= getConnectionApproach2();
//		 					= getConnectionApproach1();
//		 					= getConnectionApproach3();
		System.out.println(connection); // sun.jdbc.odbc.JdbcOdbcConnection@ab97e3 (invalid since JDK 1.8)
		closeDatabaseConnection(connection);
	}
	/** 
	 * No authentication required to connect to databases like MS Access etc.
	 * @return	connection
	 * @see	DriverManager#getConnection(String)
	 */
//	static Connection getConnectionApproach1() {
//		try {
//			return DriverManager.getConnection("url");
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
//		return null;
//	}
	/** 
	 * Authentication (hardcoded inside code) required to connect to databases like oracle etc.<br>
	 * @return	connection
	 * @see	DriverManager#getConnection(String, String, String)
	 */
	static Connection getConnectionApproach2() {
		try {
			// ds is the data source name created inside odbc application
			return DriverManager.getConnection("jdbc:odbc:ds", "username", "password");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;
	}
	/** 
	 * Authentication (set dynamically using properties file) required 
	 * to connect to databases like oracle etc.<br>
	 * @return	connection
	 * @see	DriverManager#getConnection(String, java.util.Properties)
	 */
//	static Connection getConnectionApproach3() {
//		Properties properties = new Properties();
//		try {
//			properties.load(new FileInputStream("/Users/vivek_sahu01/Workspace/Practice/src/com/practice/java2/j2se/credentials.properties"));
//		} catch (IOException ioe) {
//			ioe.printStackTrace();
//		}
//		try {
//			return DriverManager.getConnection("url", properties);
//		} catch (SQLException sqle) {
//			sqle.printStackTrace();
//		}
//		return null;
//	}
	static void closeDatabaseConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
