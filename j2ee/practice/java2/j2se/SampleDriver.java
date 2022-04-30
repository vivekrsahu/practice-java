package practice.java2.j2se;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// all should be in same machine as it only accept data source name
public class SampleDriver {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
			connection = DriverManager.getConnection("jdbc:odbc:dataSourceName", "userName", "password");
			Statement statement = connection.createStatement();
			ResultSet results = statement.executeQuery("query goes here…");
			results.getString("columnName");
		} catch (ClassNotFoundException | SQLException exception) {
			exception.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException sqlException) {
				sqlException.printStackTrace();
			}
		}
	}
}
