package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create {

	public static void main(String[] args) throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/jdbc_db";
		String pass="root";
		String userName="root";
		
		Connection con=DriverManager.getConnection(url,pass,userName);

		String query="create table img(name varchar(40),photo Blob)";
		PreparedStatement st=con.prepareStatement(query);
		st.executeUpdate();
		System.out.println("Table is created");
		con.close();
		 
	}
}
