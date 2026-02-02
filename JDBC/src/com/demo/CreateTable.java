package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/demo";
		String pass="root";
		String username="root";
		String tableName="Create table Student(Rollno int primary Key,name varchar(20),age int not null)";
		Connection con = DriverManager.getConnection(url,pass,username);
		PreparedStatement statement = con.prepareStatement(tableName);
		statement.executeUpdate();
		System.out.println("Table created Successfully");
		
	}
}
