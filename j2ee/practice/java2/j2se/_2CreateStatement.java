package practice.java2.j2se;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class _2CreateStatement {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		_0LoadJDBCDriver.loadDriverApproach1(); // not required anymore
		Connection connection = _1GetConnection.getConnectionApproach2();
		Statement statement = createSatementApproach1(connection);
		System.out.println(statement);
		_1GetConnection.closeDatabaseConnection(connection);
	}
	/**
	 * For creating a simple statement object.
	 * 
	 * @param 	connection
	 * @return	{@link Statement} object
	 * @see		Connection#createStatement()
	 */
	static Statement createSatementApproach1(Connection connection) {
		try {
			return connection.createStatement();
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;
	}
	/**
	 * For creating a prepared statement object i.e., prepared with sql query.
	 * 
	 * @param 	connection
	 * @return	{@link PreparedStatement} object
	 * @see		Connection#prepareStatement(String)
	 */
	static PreparedStatement createSatementApproach2(Connection connection) {
		try {
			return connection.prepareStatement("sql query goes here...");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;
	}
	/**
	 * For creating a prepared call i.e., prepared with sql query.
	 * 
	 * @param 	connection
	 * @return	{@link CallableStatement} object
	 * @see		Connection#prepareCall(String)
	 */
	static CallableStatement createSatementApproach3(Connection connection) {
		try {
			return connection.prepareCall("sql query goes here...");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return null;
	}
}
