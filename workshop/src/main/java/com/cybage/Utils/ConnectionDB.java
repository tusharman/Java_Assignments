package com.cybage.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDB {

	private static Connection connection;

	public static Connection fetchDBConnection() throws ClassNotFoundException, SQLException {
		if (connection == null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDB" ,"root","12345");
		}
		return connection;
	}

}
