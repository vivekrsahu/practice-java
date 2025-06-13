package practice.java2.j2se;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/**
 * Since JDK 1.6, loading driver is handled internally by the JVM, so it was
 * not required anymore and hence loadable drivers like JdbcOdbcDriver etc.
 * were completely removed since JDK 1.8<br>
 */
@Deprecated
public class _0LoadJDBCDriver {
	public static void main(String[] args) {
		loadDriverApproach1();
//		loadDriverApproach2();
//		loadDriverApproach3();
		getDrivers();
	}
	/**
	 * For loading driver by using Class.forName approach.
	 */
	static void loadDriverApproach1() {
		try {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
	/**
	 * For loading driver by using DriverManager.registerDriver approach.
	 * 
	 */
//	static void loadDriverApproach2() {
//		Driver driver = new JdbcOdbcDriver();
//		try {
//			DriverManager.registerDriver(driver);
//		} catch (SQLException sqlException) {}
//	}
	/**
	 * For loading driver by passing runtime command through terminal.
	 * 
	 */
//	static void loadDriverApproach3() {
		// by passing command during runtime as java –Djdbc.drivers="driverImplementation" appName
		// i.e., run as java –Djdbc.drivers="sun.jdbc.odbc.JdbcOdbcDriver" LoadJDBCDriver through terminal
//	}
	static void getDrivers() {
		Enumeration<Driver> enumeration = DriverManager.getDrivers();
		while(enumeration.hasMoreElements()) {
			Driver d = enumeration.nextElement();
			System.out.println(d.getClass().getName());
		}
	}
}
