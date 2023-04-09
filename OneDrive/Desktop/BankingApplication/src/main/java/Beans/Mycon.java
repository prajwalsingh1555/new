package Beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class Mycon {
	private Connection con;
	connectionBean cb = new connectionBean();
	public Connection getConn() {
		try {
		Class.forName(cb.getDriver());
		con = DriverManager.getConnection(cb.getDatabase_url(),cb.getRoot(),cb.getPass());
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		return con;
	}
}

	
