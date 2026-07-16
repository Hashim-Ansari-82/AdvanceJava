package com.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Helper {

	private static String url="jdbc:mysql://localhost:3306/studentdb";
	private static String password="root";
	private static String username="root";
	
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, password,username);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
}
