package practice.java2.j2se;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class _3ExecuteQuery {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		_0LoadJDBCDriver.loadDriverApproach1(); // not required anymore
		Connection connection = _1GetConnection.getConnectionApproach2();
		executeQueryApproach1(connection);
		executeQueryApproach2(connection);
		executeQueryApproach3(connection);
		_1GetConnection.closeDatabaseConnection(connection);
	}
	/**
	 * For executing query with a simple statement object.
	 * @param 	connection
	 * @see		Statement#execute(String)
	 * @see		Statement#executeUpdate(String)
	 * @see		Statement#executeQuery(String)
	 */
	static void executeQueryApproach1(Connection connection) {
		Statement statement = _2CreateStatement.createSatementApproach1(connection);
		try {
			statement.execute("DDL query");
			statement.executeUpdate("DML query");
			statement.executeQuery("DRL query");
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	/**
	 * For executing query with an already prepared statement object.
	 * @param 	connection
	 * @see		PreparedStatement#execute()
	 * @see		PreparedStatement#executeUpdate()
	 * @see		PreparedStatement#executeQuery()
	 */
	static void executeQueryApproach2(Connection connection) {
		PreparedStatement preparedStatement = _2CreateStatement.createSatementApproach2(connection);
		try {
			preparedStatement.execute(); // for DDL
			preparedStatement.executeUpdate(); // for DML
			preparedStatement.executeQuery(); // for DRL
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
	/**
	 * For executing query with an already callable statement object.
	 * @param 	connection
	 * @see		CallableStatement#execute()
	 * @see		CallableStatement#executeUpdate()
	 * @see		CallableStatement#executeQuery()
	 */
	static void executeQueryApproach3(Connection connection) {
		CallableStatement callableStatement = _2CreateStatement.createSatementApproach3(connection);
		try {
			callableStatement.execute(); // for DDL
			callableStatement.executeUpdate(); // for DML
			callableStatement.executeQuery(); // for DRL
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}
	}
}
